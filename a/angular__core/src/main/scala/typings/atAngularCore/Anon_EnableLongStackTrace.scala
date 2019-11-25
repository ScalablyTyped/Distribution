package typings.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableLongStackTrace extends js.Object {
  var enableLongStackTrace: js.UndefOr[Boolean] = js.undefined
}

object Anon_EnableLongStackTrace {
  @scala.inline
  def apply(enableLongStackTrace: js.UndefOr[Boolean] = js.undefined): Anon_EnableLongStackTrace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableLongStackTrace)) __obj.updateDynamic("enableLongStackTrace")(enableLongStackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnableLongStackTrace]
  }
}

