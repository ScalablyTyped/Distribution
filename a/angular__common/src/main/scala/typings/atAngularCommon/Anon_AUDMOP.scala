package typings.atAngularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUDMOP extends js.Object {
  var AUD: js.Array[String]
  var MOP: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var USD: js.Array[String]
}

object Anon_AUDMOP {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    MOP: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    USD: js.Array[String]
  ): Anon_AUDMOP = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], MOP = MOP.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AUDMOP]
  }
}

