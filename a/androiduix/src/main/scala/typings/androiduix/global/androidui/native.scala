package typings.androiduix.global.androidui

import typings.androiduix.android.content.Context
import typings.androiduix.androidui.native.NativeApi.DrawHTMLBoundApi
import typings.androiduix.androidui.native.NativeApi.ImageApi
import typings.androiduix.androidui.native.NativeApi.WebViewApi
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("androidui.native")
@js.native
object native extends js.Object {
  
  @js.native
  class NativeApi ()
    extends typings.androiduix.androidui.native.NativeApi
  /* static members */
  @js.native
  object NativeApi extends js.Object {
    
    var canvas: typings.androiduix.androidui.native.NativeApi.CanvasApi = js.native
    
    var drawHTML: DrawHTMLBoundApi = js.native
    
    var image: ImageApi = js.native
    
    var surface: typings.androiduix.androidui.native.NativeApi.SurfaceApi = js.native
    
    var webView: WebViewApi = js.native
    
    @js.native
    class CanvasApi ()
      extends typings.androiduix.androidui.native.NativeApi.CanvasApi
    
    @js.native
    class SurfaceApi ()
      extends typings.androiduix.androidui.native.NativeApi.SurfaceApi
  }
  
  @js.native
  class NativeCanvas ()
    extends typings.androiduix.androidui.native.NativeCanvas
  /* static members */
  @js.native
  object NativeCanvas extends js.Object {
    
    /* private */ def applyTextMeasure(cacheMeasureTextSize: js.Any, defaultWidth: js.Any, widths: js.Any): js.Any = js.native
  }
  
  @js.native
  class NativeEditText ()
    extends typings.androiduix.androidui.native.NativeEditText
  
  @js.native
  class NativeHtmlView ()
    extends typings.androiduix.androidui.native.NativeHtmlView
  
  @js.native
  class NativeImage ()
    extends typings.androiduix.androidui.native.NativeImage
  /* static members */
  @js.native
  object NativeImage extends js.Object {
    
    /* private */ def notifyGetPixels(imageId: js.Any, callBackIndex: js.Any, data: js.Any): js.Any = js.native
    
    /* private */ def notifyLoadError(imageId: js.Any): js.Any = js.native
    
    /* private */ def notifyLoadFinish(
      imageId: js.Any,
      width: js.Any,
      height: js.Any,
      leftBorder: js.Any,
      topBorder: js.Any,
      rightBorder: js.Any,
      bottomBorder: js.Any
    ): js.Any = js.native
  }
  
  @js.native
  class NativeSurface ()
    extends typings.androiduix.androidui.native.NativeSurface
  /* static members */
  @js.native
  object NativeSurface extends js.Object {
    
    /* private */ def notifySurfaceReady(surfaceId: js.Any): js.Any = js.native
    
    /* private */ def notifySurfaceSupportDirtyDraw(surfaceId: js.Any, dirtyDrawSupport: js.Any): js.Any = js.native
  }
  
  @js.native
  class NativeWebView protected ()
    extends typings.androiduix.androidui.native.NativeWebView {
    def this(context: Context, bindElement: HTMLElement, defStyle: js.Any) = this()
  }
  /* static members */
  @js.native
  object NativeWebView extends js.Object {
    
    /* private */ def notifyLoadFinish(viewHash: js.Any, url: js.Any, title: js.Any): js.Any = js.native
    
    /* private */ def notifyWebViewHistoryChange(viewHash: js.Any, currentHistoryIndex: js.Any, historySize: js.Any): js.Any = js.native
  }
}
