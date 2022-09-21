package typings.antvGLite.anon

import typings.antvGLite.abstractRendererMod.IRenderer
import typings.antvGLite.distTypesMod.CanvasLike
import typings.antvGLite.distTypesMod.ColorType
import typings.antvGLite.distTypesMod.Cursor
import typings.antvGLite.distTypesMod.InteractivePointerEvent
import typings.std.Document
import typings.std.FrameRequestCallback
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g-lite.@antv/g-lite/dist/types.CanvasConfig> */
trait PartialCanvasConfig extends StObject {
  
  var background: js.UndefOr[ColorType] = js.undefined
  
  var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
  
  var canvas: js.UndefOr[CanvasLike] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var createImage: js.UndefOr[js.Function1[/* src */ String, HTMLImageElement]] = js.undefined
  
  var cursor: js.UndefOr[Cursor] = js.undefined
  
  var devicePixelRatio: js.UndefOr[Double] = js.undefined
  
  var document: js.UndefOr[Document] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var isMouseEvent: js.UndefOr[
    js.Function1[/* event */ InteractivePointerEvent, /* is std.MouseEvent */ Boolean]
  ] = js.undefined
  
  var isTouchEvent: js.UndefOr[
    js.Function1[/* event */ InteractivePointerEvent, /* is std.TouchEvent */ Boolean]
  ] = js.undefined
  
  var offscreenCanvas: js.UndefOr[CanvasLike] = js.undefined
  
  var renderer: js.UndefOr[IRenderer] = js.undefined
  
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ FrameRequestCallback, Double]] = js.undefined
  
  var supportsPointerEvents: js.UndefOr[Boolean] = js.undefined
  
  var supportsTouchEvents: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialCanvasConfig {
  
  inline def apply(): PartialCanvasConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCanvasConfig]
  }
  
  extension [Self <: PartialCanvasConfig](x: Self) {
    
    inline def setBackground(value: ColorType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCancelAnimationFrame(value: /* id */ Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
    
    inline def setCancelAnimationFrameUndefined: Self = StObject.set(x, "cancelAnimationFrame", js.undefined)
    
    inline def setCanvas(value: CanvasLike): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCreateImage(value: /* src */ String => HTMLImageElement): Self = StObject.set(x, "createImage", js.Any.fromFunction1(value))
    
    inline def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
    
    inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelRatioUndefined: Self = StObject.set(x, "devicePixelRatio", js.undefined)
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsMouseEvent(value: /* event */ InteractivePointerEvent => /* is std.MouseEvent */ Boolean): Self = StObject.set(x, "isMouseEvent", js.Any.fromFunction1(value))
    
    inline def setIsMouseEventUndefined: Self = StObject.set(x, "isMouseEvent", js.undefined)
    
    inline def setIsTouchEvent(value: /* event */ InteractivePointerEvent => /* is std.TouchEvent */ Boolean): Self = StObject.set(x, "isTouchEvent", js.Any.fromFunction1(value))
    
    inline def setIsTouchEventUndefined: Self = StObject.set(x, "isTouchEvent", js.undefined)
    
    inline def setOffscreenCanvas(value: CanvasLike): Self = StObject.set(x, "offscreenCanvas", value.asInstanceOf[js.Any])
    
    inline def setOffscreenCanvasUndefined: Self = StObject.set(x, "offscreenCanvas", js.undefined)
    
    inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setRequestAnimationFrame(value: /* callback */ FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
    
    inline def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
    
    inline def setSupportsPointerEvents(value: Boolean): Self = StObject.set(x, "supportsPointerEvents", value.asInstanceOf[js.Any])
    
    inline def setSupportsPointerEventsUndefined: Self = StObject.set(x, "supportsPointerEvents", js.undefined)
    
    inline def setSupportsTouchEvents(value: Boolean): Self = StObject.set(x, "supportsTouchEvents", value.asInstanceOf[js.Any])
    
    inline def setSupportsTouchEventsUndefined: Self = StObject.set(x, "supportsTouchEvents", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
