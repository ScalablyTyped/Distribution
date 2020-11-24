package typings.androiduix.androidui.image

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.androidui.image.NetDrawable.LoadListener
import typings.androiduix.androidui.image.NetDrawable.TileMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetDrawable_ extends Drawable {
  
  /* private */ def drawTile(canvas: js.Any): js.Any = js.native
  
  def getImage(): NetImage = js.native
  
  /* protected */ def initBoundWithLoadedImage(image: NetImage): Unit = js.native
  
  def isImageSizeEmpty(): Boolean = js.native
  
  var mImageHeight: Double = js.native
  
  var mImageWidth: Double = js.native
  
  var mLoadListener: js.Any = js.native
  
  var mState: js.Any = js.native
  
  var mTileModeX: js.Any = js.native
  
  var mTileModeY: js.Any = js.native
  
  var mTmpTileBound: js.Any = js.native
  
  /* protected */ def onError(): Unit = js.native
  
  /* protected */ def onLoad(): Unit = js.native
  
  def setLoadListener(loadListener: LoadListener): Unit = js.native
  
  def setTileMode(tileX: TileMode, tileY: TileMode): Unit = js.native
  
  def setURL(url: String): Unit = js.native
  def setURL(url: String, hiddenWhenLoading: Boolean): Unit = js.native
}
