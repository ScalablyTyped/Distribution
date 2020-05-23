package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AUDKRW extends js.Object {
  var AUD: js.Array[String]
  var KRW: js.Array[String]
  var USD: js.Array[String]
  var XXX: js.Array[scala.Nothing]
}

object AUDKRW {
  @scala.inline
  def apply(AUD: js.Array[String], KRW: js.Array[String], USD: js.Array[String], XXX: js.Array[scala.Nothing]): AUDKRW = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDKRW]
  }
}

