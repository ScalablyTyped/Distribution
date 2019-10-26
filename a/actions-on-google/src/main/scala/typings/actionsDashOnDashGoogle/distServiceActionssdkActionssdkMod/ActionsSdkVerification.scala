package typings.actionsDashOnDashGoogle.distServiceActionssdkActionssdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsSdkVerification extends js.Object {
  /**
    * Custom error message as a string or a function that returns a string
    * given the original error message set by the library.
    *
    * The message will get sent back in the JSON top level `error` property.
    * @public
    */
  var error: js.UndefOr[String | (js.Function1[/* error */ String, String])] = js.undefined
  /**
    * Google Cloud Project ID for the Assistant app.
    * @public
    */
  var project: String
  /**
    * Custom status code to return on verification error.
    * @public
    */
  var status: js.UndefOr[Double] = js.undefined
}

object ActionsSdkVerification {
  @scala.inline
  def apply(
    project: String,
    error: String | (js.Function1[/* error */ String, String]) = null,
    status: Int | Double = null
  ): ActionsSdkVerification = {
    val __obj = js.Dynamic.literal(project = project)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSdkVerification]
  }
}

