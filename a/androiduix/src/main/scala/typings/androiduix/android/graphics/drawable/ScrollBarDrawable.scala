package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ScrollBarDrawable")
@js.native
class ScrollBarDrawable () extends Drawable {
  var mAlwaysDrawHorizontalTrack: js.Any = js.native
  var mAlwaysDrawVerticalTrack: js.Any = js.native
  var mChanged: js.Any = js.native
  var mExtent: js.Any = js.native
  var mHorizontalThumb: js.Any = js.native
  var mHorizontalTrack: js.Any = js.native
  var mOffset: js.Any = js.native
  var mRange: js.Any = js.native
  var mRangeChanged: js.Any = js.native
  var mTempBounds: js.Any = js.native
  var mVertical: js.Any = js.native
  var mVerticalThumb: js.Any = js.native
  var mVerticalTrack: js.Any = js.native
  def draw(canvas: js.Any): Unit = js.native
  def drawThumb(canvas: Canvas, bounds: Rect, offset: Double, length: Double, vertical: Boolean): Unit = js.native
  def drawTrack(canvas: Canvas, bounds: Rect, vertical: Boolean): Unit = js.native
  def getAlwaysDrawHorizontalTrack(): Boolean = js.native
  def getAlwaysDrawVerticalTrack(): Boolean = js.native
  def getSize(vertical: Boolean): Double = js.native
  def setAlwaysDrawHorizontalTrack(alwaysDrawTrack: Boolean): Unit = js.native
  def setAlwaysDrawVerticalTrack(alwaysDrawTrack: Boolean): Unit = js.native
  def setHorizontalThumbDrawable(thumb: Drawable): Unit = js.native
  def setHorizontalTrackDrawable(track: Drawable): Unit = js.native
  def setParameters(range: Double, offset: Double, extent: Double, vertical: Boolean): Unit = js.native
  def setVerticalThumbDrawable(thumb: Drawable): Unit = js.native
  def setVerticalTrackDrawable(track: Drawable): Unit = js.native
}

