package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimateAppear extends js.Object {
  var animateAppear: scala.Boolean
  var animationType: java.lang.String
  var closable: scala.Boolean
  var footer: js.Array[scala.Nothing]
  var maskClosable: scala.Boolean
  var operation: scala.Boolean
  var popup: scala.Boolean
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.RegisteredStyle[_]]
  var transparent: scala.Boolean
  var visible: scala.Boolean
  def onClose(): scala.Unit
}

object Anon_AnimateAppear {
  @scala.inline
  def apply(
    animateAppear: scala.Boolean,
    animationType: java.lang.String,
    closable: scala.Boolean,
    footer: js.Array[scala.Nothing],
    maskClosable: scala.Boolean,
    onClose: () => scala.Unit,
    operation: scala.Boolean,
    popup: scala.Boolean,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.RegisteredStyle[_]],
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): Anon_AnimateAppear = {
    val __obj = js.Dynamic.literal(animateAppear = animateAppear, animationType = animationType, closable = closable, footer = footer, maskClosable = maskClosable, onClose = js.Any.fromFunction0(onClose), operation = operation, popup = popup, styles = styles, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[Anon_AnimateAppear]
  }
}

