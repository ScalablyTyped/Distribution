package typings.activexDashAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelPDisp extends js.Object {
  var Cancel: Boolean
  val StatusCode: js.Any
  val TargetFrameName: String | Null
  val URL: String
  val pDisp: js.Any
}

object Anon_CancelPDisp {
  @scala.inline
  def apply(Cancel: Boolean, StatusCode: js.Any, URL: String, pDisp: js.Any, TargetFrameName: String = null): Anon_CancelPDisp = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    if (TargetFrameName != null) __obj.updateDynamic("TargetFrameName")(TargetFrameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CancelPDisp]
  }
}

