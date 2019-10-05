package typings.androiduix.androidui.image

import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.androidui.image.NetDrawable.LoadListener
import typings.androiduix.androidui.image.NetDrawable.TileMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.image.NetDrawable")
@js.native
class NetDrawable_ protected () extends Drawable {
  def this(src: String) = this()
  def this(src: NetImage) = this()
  def this(src: String, paint: Paint) = this()
  def this(src: NetImage, paint: Paint) = this()
  def this(src: String, paint: Paint, overrideImageRatio: Double) = this()
  def this(src: NetImage, paint: Paint, overrideImageRatio: Double) = this()
  var mImageHeight: Double = js.native
  var mImageWidth: Double = js.native
  var mLoadListener: js.Any = js.native
  var mState: js.Any = js.native
  var mTileModeX: js.Any = js.native
  var mTileModeY: js.Any = js.native
  var mTmpTileBound: js.Any = js.native
  /* private */ def drawTile(canvas: js.Any): js.Any = js.native
  def getImage(): NetImage = js.native
  /* protected */ def initBoundWithLoadedImage(image: NetImage): Unit = js.native
  def isImageSizeEmpty(): Boolean = js.native
  /* protected */ def onError(): Unit = js.native
  /* protected */ def onLoad(): Unit = js.native
  def setLoadListener(loadListener: LoadListener): Unit = js.native
  def setTileMode(tileX: TileMode, tileY: TileMode): Unit = js.native
  def setURL(url: String): Unit = js.native
  def setURL(url: String, hiddenWhenLoading: Boolean): Unit = js.native
}

