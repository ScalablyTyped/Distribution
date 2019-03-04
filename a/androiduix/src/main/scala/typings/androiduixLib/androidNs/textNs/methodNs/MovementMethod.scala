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
    canSelectArbitrarily: js.Function0[scala.Boolean],
    initialize: js.Function2[
      androiduixLib.androidNs.widgetNs.TextView, 
      androiduixLib.androidNs.textNs.Spannable, 
      scala.Unit
    ],
    onGenericMotionEvent: js.Function3[
      androiduixLib.androidNs.widgetNs.TextView, 
      androiduixLib.androidNs.textNs.Spannable, 
      androiduixLib.androidNs.viewNs.MotionEvent, 
      scala.Boolean
    ],
    onKeyDown: js.Function4[
      androiduixLib.androidNs.widgetNs.TextView, 
      androiduixLib.androidNs.textNs.Spannable, 
      scala.Double, 
      androiduixLib.androidNs.viewNs.KeyEvent, 
      scala.Boolean
    ],
    onKeyOther: js.Function3[
      androiduixLib.androidNs.widgetNs.TextView, 
      androiduixLib.androidNs.textNs.Spannable, 
      androiduixLib.androidNs.viewNs.KeyEvent, 
      scala.Boolean
    ],
    onKeyUp: js.Function4[
      androiduixLib.androidNs.widgetNs.TextView, 
      androiduixLib.androidNs.textNs.Spannable, 
      scala.Double, 
      androiduixLib.androidNs.viewNs.KeyEvent, 
      scala.Boolean
    ],
    onTakeFocus: js.Function3[
      androiduixLib.androidNs.widgetNs.TextView, 
      androiduixLib.androidNs.textNs.Spannable, 
      scala.Double, 
      scala.Unit
    ],
    onTouchEvent: js.Function3[
      androiduixLib.androidNs.widgetNs.TextView, 
      androiduixLib.androidNs.textNs.Spannable, 
      androiduixLib.androidNs.viewNs.MotionEvent, 
      scala.Boolean
    ],
    onTrackballEvent: js.Function3[
      androiduixLib.androidNs.widgetNs.TextView, 
      androiduixLib.androidNs.textNs.Spannable, 
      androiduixLib.androidNs.viewNs.MotionEvent, 
      scala.Boolean
    ]
  ): MovementMethod = {
    val __obj = js.Dynamic.literal(canSelectArbitrarily = canSelectArbitrarily, initialize = initialize, onGenericMotionEvent = onGenericMotionEvent, onKeyDown = onKeyDown, onKeyOther = onKeyOther, onKeyUp = onKeyUp, onTakeFocus = onTakeFocus, onTouchEvent = onTouchEvent, onTrackballEvent = onTrackballEvent)
  
    __obj.asInstanceOf[MovementMethod]
  }
}

