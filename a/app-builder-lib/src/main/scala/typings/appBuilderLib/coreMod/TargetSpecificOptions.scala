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
  def apply(artifactName: String = null, publish: Publish = null): TargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetSpecificOptions]
  }
}

