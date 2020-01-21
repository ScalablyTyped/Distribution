package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessFailureOptions
  extends SuccessOption
     with ErrorOption

object SuccessFailureOptions {
  @scala.inline
  def apply(error: js.Function = null, success: js.Function = null): SuccessFailureOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessFailureOptions]
  }
}

