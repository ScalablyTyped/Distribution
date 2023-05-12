package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultFreeFormLayoutConfiguration extends StObject {
  
  /**
    * Determines the screen canvas size options for a free-form layout.
    */
  var CanvasSizeOptions: FreeFormLayoutCanvasSizeOptions
}
object DefaultFreeFormLayoutConfiguration {
  
  inline def apply(CanvasSizeOptions: FreeFormLayoutCanvasSizeOptions): DefaultFreeFormLayoutConfiguration = {
    val __obj = js.Dynamic.literal(CanvasSizeOptions = CanvasSizeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultFreeFormLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultFreeFormLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCanvasSizeOptions(value: FreeFormLayoutCanvasSizeOptions): Self = StObject.set(x, "CanvasSizeOptions", value.asInstanceOf[js.Any])
  }
}
