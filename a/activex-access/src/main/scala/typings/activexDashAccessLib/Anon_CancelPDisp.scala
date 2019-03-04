package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelPDisp extends js.Object {
  var Cancel: scala.Boolean
  val StatusCode: js.Any
  val TargetFrameName: java.lang.String | scala.Null
  val URL: java.lang.String
  val pDisp: js.Any
}

object Anon_CancelPDisp {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    StatusCode: js.Any,
    URL: java.lang.String,
    pDisp: js.Any,
    TargetFrameName: java.lang.String = null
  ): Anon_CancelPDisp = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, StatusCode = StatusCode, URL = URL, pDisp = pDisp)
    if (TargetFrameName != null) __obj.updateDynamic("TargetFrameName")(TargetFrameName)
    __obj.asInstanceOf[Anon_CancelPDisp]
  }
}

