package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimateAppear extends js.Object {
  var animateAppear: Boolean
  var animationType: String
  var closable: Boolean
  var footer: js.Array[scala.Nothing]
  var maskClosable: Boolean
  var operation: Boolean
  var popup: Boolean
  var transparent: Boolean
  var visible: Boolean
  def onClose(): Unit
}

object Anon_AnimateAppear {
  @scala.inline
  def apply(
    animateAppear: Boolean,
    animationType: String,
    closable: Boolean,
    footer: js.Array[scala.Nothing],
    maskClosable: Boolean,
    onClose: () => Unit,
    operation: Boolean,
    popup: Boolean,
    transparent: Boolean,
    visible: Boolean
  ): Anon_AnimateAppear = {
    val __obj = js.Dynamic.literal(animateAppear = animateAppear, animationType = animationType, closable = closable, footer = footer, maskClosable = maskClosable, onClose = js.Any.fromFunction0(onClose), operation = operation, popup = popup, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[Anon_AnimateAppear]
  }
}

