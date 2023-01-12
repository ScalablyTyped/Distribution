package typings.antvGLite

import typings.antvGLite.anon.PartialDataURLOptions
import typings.antvGLite.distTypesMod.CanvasLike
import typings.manaSyringe.mod.Syringe.DefinedToken
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesContextServiceMod {
  
  trait ContextService[Context] extends StObject {
    
    def applyCursorStyle(cursor: String): Unit
    
    def destroy(): Unit
    
    def getBoundingClientRect(): js.UndefOr[DOMRect]
    
    def getContext(): Context | Null
    
    def getDPR(): Double
    
    def getDomElement(): CanvasLike | Null
    
    def init(): js.Promise[Unit]
    
    def resize(width: Double, height: Double): Unit
    
    def toDataURL(options: PartialDataURLOptions): js.Promise[String]
  }
  object ContextService {
    
    @JSImport("@antv/g-lite/dist/services/ContextService", "ContextService")
    @js.native
    val ^ : DefinedToken = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextService[?], Context] (val x: Self & ContextService[Context]) extends AnyVal {
      
      inline def setApplyCursorStyle(value: String => Unit): Self = StObject.set(x, "applyCursorStyle", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetBoundingClientRect(value: () => js.UndefOr[DOMRect]): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
      
      inline def setGetContext(value: () => Context | Null): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
      
      inline def setGetDPR(value: () => Double): Self = StObject.set(x, "getDPR", js.Any.fromFunction0(value))
      
      inline def setGetDomElement(value: () => CanvasLike | Null): Self = StObject.set(x, "getDomElement", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => js.Promise[Unit]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setResize(value: (Double, Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
      inline def setToDataURL(value: PartialDataURLOptions => js.Promise[String]): Self = StObject.set(x, "toDataURL", js.Any.fromFunction1(value))
    }
  }
  
  trait DataURLOptions extends StObject {
    
    /**
      * The image quality between 0 and 1 for image/jpeg and image/webp.
      */
    var encoderOptions: Double
    
    /**
      * The default type is image/png.
      */
    var `type`: DataURLType
  }
  object DataURLOptions {
    
    inline def apply(encoderOptions: Double, `type`: DataURLType): DataURLOptions = {
      val __obj = js.Dynamic.literal(encoderOptions = encoderOptions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataURLOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataURLOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoderOptions(value: Double): Self = StObject.set(x, "encoderOptions", value.asInstanceOf[js.Any])
      
      inline def setType(value: DataURLType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteStrings.imageSlashpng
    - typings.antvGLite.antvGLiteStrings.imageSlashjpeg
    - typings.antvGLite.antvGLiteStrings.imageSlashwebp
    - typings.antvGLite.antvGLiteStrings.imageSlashbmp
  */
  trait DataURLType extends StObject
  object DataURLType {
    
    inline def imageSlashbmp: typings.antvGLite.antvGLiteStrings.imageSlashbmp = "image/bmp".asInstanceOf[typings.antvGLite.antvGLiteStrings.imageSlashbmp]
    
    inline def imageSlashjpeg: typings.antvGLite.antvGLiteStrings.imageSlashjpeg = "image/jpeg".asInstanceOf[typings.antvGLite.antvGLiteStrings.imageSlashjpeg]
    
    inline def imageSlashpng: typings.antvGLite.antvGLiteStrings.imageSlashpng = "image/png".asInstanceOf[typings.antvGLite.antvGLiteStrings.imageSlashpng]
    
    inline def imageSlashwebp: typings.antvGLite.antvGLiteStrings.imageSlashwebp = "image/webp".asInstanceOf[typings.antvGLite.antvGLiteStrings.imageSlashwebp]
  }
}
