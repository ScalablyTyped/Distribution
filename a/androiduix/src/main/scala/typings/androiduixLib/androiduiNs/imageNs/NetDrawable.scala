package typings
package androiduixLib.androiduiNs.imageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.image.NetDrawable")
@js.native
class NetDrawable protected ()
  extends androiduixLib.androidNs.graphicsNs.drawableNs.Drawable {
  def this(src: NetImage) = this()
  def this(src: java.lang.String) = this()
  def this(src: NetImage, paint: androiduixLib.androidNs.graphicsNs.Paint) = this()
  def this(src: java.lang.String, paint: androiduixLib.androidNs.graphicsNs.Paint) = this()
  def this(src: NetImage, paint: androiduixLib.androidNs.graphicsNs.Paint, overrideImageRatio: scala.Double) = this()
  def this(src: java.lang.String, paint: androiduixLib.androidNs.graphicsNs.Paint, overrideImageRatio: scala.Double) = this()
  var mImageHeight: scala.Double = js.native
  var mImageWidth: scala.Double = js.native
  var mLoadListener: js.Any = js.native
  var mState: js.Any = js.native
  var mTileModeX: js.Any = js.native
  var mTileModeY: js.Any = js.native
  var mTmpTileBound: js.Any = js.native
  /* private */ def drawTile(canvas: js.Any): js.Any = js.native
  def getImage(): NetImage = js.native
  /* protected */ def initBoundWithLoadedImage(image: NetImage): scala.Unit = js.native
  def isImageSizeEmpty(): scala.Boolean = js.native
  /* protected */ def onError(): scala.Unit = js.native
  /* protected */ def onLoad(): scala.Unit = js.native
  def setLoadListener(loadListener: androiduixLib.androiduiNs.imageNs.NetDrawableNs.LoadListener): scala.Unit = js.native
  def setTileMode(
    tileX: androiduixLib.androiduiNs.imageNs.NetDrawableNs.TileMode,
    tileY: androiduixLib.androiduiNs.imageNs.NetDrawableNs.TileMode
  ): scala.Unit = js.native
  def setURL(url: java.lang.String): scala.Unit = js.native
  def setURL(url: java.lang.String, hiddenWhenLoading: scala.Boolean): scala.Unit = js.native
}

