package typings
package appDashBuilderDashLibLib.outOptionsLinuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait AppImageOptions extends CommonLinuxOptions {
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). Only plain text is supported.
    */
  val license: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The system integration installation.
    * @default ask
    */
  val systemIntegration: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.ask | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.doNotAsk
  ] = js.undefined
}

object AppImageOptions {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    description: java.lang.String = null,
    desktop: js.Any = null,
    license: java.lang.String = null,
    mimeTypes: js.Array[java.lang.String] = null,
    synopsis: java.lang.String = null,
    systemIntegration: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.ask | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.doNotAsk = null
  ): AppImageOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (description != null) __obj.updateDynamic("description")(description)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (license != null) __obj.updateDynamic("license")(license)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis)
    if (systemIntegration != null) __obj.updateDynamic("systemIntegration")(systemIntegration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppImageOptions]
  }
}

