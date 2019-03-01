package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableLongStackTrace extends js.Object {
  var enableLongStackTrace: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EnableLongStackTrace {
  @scala.inline
  def apply(enableLongStackTrace: js.UndefOr[scala.Boolean] = js.undefined): Anon_EnableLongStackTrace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableLongStackTrace)) __obj.updateDynamic("enableLongStackTrace")(enableLongStackTrace)
    __obj.asInstanceOf[Anon_EnableLongStackTrace]
  }
}

