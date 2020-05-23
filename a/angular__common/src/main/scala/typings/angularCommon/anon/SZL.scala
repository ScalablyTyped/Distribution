package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SZL extends js.Object {
  var JPY: js.Array[String]
  var SZL: js.Array[String]
  var USD: js.Array[String]
}

object SZL {
  @scala.inline
  def apply(JPY: js.Array[String], SZL: js.Array[String], USD: js.Array[String]): SZL = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SZL = SZL.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SZL]
  }
}

