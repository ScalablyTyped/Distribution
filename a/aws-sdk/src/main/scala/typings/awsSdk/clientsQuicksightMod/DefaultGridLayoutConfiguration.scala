package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultGridLayoutConfiguration extends StObject {
  
  /**
    * Determines the screen canvas size options for a grid layout.
    */
  var CanvasSizeOptions: GridLayoutCanvasSizeOptions
}
object DefaultGridLayoutConfiguration {
  
  inline def apply(CanvasSizeOptions: GridLayoutCanvasSizeOptions): DefaultGridLayoutConfiguration = {
    val __obj = js.Dynamic.literal(CanvasSizeOptions = CanvasSizeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultGridLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultGridLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCanvasSizeOptions(value: GridLayoutCanvasSizeOptions): Self = StObject.set(x, "CanvasSizeOptions", value.asInstanceOf[js.Any])
  }
}
