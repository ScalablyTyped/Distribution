package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placement extends js.Object {
  var align: Overflow
  var placement: String
  var prefixCls: String
  var trigger: js.Array[String]
}

object Placement {
  @scala.inline
  def apply(align: Overflow, placement: String, prefixCls: String, trigger: js.Array[String]): Placement = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
}

