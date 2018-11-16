package typings
package androiduixLib.androidNs.viewNs.WindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Callback extends js.Object {
  def dispatchGenericMotionEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
  def dispatchKeyEvent(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean
  def dispatchTouchEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
  def onAttachedToWindow(): scala.Unit
  def onContentChanged(): scala.Unit
  def onDetachedFromWindow(): scala.Unit
  def onWindowAttributesChanged(attrs: androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams): scala.Unit
  def onWindowFocusChanged(hasFocus: scala.Boolean): scala.Unit
}

