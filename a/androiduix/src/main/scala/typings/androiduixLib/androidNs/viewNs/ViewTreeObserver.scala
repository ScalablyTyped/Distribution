package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewTreeObserver")
@js.native
class ViewTreeObserver () extends js.Object {
  var mAlive: js.Any = js.native
  var mOnDrawListeners: js.Any = js.native
  var mOnGlobalLayoutListeners: js.Any = js.native
  var mOnPreDrawListeners: js.Any = js.native
  var mOnScrollChangedListeners: js.Any = js.native
  var mOnTouchModeChangeListeners: js.Any = js.native
  def addOnDrawListener(listener: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnDrawListener): scala.Unit = js.native
  def addOnGlobalLayoutListener(listener: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener): scala.Unit = js.native
  def addOnPreDrawListener(listener: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnPreDrawListener): scala.Unit = js.native
  def addOnScrollChangedListener(listener: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnScrollChangedListener): scala.Unit = js.native
  def addOnTouchModeChangeListener(listener: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnTouchModeChangeListener): scala.Unit = js.native
  /* private */ def checkIsAlive(): js.Any = js.native
  def dispatchOnDraw(): scala.Unit = js.native
  def dispatchOnGlobalLayout(): scala.Unit = js.native
  def dispatchOnPreDraw(): scala.Boolean = js.native
  def dispatchOnScrollChanged(): scala.Unit = js.native
  def dispatchOnTouchModeChanged(inTouchMode: scala.Boolean): scala.Unit = js.native
  def isAlive(): scala.Boolean = js.native
  /* private */ def kill(): js.Any = js.native
  def merge(observer: ViewTreeObserver): scala.Unit = js.native
  def removeGlobalOnLayoutListener(victim: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener): scala.Unit = js.native
  def removeOnDrawListener(victim: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnDrawListener): scala.Unit = js.native
  def removeOnGlobalLayoutListener(victim: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener): scala.Unit = js.native
  def removeOnPreDrawListener(victim: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnPreDrawListener): scala.Unit = js.native
  def removeOnScrollChangedListener(victim: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnScrollChangedListener): scala.Unit = js.native
  def removeOnTouchModeChangeListener(victim: androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnTouchModeChangeListener): scala.Unit = js.native
}

