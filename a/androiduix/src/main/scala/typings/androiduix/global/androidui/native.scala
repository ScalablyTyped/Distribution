package typings.androiduix.global.androidui

import typings.androiduix.android.content.Context
import typings.androiduix.androidui.native.NativeApi.DrawHTMLBoundApi
import typings.androiduix.androidui.native.NativeApi.ImageApi
import typings.androiduix.androidui.native.NativeApi.WebViewApi
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object native {
  
  @JSGlobal("androidui.native.NativeApi")
  @js.native
  class NativeApi ()
    extends typings.androiduix.androidui.native.NativeApi
  object NativeApi {
    
    @JSGlobal("androidui.native.NativeApi")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("androidui.native.NativeApi.CanvasApi")
    @js.native
    class CanvasApi ()
      extends typings.androiduix.androidui.native.NativeApi.CanvasApi
    
    @JSGlobal("androidui.native.NativeApi.SurfaceApi")
    @js.native
    class SurfaceApi ()
      extends typings.androiduix.androidui.native.NativeApi.SurfaceApi
    
    /* static member */
    @JSGlobal("androidui.native.NativeApi.canvas")
    @js.native
    def canvas: typings.androiduix.androidui.native.NativeApi.CanvasApi = js.native
    @scala.inline
    def canvas_=(x: typings.androiduix.androidui.native.NativeApi.CanvasApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canvas")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("androidui.native.NativeApi.drawHTML")
    @js.native
    def drawHTML: DrawHTMLBoundApi = js.native
    @scala.inline
    def drawHTML_=(x: DrawHTMLBoundApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawHTML")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("androidui.native.NativeApi.image")
    @js.native
    def image: ImageApi = js.native
    @scala.inline
    def image_=(x: ImageApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("androidui.native.NativeApi.surface")
    @js.native
    def surface: typings.androiduix.androidui.native.NativeApi.SurfaceApi = js.native
    @scala.inline
    def surface_=(x: typings.androiduix.androidui.native.NativeApi.SurfaceApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("surface")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("androidui.native.NativeApi.webView")
    @js.native
    def webView: WebViewApi = js.native
    @scala.inline
    def webView_=(x: WebViewApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webView")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("androidui.native.NativeCanvas")
  @js.native
  class NativeCanvas ()
    extends typings.androiduix.androidui.native.NativeCanvas
  object NativeCanvas {
    
    /* static member */
    @JSGlobal("androidui.native.NativeCanvas.applyTextMeasure")
    @js.native
    def applyTextMeasure(cacheMeasureTextSize: js.Any, defaultWidth: js.Any, widths: js.Any): js.Any = js.native
  }
  
  @JSGlobal("androidui.native.NativeEditText")
  @js.native
  class NativeEditText ()
    extends typings.androiduix.androidui.native.NativeEditText
  
  @JSGlobal("androidui.native.NativeHtmlView")
  @js.native
  class NativeHtmlView ()
    extends typings.androiduix.androidui.native.NativeHtmlView
  
  @JSGlobal("androidui.native.NativeImage")
  @js.native
  class NativeImage ()
    extends typings.androiduix.androidui.native.NativeImage
  object NativeImage {
    
    /* static member */
    @JSGlobal("androidui.native.NativeImage.notifyGetPixels")
    @js.native
    def notifyGetPixels(imageId: js.Any, callBackIndex: js.Any, data: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("androidui.native.NativeImage.notifyLoadError")
    @js.native
    def notifyLoadError(imageId: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("androidui.native.NativeImage.notifyLoadFinish")
    @js.native
    def notifyLoadFinish(
      imageId: js.Any,
      width: js.Any,
      height: js.Any,
      leftBorder: js.Any,
      topBorder: js.Any,
      rightBorder: js.Any,
      bottomBorder: js.Any
    ): js.Any = js.native
  }
  
  @JSGlobal("androidui.native.NativeSurface")
  @js.native
  class NativeSurface ()
    extends typings.androiduix.androidui.native.NativeSurface
  object NativeSurface {
    
    /* static member */
    @JSGlobal("androidui.native.NativeSurface.notifySurfaceReady")
    @js.native
    def notifySurfaceReady(surfaceId: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("androidui.native.NativeSurface.notifySurfaceSupportDirtyDraw")
    @js.native
    def notifySurfaceSupportDirtyDraw(surfaceId: js.Any, dirtyDrawSupport: js.Any): js.Any = js.native
  }
  
  @JSGlobal("androidui.native.NativeWebView")
  @js.native
  class NativeWebView protected ()
    extends typings.androiduix.androidui.native.NativeWebView {
    def this(context: Context, bindElement: HTMLElement, defStyle: js.Any) = this()
  }
  object NativeWebView {
    
    /* static member */
    @JSGlobal("androidui.native.NativeWebView.notifyLoadFinish")
    @js.native
    def notifyLoadFinish(viewHash: js.Any, url: js.Any, title: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("androidui.native.NativeWebView.notifyWebViewHistoryChange")
    @js.native
    def notifyWebViewHistoryChange(viewHash: js.Any, currentHistoryIndex: js.Any, historySize: js.Any): js.Any = js.native
  }
}
