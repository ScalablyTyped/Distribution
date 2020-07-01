package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessFailOptions extends js.Object {
  /** A callback that executes when the operation has an error. */
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.undefined
  /** A callback that executes when the operation completes successfully. */
  val success: js.UndefOr[SuccessFailCallback[js.Array[js.Any]]] = js.undefined
}

object SuccessFailOptions {
  @scala.inline
  def apply(failure: js.Array[String] => Unit = null, success: js.Array[js.Any] => Unit = null): SuccessFailOptions = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction1(failure))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SuccessFailOptions]
  }
}

