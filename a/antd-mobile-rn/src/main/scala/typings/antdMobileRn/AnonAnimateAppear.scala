package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimateAppear extends js.Object {
  var animateAppear: Boolean
  var animationType: String
  var closable: Boolean
  var footer: js.Array[scala.Nothing]
  var maskClosable: Boolean
  var operation: Boolean
  var popup: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  var transparent: Boolean
  var visible: Boolean
  def onClose(): Unit
}

object AnonAnimateAppear {
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
    styles: StringDictionary[RegisteredStyle[_]],
    transparent: Boolean,
    visible: Boolean
  ): AnonAnimateAppear = {
    val __obj = js.Dynamic.literal(animateAppear = animateAppear.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), operation = operation.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimateAppear]
  }
}

