package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignPlacement extends js.Object {
  var align: AnonOverflow
  var placement: String
  var prefixCls: String
  var trigger: js.Array[String]
}

object AnonAlignPlacement {
  @scala.inline
  def apply(align: AnonOverflow, placement: String, prefixCls: String, trigger: js.Array[String]): AnonAlignPlacement = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlignPlacement]
  }
}

