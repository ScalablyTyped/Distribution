package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animated extends js.Object {
  var animated: scala.Boolean
  var animationType: java.lang.String
  var closable: scala.Boolean
  var footer: js.Array[scala.Nothing]
  var operation: scala.Boolean
  var platform: java.lang.String
  var popup: scala.Boolean
  var prefixCls: java.lang.String
  var transparent: scala.Boolean
  def onShow(): scala.Unit
}

object Anon_Animated {
  @scala.inline
  def apply(
    animated: scala.Boolean,
    animationType: java.lang.String,
    closable: scala.Boolean,
    footer: js.Array[scala.Nothing],
    onShow: () => scala.Unit,
    operation: scala.Boolean,
    platform: java.lang.String,
    popup: scala.Boolean,
    prefixCls: java.lang.String,
    transparent: scala.Boolean
  ): Anon_Animated = {
    val __obj = js.Dynamic.literal(animated = animated, animationType = animationType, closable = closable, footer = footer, onShow = js.Any.fromFunction0(onShow), operation = operation, platform = platform, popup = popup, prefixCls = prefixCls, transparent = transparent)
  
    __obj.asInstanceOf[Anon_Animated]
  }
}

