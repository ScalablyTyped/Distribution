package typings.appDashBuilderDashLib.outOptionsLinuxOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.ask
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.doNotAsk
import typings.appDashBuilderDashLib.outCoreMod.TargetSpecificOptions
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppImageOptions
  extends CommonLinuxOptions
     with TargetSpecificOptions {
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). Only plain text is supported.
    */
  val license: js.UndefOr[String | Null] = js.undefined
  /**
    * The system integration installation.
    * @default ask
    */
  val systemIntegration: js.UndefOr[ask | doNotAsk] = js.undefined
}

object AppImageOptions {
  @scala.inline
  def apply(
    artifactName: String = null,
    category: String = null,
    description: String = null,
    desktop: js.Any = null,
    license: String = null,
    mimeTypes: js.Array[String] = null,
    publish: Publish = null,
    synopsis: String = null,
    systemIntegration: ask | doNotAsk = null
  ): AppImageOptions = {
    val __obj = js.Dynamic.literal()
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (category != null) __obj.updateDynamic("category")(category)
    if (description != null) __obj.updateDynamic("description")(description)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (license != null) __obj.updateDynamic("license")(license)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis)
    if (systemIntegration != null) __obj.updateDynamic("systemIntegration")(systemIntegration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppImageOptions]
  }
}

