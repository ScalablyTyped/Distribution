package typings.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSpecificOptions extends js.Object {
  /**
    The [artifact file name template](/configuration/configuration#artifact-file-name-template).
    */
  val artifactName: js.UndefOr[String | Null] = js.undefined
  var publish: js.UndefOr[Publish] = js.undefined
}

object TargetSpecificOptions {
  @scala.inline
  def apply(
    artifactName: js.UndefOr[Null | String] = js.undefined,
    publish: js.UndefOr[Null | Publish] = js.undefined
  ): TargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetSpecificOptions]
  }
}

