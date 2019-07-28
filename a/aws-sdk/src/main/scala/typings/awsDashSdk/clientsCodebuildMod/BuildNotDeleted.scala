package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildNotDeleted extends js.Object {
  /**
    * The ID of the build that could not be successfully deleted.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Additional information about the build that could not be successfully deleted.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}

object BuildNotDeleted {
  @scala.inline
  def apply(id: NonEmptyString = null, statusCode: String = null): BuildNotDeleted = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[BuildNotDeleted]
  }
}

