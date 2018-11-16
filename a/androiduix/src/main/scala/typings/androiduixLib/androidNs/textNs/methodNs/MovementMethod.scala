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

