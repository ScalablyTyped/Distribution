package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnDrawListener
import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener
import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnPreDrawListener
import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnScrollChangedListener
import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnTouchModeChangeListener
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
  def addOnDrawListener(listener: OnDrawListener): Unit = js.native
  def addOnGlobalLayoutListener(listener: OnGlobalLayoutListener): Unit = js.native
  def addOnPreDrawListener(listener: OnPreDrawListener): Unit = js.native
  def addOnScrollChangedListener(listener: OnScrollChangedListener): Unit = js.native
  def addOnTouchModeChangeListener(listener: OnTouchModeChangeListener): Unit = js.native
  /* private */ def checkIsAlive(): js.Any = js.native
  def dispatchOnDraw(): Unit = js.native
  def dispatchOnGlobalLayout(): Unit = js.native
  def dispatchOnPreDraw(): Boolean = js.native
  def dispatchOnScrollChanged(): Unit = js.native
  def dispatchOnTouchModeChanged(inTouchMode: Boolean): Unit = js.native
  def isAlive(): Boolean = js.native
  /* private */ def kill(): js.Any = js.native
  def merge(observer: ViewTreeObserver): Unit = js.native
  def removeGlobalOnLayoutListener(victim: OnGlobalLayoutListener): Unit = js.native
  def removeOnDrawListener(victim: OnDrawListener): Unit = js.native
  def removeOnGlobalLayoutListener(victim: OnGlobalLayoutListener): Unit = js.native
  def removeOnPreDrawListener(victim: OnPreDrawListener): Unit = js.native
  def removeOnScrollChangedListener(victim: OnScrollChangedListener): Unit = js.native
  def removeOnTouchModeChangeListener(victim: OnTouchModeChangeListener): Unit = js.native
}

