package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppearTransition extends js.Object {
  var appearTransition: Boolean
  var percent: Double
  var position: String
  var prefixCls: String
  var unfilled: Boolean
}

object AnonAppearTransition {
  @scala.inline
  def apply(appearTransition: Boolean, percent: Double, position: String, prefixCls: String, unfilled: Boolean): AnonAppearTransition = {
    val __obj = js.Dynamic.literal(appearTransition = appearTransition.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], unfilled = unfilled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAppearTransition]
  }
}

