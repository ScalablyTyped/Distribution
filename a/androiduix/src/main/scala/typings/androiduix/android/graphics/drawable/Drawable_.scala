package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import typings.androiduix.java_.lang.ref.WeakReference
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drawable_ extends js.Object {
  var mBounds: Rect = js.native
  var mCallback: WeakReference[Callback] = js.native
  var mIgnoreNotifySizeChange: js.Any = js.native
  var mLevel: Double = js.native
  var mStateSet: js.Array[Double] = js.native
  var mVisible: Boolean = js.native
  def copyBounds(): Rect = js.native
  def copyBounds(bounds: Rect): Rect = js.native
  def draw(canvas: Canvas): js.Any = js.native
  def getAlpha(): Double = js.native
  def getBounds(): Rect = js.native
  def getCallback(): Callback = js.native
  def getConstantState(): ConstantState = js.native
  def getCurrent(): Drawable = js.native
  def getIntrinsicHeight(): Double = js.native
  def getIntrinsicWidth(): Double = js.native
  def getLevel(): Double = js.native
  def getMinimumHeight(): Double = js.native
  def getMinimumWidth(): Double = js.native
  def getOpacity(): Double = js.native
  def getPadding(padding: Rect): Boolean = js.native
  def getState(): js.Array[Double] = js.native
  def inflate(r: Resources, parser: HTMLElement): Unit = js.native
  def invalidateSelf(): Unit = js.native
  def isAutoMirrored(): Boolean = js.native
  def isStateful(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def jumpToCurrentState(): Unit = js.native
  def mutate(): Drawable = js.native
  def notifySizeChangeSelf(): Unit = js.native
  /* protected */ def onBoundsChange(bounds: Rect): Unit = js.native
  /* protected */ def onLevelChange(level: Double): Boolean = js.native
  /* protected */ def onStateChange(state: js.Array[Double]): Boolean = js.native
  def scheduleSelf(what: js.Any, when: js.Any): Unit = js.native
  def setAlpha(alpha: Double): Unit = js.native
  def setAutoMirrored(mirrored: Boolean): Unit = js.native
  def setBounds(left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  def setBounds(rect: Rect): js.Any = js.native
  def setCallback(cb: Callback): Unit = js.native
  def setDither(dither: Boolean): Unit = js.native
  def setIgnoreNotifySizeChange(isIgnore: Boolean): Unit = js.native
  def setLevel(level: Double): Boolean = js.native
  def setState(stateSet: js.Array[Double]): Boolean = js.native
  def setVisible(visible: Boolean, restart: Boolean): Boolean = js.native
  def unscheduleSelf(what: js.Any): Unit = js.native
}

