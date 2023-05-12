package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeFormLayoutScreenCanvasSizeOptions extends StObject {
  
  /**
    * The width that the view port will be optimized for when the layout renders.
    */
  var OptimizedViewPortWidth: PixelLength
}
object FreeFormLayoutScreenCanvasSizeOptions {
  
  inline def apply(OptimizedViewPortWidth: PixelLength): FreeFormLayoutScreenCanvasSizeOptions = {
    val __obj = js.Dynamic.literal(OptimizedViewPortWidth = OptimizedViewPortWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeFormLayoutScreenCanvasSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeFormLayoutScreenCanvasSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setOptimizedViewPortWidth(value: PixelLength): Self = StObject.set(x, "OptimizedViewPortWidth", value.asInstanceOf[js.Any])
  }
}
