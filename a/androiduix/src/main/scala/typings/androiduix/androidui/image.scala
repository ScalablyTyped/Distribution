package typings.androiduix.androidui

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.androidui.image.NetDrawable.LoadListener
import typings.androiduix.androidui.image.NetDrawable.TileMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object image {
  
  @js.native
  trait NetDrawable extends Drawable {
    
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
  object NetDrawable {
    
    @js.native
    sealed trait TileMode extends StObject
    @JSGlobal("androidui.image.NetDrawable.TileMode")
    @js.native
    object TileMode extends StObject {
      
      @js.native
      sealed trait DEFAULT extends TileMode
      
      @js.native
      sealed trait REPEAT extends TileMode
    }
    
    @js.native
    trait LoadListener extends StObject {
      
      def onError(drawable: NetDrawable): js.Any = js.native
      
      def onLoad(drawable: NetDrawable): js.Any = js.native
    }
    object LoadListener {
      
      @scala.inline
      def apply(onError: NetDrawable => js.Any, onLoad: NetDrawable => js.Any): LoadListener = {
        val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad))
        __obj.asInstanceOf[LoadListener]
      }
      
      @scala.inline
      implicit class LoadListenerMutableBuilder[Self <: LoadListener] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnError(value: NetDrawable => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLoad(value: NetDrawable => js.Any): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      }
    }
  }
  
  @js.native
  trait ChangeImageSizeDrawable
    extends Drawable
       with Callback {
    
    @JSName("drawableSizeChange")
    def drawableSizeChange_MChangeImageSizeDrawable(who: Drawable): js.Any = js.native
    
    def getDrawable(): Drawable = js.native
    
    var mMutated: js.Any = js.native
    
    var mState: js.Any = js.native
    
    var mTmpRect: js.Any = js.native
  }
  
  @js.native
  trait NetImage extends StObject {
    
    def addLoadListener(onload: js.Function0[Unit]): Unit = js.native
    def addLoadListener(onload: js.Function0[Unit], onerror: js.Function0[Unit]): Unit = js.native
    
    var browserImage: js.Any = js.native
    
    /* protected */ def createImage(): Unit = js.native
    
    /* private */ def fireOnError(): js.Any = js.native
    
    /* private */ def fireOnLoad(): js.Any = js.native
    
    def getBorderPixels(
      callBack: js.Function4[
          /* leftBorder */ js.Array[Double], 
          /* topBorder */ js.Array[Double], 
          /* rightBorder */ js.Array[Double], 
          /* bottomBorder */ js.Array[Double], 
          Unit
        ]
    ): Unit = js.native
    
    def getImageRatio(): Double = js.native
    
    def getPixels(bound: Rect, callBack: js.Function1[/* data */ js.Array[Double], Unit]): Unit = js.native
    
    val height: Double = js.native
    
    /* protected */ def init(src: String): Unit = js.native
    
    def isImageLoaded(): Boolean = js.native
    
    /* protected */ def loadImage(): Unit = js.native
    
    var mImageHeight: js.Any = js.native
    
    var mImageLoaded: js.Any = js.native
    
    var mImageWidth: js.Any = js.native
    
    var mOnErrors: js.Any = js.native
    
    var mOnLoads: js.Any = js.native
    
    var mOverrideImageRatio: js.Any = js.native
    
    var mSrc: js.Any = js.native
    
    def recycle(): Unit = js.native
    
    def removeLoadListener(): Unit = js.native
    def removeLoadListener(onload: js.UndefOr[scala.Nothing], onerror: js.Function0[Unit]): Unit = js.native
    def removeLoadListener(onload: js.Function0[Unit]): Unit = js.native
    def removeLoadListener(onload: js.Function0[Unit], onerror: js.Function0[Unit]): Unit = js.native
    
    var src: String = js.native
    
    val width: Double = js.native
  }
  
  @js.native
  trait NinePatchDrawable extends NetDrawable {
    
    /* private */ def drawNinePatch(canvas: js.Any): js.Any = js.native
    
    /* private */ def getNinePatchCache(): js.Any = js.native
    
    /* private */ def initNinePatchBorderInfo(image: js.Any): js.Any = js.native
    
    var mNinePatchBorderInfo: js.Any = js.native
    
    var mNinePatchDrawCache: js.Any = js.native
    
    var mTmpRect: js.Any = js.native
    
    var mTmpRect2: js.Any = js.native
  }
}
