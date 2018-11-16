package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

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
  def draw(canvas: js.Any): scala.Unit = js.native
  def drawThumb(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    bounds: androiduixLib.androidNs.graphicsNs.Rect,
    offset: scala.Double,
    length: scala.Double,
    vertical: scala.Boolean
  ): scala.Unit = js.native
  def drawTrack(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    bounds: androiduixLib.androidNs.graphicsNs.Rect,
    vertical: scala.Boolean
  ): scala.Unit = js.native
  def getAlwaysDrawHorizontalTrack(): scala.Boolean = js.native
  def getAlwaysDrawVerticalTrack(): scala.Boolean = js.native
  def getSize(vertical: scala.Boolean): scala.Double = js.native
  def setAlwaysDrawHorizontalTrack(alwaysDrawTrack: scala.Boolean): scala.Unit = js.native
  def setAlwaysDrawVerticalTrack(alwaysDrawTrack: scala.Boolean): scala.Unit = js.native
  def setHorizontalThumbDrawable(thumb: Drawable): scala.Unit = js.native
  def setHorizontalTrackDrawable(track: Drawable): scala.Unit = js.native
  def setParameters(range: scala.Double, offset: scala.Double, extent: scala.Double, vertical: scala.Boolean): scala.Unit = js.native
  def setVerticalThumbDrawable(thumb: Drawable): scala.Unit = js.native
  def setVerticalTrackDrawable(track: Drawable): scala.Unit = js.native
}

