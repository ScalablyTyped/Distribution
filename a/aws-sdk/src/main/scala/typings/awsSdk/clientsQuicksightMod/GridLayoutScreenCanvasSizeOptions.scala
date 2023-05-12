package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLayoutScreenCanvasSizeOptions extends StObject {
  
  /**
    * The width that the view port will be optimized for when the layout renders.
    */
  var OptimizedViewPortWidth: js.UndefOr[PixelLength] = js.undefined
  
  /**
    * This value determines the layout behavior when the viewport is resized.    FIXED: A fixed width will be used when optimizing the layout. In the Amazon QuickSight console, this option is called Classic.    RESPONSIVE: The width of the canvas will be responsive and optimized to the view port. In the Amazon QuickSight console, this option is called Tiled.  
    */
  var ResizeOption: typings.awsSdk.clientsQuicksightMod.ResizeOption
}
object GridLayoutScreenCanvasSizeOptions {
  
  inline def apply(ResizeOption: ResizeOption): GridLayoutScreenCanvasSizeOptions = {
    val __obj = js.Dynamic.literal(ResizeOption = ResizeOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayoutScreenCanvasSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridLayoutScreenCanvasSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setOptimizedViewPortWidth(value: PixelLength): Self = StObject.set(x, "OptimizedViewPortWidth", value.asInstanceOf[js.Any])
    
    inline def setOptimizedViewPortWidthUndefined: Self = StObject.set(x, "OptimizedViewPortWidth", js.undefined)
    
    inline def setResizeOption(value: ResizeOption): Self = StObject.set(x, "ResizeOption", value.asInstanceOf[js.Any])
  }
}
