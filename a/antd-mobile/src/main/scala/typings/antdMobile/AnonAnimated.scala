package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimated extends js.Object {
  var animated: Boolean
  var animationType: String
  var closable: Boolean
  var footer: js.Array[scala.Nothing]
  var operation: Boolean
  var platform: String
  var popup: Boolean
  var prefixCls: String
  var transparent: Boolean
  def onShow(): Unit
}

object AnonAnimated {
  @scala.inline
  def apply(
    animated: Boolean,
    animationType: String,
    closable: Boolean,
    footer: js.Array[scala.Nothing],
    onShow: () => Unit,
    operation: Boolean,
    platform: String,
    popup: Boolean,
    prefixCls: String,
    transparent: Boolean
  ): AnonAnimated = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], onShow = js.Any.fromFunction0(onShow), operation = operation.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimated]
  }
}

