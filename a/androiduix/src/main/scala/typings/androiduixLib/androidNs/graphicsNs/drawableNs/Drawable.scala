package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.Drawable")
@js.native
abstract class Drawable () extends js.Object {
  var mBounds: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mCallback: androiduixLib.javaNs.langNs.refNs.WeakReference[androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback] = js.native
  var mIgnoreNotifySizeChange: js.Any = js.native
  var mLevel: scala.Double = js.native
  var mStateSet: js.Array[scala.Double] = js.native
  var mVisible: scala.Boolean = js.native
  def copyBounds(): androiduixLib.androidNs.graphicsNs.Rect = js.native
  def copyBounds(bounds: androiduixLib.androidNs.graphicsNs.Rect): androiduixLib.androidNs.graphicsNs.Rect = js.native
  def draw(canvas: androiduixLib.androidNs.graphicsNs.Canvas): js.Any = js.native
  def getAlpha(): scala.Double = js.native
  def getBounds(): androiduixLib.androidNs.graphicsNs.Rect = js.native
  def getCallback(): androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback = js.native
  def getConstantState(): androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.ConstantState = js.native
  def getCurrent(): Drawable = js.native
  def getIntrinsicHeight(): scala.Double = js.native
  def getIntrinsicWidth(): scala.Double = js.native
  def getLevel(): scala.Double = js.native
  def getMinimumHeight(): scala.Double = js.native
  def getMinimumWidth(): scala.Double = js.native
  def getOpacity(): scala.Double = js.native
  def getPadding(padding: androiduixLib.androidNs.graphicsNs.Rect): scala.Boolean = js.native
  def getState(): js.Array[scala.Double] = js.native
  def inflate(r: androiduixLib.androidNs.contentNs.resNs.Resources, parser: stdLib.HTMLElement): scala.Unit = js.native
  def invalidateSelf(): scala.Unit = js.native
  def isAutoMirrored(): scala.Boolean = js.native
  def isStateful(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def jumpToCurrentState(): scala.Unit = js.native
  def mutate(): Drawable = js.native
  def notifySizeChangeSelf(): scala.Unit = js.native
  /* protected */ def onBoundsChange(bounds: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  /* protected */ def onLevelChange(level: scala.Double): scala.Boolean = js.native
  /* protected */ def onStateChange(state: js.Array[scala.Double]): scala.Boolean = js.native
  def scheduleSelf(what: js.Any, when: js.Any): scala.Unit = js.native
  def setAlpha(alpha: scala.Double): scala.Unit = js.native
  def setAutoMirrored(mirrored: scala.Boolean): scala.Unit = js.native
  def setBounds(left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  def setBounds(rect: androiduixLib.androidNs.graphicsNs.Rect): js.Any = js.native
  def setCallback(cb: androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback): scala.Unit = js.native
  def setDither(dither: scala.Boolean): scala.Unit = js.native
  def setIgnoreNotifySizeChange(isIgnore: scala.Boolean): scala.Unit = js.native
  def setLevel(level: scala.Double): scala.Boolean = js.native
  def setState(stateSet: js.Array[scala.Double]): scala.Boolean = js.native
  def setVisible(visible: scala.Boolean, restart: scala.Boolean): scala.Boolean = js.native
  def unscheduleSelf(what: js.Any): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.drawable.Drawable")
@js.native
object Drawable extends js.Object {
  var ZERO_BOUNDS_RECT: js.Any = js.native
  def createFromXml(r: androiduixLib.androidNs.contentNs.resNs.Resources, parser: stdLib.HTMLElement): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def resolveOpacity(op1: scala.Double, op2: scala.Double): scala.Double = js.native
}

