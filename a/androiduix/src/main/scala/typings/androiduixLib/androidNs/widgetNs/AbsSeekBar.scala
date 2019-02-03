package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsSeekBar")
@js.native
abstract class AbsSeekBar protected () extends ProgressBar {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mDisabledAlpha: js.Any = js.native
  var mIsDragging: js.Any = js.native
  var mIsUserSeekable: scala.Boolean = js.native
  var mKeyProgressIncrement: js.Any = js.native
  var mThumb: js.Any = js.native
  var mThumbOffset: js.Any = js.native
  var mTouchDownX: js.Any = js.native
  var mTouchProgressOffset: scala.Double = js.native
  /* private */ def attemptClaimDrag(): js.Any = js.native
  def getKeyProgressIncrement(): scala.Double = js.native
  def getThumb(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getThumbOffset(): scala.Double = js.native
  def onKeyChange(): scala.Unit = js.native
  def onStartTrackingTouch(): scala.Unit = js.native
  def onStopTrackingTouch(): scala.Unit = js.native
  def setKeyProgressIncrement(increment: scala.Double): scala.Unit = js.native
  def setThumb(thumb: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setThumbOffset(thumbOffset: scala.Double): scala.Unit = js.native
  /* private */ def setThumbPos(w: js.Any, thumb: js.Any, scale: js.Any, gap: js.Any): js.Any = js.native
  /* private */ def trackTouchEvent(event: js.Any): js.Any = js.native
  /* private */ def updateThumbPos(w: js.Any, h: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.AbsSeekBar")
@js.native
object AbsSeekBar extends js.Object {
  var NO_ALPHA: js.Any = js.native
}

