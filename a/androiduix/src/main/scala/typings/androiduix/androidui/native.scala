package typings.androiduix.androidui

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint.Style
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.Surface
import typings.androiduix.android.webkit.WebView
import typings.androiduix.android.widget.EditText
import typings.androiduix.androidui.image.NetImage
import typings.androiduix.androidui.widget.HtmlView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object native {
  
  @js.native
  trait NativeApi extends StObject
  object NativeApi {
    
    @js.native
    trait CanvasApi extends StObject {
      
      def clearColor(canvasId: Double): Unit = js.native
      
      def clipRect(canvasId: Double, left: Double, top: Double, width: Double, height: Double): Unit = js.native
      
      def clipRoundRectImpl(
        canvasId: Double,
        left: Double,
        top: Double,
        width: Double,
        height: Double,
        radiusTopLeft: Double,
        radiusTopRight: Double,
        radiusBottomRight: Double,
        radiusBottomLeft: Double
      ): Unit = js.native
      
      def concat(
        canvasId: Double,
        MSCALE_X: Double,
        MSKEW_X: Double,
        MTRANS_X: Double,
        MSKEW_Y: Double,
        MSCALE_Y: Double,
        MTRANS_Y: Double
      ): Unit = js.native
      
      def createCanvas(canvasId: Double, width: Double, height: Double): Unit = js.native
      
      def drawArc(
        canvasId: Double,
        left: Double,
        top: Double,
        right: Double,
        bottom: Double,
        startAngle: Double,
        sweepAngle: Double,
        useCenter: Boolean,
        style: Style
      ): Unit = js.native
      
      def drawCanvas(canvasId: Double, drawCanvasId: Double, offsetX: Double, offsetY: Double): Unit = js.native
      
      def drawCircle(canvasId: Double, cx: Double, cy: Double, radius: Double, style: Style): Unit = js.native
      
      def drawColor(canvasId: Double, color: Double): Unit = js.native
      
      def drawImage2args(canvasId: Double, drawImageId: Double, left: Double, top: Double): Unit = js.native
      
      def drawImage4args(
        canvasId: Double,
        drawImageId: Double,
        dstLeft: Double,
        dstTop: Double,
        dstRight: Double,
        dstBottom: Double
      ): Unit = js.native
      
      def drawImage8args(
        canvasId: Double,
        drawImageId: Double,
        srcLeft: Double,
        srcTop: Double,
        srcRight: Double,
        srcBottom: Double,
        dstLeft: Double,
        dstTop: Double,
        dstRight: Double,
        dstBottom: Double
      ): Unit = js.native
      
      def drawOval(canvasId: Double, left: Double, top: Double, right: Double, bottom: Double, style: Style): Unit = js.native
      
      def drawRect(canvasId: Double, left: Double, top: Double, width: Double, height: Double, style: Style): Unit = js.native
      
      def drawRoundRectImpl(
        canvasId: Double,
        left: Double,
        top: Double,
        width: Double,
        height: Double,
        radiusTopLeft: Double,
        radiusTopRight: Double,
        radiusBottomRight: Double,
        radiusBottomLeft: Double,
        style: Style
      ): Unit = js.native
      
      def drawText(canvasId: Double, text: String, x: Double, y: Double, fillStyle: Style): Unit = js.native
      
      def multiplyGlobalAlpha(canvasId: Double, alpha: Double): Unit = js.native
      
      def recycleCanvas(canvasId: Double): Unit = js.native
      
      def restore(canvasId: Double): Unit = js.native
      
      def rotate(canvasId: Double, degrees: Double): Unit = js.native
      
      def save(canvasId: Double): Unit = js.native
      
      def scale(canvasId: Double, sx: Double, sy: Double): Unit = js.native
      
      def setFillColor(canvasId: Double, color: Double, style: Style): Unit = js.native
      
      def setFont(canvasId: Double, fontName: String): Unit = js.native
      
      def setFontSize(canvasId: Double, size: Double): Unit = js.native
      
      def setGlobalAlpha(canvasId: Double, alpha: Double): Unit = js.native
      
      def setLineCap(canvasId: Double, lineCap: String): Unit = js.native
      
      def setLineJoin(canvasId: Double, lineJoin: String): Unit = js.native
      
      def setLineWidth(canvasId: Double, width: Double): Unit = js.native
      
      def setShadow(canvasId: Double, radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
      
      def setTextAlign(canvasId: Double, align: String): Unit = js.native
      
      def translate(canvasId: Double, dx: Double, dy: Double): Unit = js.native
    }
    object CanvasApi {
      
      @scala.inline
      def apply(
        clearColor: Double => Unit,
        clipRect: (Double, Double, Double, Double, Double) => Unit,
        clipRoundRectImpl: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
        concat: (Double, Double, Double, Double, Double, Double, Double) => Unit,
        createCanvas: (Double, Double, Double) => Unit,
        drawArc: (Double, Double, Double, Double, Double, Double, Double, Boolean, Style) => Unit,
        drawCanvas: (Double, Double, Double, Double) => Unit,
        drawCircle: (Double, Double, Double, Double, Style) => Unit,
        drawColor: (Double, Double) => Unit,
        drawImage2args: (Double, Double, Double, Double) => Unit,
        drawImage4args: (Double, Double, Double, Double, Double, Double) => Unit,
        drawImage8args: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
        drawOval: (Double, Double, Double, Double, Double, Style) => Unit,
        drawRect: (Double, Double, Double, Double, Double, Style) => Unit,
        drawRoundRectImpl: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Style) => Unit,
        drawText: (Double, String, Double, Double, Style) => Unit,
        multiplyGlobalAlpha: (Double, Double) => Unit,
        recycleCanvas: Double => Unit,
        restore: Double => Unit,
        rotate: (Double, Double) => Unit,
        save: Double => Unit,
        scale: (Double, Double, Double) => Unit,
        setFillColor: (Double, Double, Style) => Unit,
        setFont: (Double, String) => Unit,
        setFontSize: (Double, Double) => Unit,
        setGlobalAlpha: (Double, Double) => Unit,
        setLineCap: (Double, String) => Unit,
        setLineJoin: (Double, String) => Unit,
        setLineWidth: (Double, Double) => Unit,
        setShadow: (Double, Double, Double, Double, Double) => Unit,
        setTextAlign: (Double, String) => Unit,
        translate: (Double, Double, Double) => Unit
      ): CanvasApi = {
        val __obj = js.Dynamic.literal(clearColor = js.Any.fromFunction1(clearColor), clipRect = js.Any.fromFunction5(clipRect), clipRoundRectImpl = js.Any.fromFunction9(clipRoundRectImpl), concat = js.Any.fromFunction7(concat), createCanvas = js.Any.fromFunction3(createCanvas), drawArc = js.Any.fromFunction9(drawArc), drawCanvas = js.Any.fromFunction4(drawCanvas), drawCircle = js.Any.fromFunction5(drawCircle), drawColor = js.Any.fromFunction2(drawColor), drawImage2args = js.Any.fromFunction4(drawImage2args), drawImage4args = js.Any.fromFunction6(drawImage4args), drawImage8args = js.Any.fromFunction10(drawImage8args), drawOval = js.Any.fromFunction6(drawOval), drawRect = js.Any.fromFunction6(drawRect), drawRoundRectImpl = js.Any.fromFunction10(drawRoundRectImpl), drawText = js.Any.fromFunction5(drawText), multiplyGlobalAlpha = js.Any.fromFunction2(multiplyGlobalAlpha), recycleCanvas = js.Any.fromFunction1(recycleCanvas), restore = js.Any.fromFunction1(restore), rotate = js.Any.fromFunction2(rotate), save = js.Any.fromFunction1(save), scale = js.Any.fromFunction3(scale), setFillColor = js.Any.fromFunction3(setFillColor), setFont = js.Any.fromFunction2(setFont), setFontSize = js.Any.fromFunction2(setFontSize), setGlobalAlpha = js.Any.fromFunction2(setGlobalAlpha), setLineCap = js.Any.fromFunction2(setLineCap), setLineJoin = js.Any.fromFunction2(setLineJoin), setLineWidth = js.Any.fromFunction2(setLineWidth), setShadow = js.Any.fromFunction5(setShadow), setTextAlign = js.Any.fromFunction2(setTextAlign), translate = js.Any.fromFunction3(translate))
        __obj.asInstanceOf[CanvasApi]
      }
      
      @scala.inline
      implicit class CanvasApiMutableBuilder[Self <: CanvasApi] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClearColor(value: Double => Unit): Self = StObject.set(x, "clearColor", js.Any.fromFunction1(value))
        
        @scala.inline
        def setClipRect(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "clipRect", js.Any.fromFunction5(value))
        
        @scala.inline
        def setClipRoundRectImpl(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "clipRoundRectImpl", js.Any.fromFunction9(value))
        
        @scala.inline
        def setConcat(value: (Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "concat", js.Any.fromFunction7(value))
        
        @scala.inline
        def setCreateCanvas(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "createCanvas", js.Any.fromFunction3(value))
        
        @scala.inline
        def setDrawArc(value: (Double, Double, Double, Double, Double, Double, Double, Boolean, Style) => Unit): Self = StObject.set(x, "drawArc", js.Any.fromFunction9(value))
        
        @scala.inline
        def setDrawCanvas(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "drawCanvas", js.Any.fromFunction4(value))
        
        @scala.inline
        def setDrawCircle(value: (Double, Double, Double, Double, Style) => Unit): Self = StObject.set(x, "drawCircle", js.Any.fromFunction5(value))
        
        @scala.inline
        def setDrawColor(value: (Double, Double) => Unit): Self = StObject.set(x, "drawColor", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDrawImage2args(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "drawImage2args", js.Any.fromFunction4(value))
        
        @scala.inline
        def setDrawImage4args(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "drawImage4args", js.Any.fromFunction6(value))
        
        @scala.inline
        def setDrawImage8args(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "drawImage8args", js.Any.fromFunction10(value))
        
        @scala.inline
        def setDrawOval(value: (Double, Double, Double, Double, Double, Style) => Unit): Self = StObject.set(x, "drawOval", js.Any.fromFunction6(value))
        
        @scala.inline
        def setDrawRect(value: (Double, Double, Double, Double, Double, Style) => Unit): Self = StObject.set(x, "drawRect", js.Any.fromFunction6(value))
        
        @scala.inline
        def setDrawRoundRectImpl(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Style) => Unit): Self = StObject.set(x, "drawRoundRectImpl", js.Any.fromFunction10(value))
        
        @scala.inline
        def setDrawText(value: (Double, String, Double, Double, Style) => Unit): Self = StObject.set(x, "drawText", js.Any.fromFunction5(value))
        
        @scala.inline
        def setMultiplyGlobalAlpha(value: (Double, Double) => Unit): Self = StObject.set(x, "multiplyGlobalAlpha", js.Any.fromFunction2(value))
        
        @scala.inline
        def setRecycleCanvas(value: Double => Unit): Self = StObject.set(x, "recycleCanvas", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRestore(value: Double => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRotate(value: (Double, Double) => Unit): Self = StObject.set(x, "rotate", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSave(value: Double => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
        
        @scala.inline
        def setScale(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "scale", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetFillColor(value: (Double, Double, Style) => Unit): Self = StObject.set(x, "setFillColor", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetFont(value: (Double, String) => Unit): Self = StObject.set(x, "setFont", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetFontSize(value: (Double, Double) => Unit): Self = StObject.set(x, "setFontSize", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetGlobalAlpha(value: (Double, Double) => Unit): Self = StObject.set(x, "setGlobalAlpha", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetLineCap(value: (Double, String) => Unit): Self = StObject.set(x, "setLineCap", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetLineJoin(value: (Double, String) => Unit): Self = StObject.set(x, "setLineJoin", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetLineWidth(value: (Double, Double) => Unit): Self = StObject.set(x, "setLineWidth", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetShadow(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setShadow", js.Any.fromFunction5(value))
        
        @scala.inline
        def setSetTextAlign(value: (Double, String) => Unit): Self = StObject.set(x, "setTextAlign", js.Any.fromFunction2(value))
        
        @scala.inline
        def setTranslate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "translate", js.Any.fromFunction3(value))
      }
    }
    
    @js.native
    trait DrawHTMLBoundApi extends StObject {
      
      def hideDrawHTMLBound(viewHash: Double): Unit = js.native
      
      def showDrawHTMLBound(viewHash: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
    }
    object DrawHTMLBoundApi {
      
      @scala.inline
      def apply(
        hideDrawHTMLBound: Double => Unit,
        showDrawHTMLBound: (Double, Double, Double, Double, Double) => Unit
      ): DrawHTMLBoundApi = {
        val __obj = js.Dynamic.literal(hideDrawHTMLBound = js.Any.fromFunction1(hideDrawHTMLBound), showDrawHTMLBound = js.Any.fromFunction5(showDrawHTMLBound))
        __obj.asInstanceOf[DrawHTMLBoundApi]
      }
      
      @scala.inline
      implicit class DrawHTMLBoundApiMutableBuilder[Self <: DrawHTMLBoundApi] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHideDrawHTMLBound(value: Double => Unit): Self = StObject.set(x, "hideDrawHTMLBound", js.Any.fromFunction1(value))
        
        @scala.inline
        def setShowDrawHTMLBound(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "showDrawHTMLBound", js.Any.fromFunction5(value))
      }
    }
    
    @js.native
    trait ImageApi extends StObject {
      
      def createImage(imageId: Double): Unit = js.native
      
      def getPixels(imageId: Double, callbackIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
      
      def loadImage(imageId: Double, src: String): Unit = js.native
      
      def recycleImage(imageId: Double): Unit = js.native
    }
    object ImageApi {
      
      @scala.inline
      def apply(
        createImage: Double => Unit,
        getPixels: (Double, Double, Double, Double, Double, Double) => Unit,
        loadImage: (Double, String) => Unit,
        recycleImage: Double => Unit
      ): ImageApi = {
        val __obj = js.Dynamic.literal(createImage = js.Any.fromFunction1(createImage), getPixels = js.Any.fromFunction6(getPixels), loadImage = js.Any.fromFunction2(loadImage), recycleImage = js.Any.fromFunction1(recycleImage))
        __obj.asInstanceOf[ImageApi]
      }
      
      @scala.inline
      implicit class ImageApiMutableBuilder[Self <: ImageApi] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateImage(value: Double => Unit): Self = StObject.set(x, "createImage", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetPixels(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "getPixels", js.Any.fromFunction6(value))
        
        @scala.inline
        def setLoadImage(value: (Double, String) => Unit): Self = StObject.set(x, "loadImage", js.Any.fromFunction2(value))
        
        @scala.inline
        def setRecycleImage(value: Double => Unit): Self = StObject.set(x, "recycleImage", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait SurfaceApi extends StObject {
      
      def createSurface(surfaceId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
      
      def lockCanvas(surfaceId: Double, canvasId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
      
      def onSurfaceBoundChange(surfaceId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
      
      def showFps(fps: Double): Unit = js.native
      
      def unlockCanvasAndPost(surfaceId: Double, canvasId: Double): Unit = js.native
    }
    object SurfaceApi {
      
      @scala.inline
      def apply(
        createSurface: (Double, Double, Double, Double, Double) => Unit,
        lockCanvas: (Double, Double, Double, Double, Double, Double) => Unit,
        onSurfaceBoundChange: (Double, Double, Double, Double, Double) => Unit,
        showFps: Double => Unit,
        unlockCanvasAndPost: (Double, Double) => Unit
      ): SurfaceApi = {
        val __obj = js.Dynamic.literal(createSurface = js.Any.fromFunction5(createSurface), lockCanvas = js.Any.fromFunction6(lockCanvas), onSurfaceBoundChange = js.Any.fromFunction5(onSurfaceBoundChange), showFps = js.Any.fromFunction1(showFps), unlockCanvasAndPost = js.Any.fromFunction2(unlockCanvasAndPost))
        __obj.asInstanceOf[SurfaceApi]
      }
      
      @scala.inline
      implicit class SurfaceApiMutableBuilder[Self <: SurfaceApi] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateSurface(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "createSurface", js.Any.fromFunction5(value))
        
        @scala.inline
        def setLockCanvas(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "lockCanvas", js.Any.fromFunction6(value))
        
        @scala.inline
        def setOnSurfaceBoundChange(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onSurfaceBoundChange", js.Any.fromFunction5(value))
        
        @scala.inline
        def setShowFps(value: Double => Unit): Self = StObject.set(x, "showFps", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUnlockCanvasAndPost(value: (Double, Double) => Unit): Self = StObject.set(x, "unlockCanvasAndPost", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait WebViewApi extends StObject {
      
      def createWebView(viewHash: Double): Unit = js.native
      
      def destroyWebView(viewHash: Double): Unit = js.native
      
      def webViewBoundChange(viewHash: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
      
      def webViewGoBack(viewHash: Double): Unit = js.native
      
      def webViewLoadUrl(viewHash: Double, url: String): Unit = js.native
      
      def webViewReload(viewHash: Double): Unit = js.native
    }
    object WebViewApi {
      
      @scala.inline
      def apply(
        createWebView: Double => Unit,
        destroyWebView: Double => Unit,
        webViewBoundChange: (Double, Double, Double, Double, Double) => Unit,
        webViewGoBack: Double => Unit,
        webViewLoadUrl: (Double, String) => Unit,
        webViewReload: Double => Unit
      ): WebViewApi = {
        val __obj = js.Dynamic.literal(createWebView = js.Any.fromFunction1(createWebView), destroyWebView = js.Any.fromFunction1(destroyWebView), webViewBoundChange = js.Any.fromFunction5(webViewBoundChange), webViewGoBack = js.Any.fromFunction1(webViewGoBack), webViewLoadUrl = js.Any.fromFunction2(webViewLoadUrl), webViewReload = js.Any.fromFunction1(webViewReload))
        __obj.asInstanceOf[WebViewApi]
      }
      
      @scala.inline
      implicit class WebViewApiMutableBuilder[Self <: WebViewApi] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateWebView(value: Double => Unit): Self = StObject.set(x, "createWebView", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDestroyWebView(value: Double => Unit): Self = StObject.set(x, "destroyWebView", js.Any.fromFunction1(value))
        
        @scala.inline
        def setWebViewBoundChange(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "webViewBoundChange", js.Any.fromFunction5(value))
        
        @scala.inline
        def setWebViewGoBack(value: Double => Unit): Self = StObject.set(x, "webViewGoBack", js.Any.fromFunction1(value))
        
        @scala.inline
        def setWebViewLoadUrl(value: (Double, String) => Unit): Self = StObject.set(x, "webViewLoadUrl", js.Any.fromFunction2(value))
        
        @scala.inline
        def setWebViewReload(value: Double => Unit): Self = StObject.set(x, "webViewReload", js.Any.fromFunction1(value))
      }
    }
  }
  
  @js.native
  trait NativeCanvas extends Canvas {
    
    var canvasId: js.Any = js.native
    
    /* protected */ def createCanvasImpl(): Unit = js.native
  }
  
  @js.native
  trait NativeEditText extends EditText {
    
    /* private */ def computeTextArea(): js.Any = js.native
    
    var mRectTmp: js.Any = js.native
  }
  
  @js.native
  trait NativeHtmlView extends HtmlView {
    
    var mRectDrawHTMLBoundTmp: js.Any = js.native
  }
  
  @js.native
  trait NativeImage extends NetImage {
    
    var bottomBorder: js.Array[Double] = js.native
    
    var getPixelsCallbacks: js.Any = js.native
    
    var imageId: Double = js.native
    
    var leftBorder: js.Array[Double] = js.native
    
    var rightBorder: js.Array[Double] = js.native
    
    var topBorder: js.Array[Double] = js.native
  }
  
  @js.native
  trait NativeSurface extends Surface {
    
    var lockedCanvas: js.Any = js.native
    
    var surfaceId: js.Any = js.native
  }
  object NativeSurface {
    
    @scala.inline
    def apply(
      _showFPSNode: js.Any,
      initCanvasBound: () => Unit,
      initImpl: () => Unit,
      isValid: () => Boolean,
      lockCanvas: Rect => Canvas,
      lockCanvasImpl: (Double, Double, Double, Double) => Canvas,
      lockedCanvas: js.Any,
      mCanvasBound: Rect,
      mCanvasElement: js.Any,
      mLockSaveCount: js.Any,
      mLockedRect: js.Any,
      mSupportDirtyDraw: Boolean,
      notifyBoundChange: () => Unit,
      showFps: Double => Unit,
      surfaceId: js.Any,
      unlockCanvasAndPost: Canvas => Unit,
      viewRoot: js.Any
    ): NativeSurface = {
      val __obj = js.Dynamic.literal(_showFPSNode = _showFPSNode.asInstanceOf[js.Any], initCanvasBound = js.Any.fromFunction0(initCanvasBound), initImpl = js.Any.fromFunction0(initImpl), isValid = js.Any.fromFunction0(isValid), lockCanvas = js.Any.fromFunction1(lockCanvas), lockCanvasImpl = js.Any.fromFunction4(lockCanvasImpl), lockedCanvas = lockedCanvas.asInstanceOf[js.Any], mCanvasBound = mCanvasBound.asInstanceOf[js.Any], mCanvasElement = mCanvasElement.asInstanceOf[js.Any], mLockSaveCount = mLockSaveCount.asInstanceOf[js.Any], mLockedRect = mLockedRect.asInstanceOf[js.Any], mSupportDirtyDraw = mSupportDirtyDraw.asInstanceOf[js.Any], notifyBoundChange = js.Any.fromFunction0(notifyBoundChange), showFps = js.Any.fromFunction1(showFps), surfaceId = surfaceId.asInstanceOf[js.Any], unlockCanvasAndPost = js.Any.fromFunction1(unlockCanvasAndPost), viewRoot = viewRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSurface]
    }
    
    @scala.inline
    implicit class NativeSurfaceMutableBuilder[Self <: NativeSurface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLockedCanvas(value: js.Any): Self = StObject.set(x, "lockedCanvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurfaceId(value: js.Any): Self = StObject.set(x, "surfaceId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeWebView extends WebView {
    
    var mBoundRect: js.Any = js.native
    
    var mCanGoBack: js.Any = js.native
    
    var mLocationTmp: js.Any = js.native
    
    var mRectTmp: js.Any = js.native
    
    var mTitle: js.Any = js.native
    
    var mUrl: js.Any = js.native
  }
}
