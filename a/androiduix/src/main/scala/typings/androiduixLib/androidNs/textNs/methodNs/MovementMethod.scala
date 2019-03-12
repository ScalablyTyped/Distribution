package typings
package androiduixLib.androidNs.textNs.methodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovementMethod extends js.Object {
  def canSelectArbitrarily(): scala.Boolean
  def initialize(widget: androiduixLib.androidNs.widgetNs.TextView, text: androiduixLib.androidNs.textNs.Spannable): scala.Unit
  def onGenericMotionEvent(
    widget: androiduixLib.androidNs.widgetNs.TextView,
    text: androiduixLib.androidNs.textNs.Spannable,
    event: androiduixLib.androidNs.viewNs.MotionEvent
  ): scala.Boolean
  def onKeyDown(
    widget: androiduixLib.androidNs.widgetNs.TextView,
    text: androiduixLib.androidNs.textNs.Spannable,
    keyCode: scala.Double,
    event: androiduixLib.androidNs.viewNs.KeyEvent
  ): scala.Boolean
  def onKeyOther(
    view: androiduixLib.androidNs.widgetNs.TextView,
    text: androiduixLib.androidNs.textNs.Spannable,
    event: androiduixLib.androidNs.viewNs.KeyEvent
  ): scala.Boolean
  def onKeyUp(
    widget: androiduixLib.androidNs.widgetNs.TextView,
    text: androiduixLib.androidNs.textNs.Spannable,
    keyCode: scala.Double,
    event: androiduixLib.androidNs.viewNs.KeyEvent
  ): scala.Boolean
  def onTakeFocus(
    widget: androiduixLib.androidNs.widgetNs.TextView,
    text: androiduixLib.androidNs.textNs.Spannable,
    direction: scala.Double
  ): scala.Unit
  def onTouchEvent(
    widget: androiduixLib.androidNs.widgetNs.TextView,
    text: androiduixLib.androidNs.textNs.Spannable,
    event: androiduixLib.androidNs.viewNs.MotionEvent
  ): scala.Boolean
  def onTrackballEvent(
    widget: androiduixLib.androidNs.widgetNs.TextView,
    text: androiduixLib.androidNs.textNs.Spannable,
    event: androiduixLib.androidNs.viewNs.MotionEvent
  ): scala.Boolean
}

object MovementMethod {
  @scala.inline
  def apply(
    canSelectArbitrarily: () => scala.Boolean,
    initialize: (androiduixLib.androidNs.widgetNs.TextView, androiduixLib.androidNs.textNs.Spannable) => scala.Unit,
    onGenericMotionEvent: (androiduixLib.androidNs.widgetNs.TextView, androiduixLib.androidNs.textNs.Spannable, androiduixLib.androidNs.viewNs.MotionEvent) => scala.Boolean,
    onKeyDown: (androiduixLib.androidNs.widgetNs.TextView, androiduixLib.androidNs.textNs.Spannable, scala.Double, androiduixLib.androidNs.viewNs.KeyEvent) => scala.Boolean,
    onKeyOther: (androiduixLib.androidNs.widgetNs.TextView, androiduixLib.androidNs.textNs.Spannable, androiduixLib.androidNs.viewNs.KeyEvent) => scala.Boolean,
    onKeyUp: (androiduixLib.androidNs.widgetNs.TextView, androiduixLib.androidNs.textNs.Spannable, scala.Double, androiduixLib.androidNs.viewNs.KeyEvent) => scala.Boolean,
    onTakeFocus: (androiduixLib.androidNs.widgetNs.TextView, androiduixLib.androidNs.textNs.Spannable, scala.Double) => scala.Unit,
    onTouchEvent: (androiduixLib.androidNs.widgetNs.TextView, androiduixLib.androidNs.textNs.Spannable, androiduixLib.androidNs.viewNs.MotionEvent) => scala.Boolean,
    onTrackballEvent: (androiduixLib.androidNs.widgetNs.TextView, androiduixLib.androidNs.textNs.Spannable, androiduixLib.androidNs.viewNs.MotionEvent) => scala.Boolean
  ): MovementMethod = {
    val __obj = js.Dynamic.literal(canSelectArbitrarily = js.Any.fromFunction0(canSelectArbitrarily), initialize = js.Any.fromFunction2(initialize), onGenericMotionEvent = js.Any.fromFunction3(onGenericMotionEvent), onKeyDown = js.Any.fromFunction4(onKeyDown), onKeyOther = js.Any.fromFunction3(onKeyOther), onKeyUp = js.Any.fromFunction4(onKeyUp), onTakeFocus = js.Any.fromFunction3(onTakeFocus), onTouchEvent = js.Any.fromFunction3(onTouchEvent), onTrackballEvent = js.Any.fromFunction3(onTrackballEvent))
  
    __obj.asInstanceOf[MovementMethod]
  }
}

