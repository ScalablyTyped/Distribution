package typings
package appDashBuilderDashLibLib.outCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSpecificOptions extends js.Object {
  /**
    The [artifact file name template](/configuration/configuration#artifact-file-name-template).
    */
  val artifactName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var publish: js.UndefOr[builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish] = js.undefined
}

object TargetSpecificOptions {
  @scala.inline
  def apply(
    artifactName: java.lang.String = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null
  ): TargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetSpecificOptions]
  }
}

