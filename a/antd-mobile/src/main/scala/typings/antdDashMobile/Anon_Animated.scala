package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animated extends js.Object {
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

object Anon_Animated {
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
  ): Anon_Animated = {
    val __obj = js.Dynamic.literal(animated = animated, animationType = animationType, closable = closable, footer = footer, onShow = js.Any.fromFunction0(onShow), operation = operation, platform = platform, popup = popup, prefixCls = prefixCls, transparent = transparent)
  
    __obj.asInstanceOf[Anon_Animated]
  }
}

