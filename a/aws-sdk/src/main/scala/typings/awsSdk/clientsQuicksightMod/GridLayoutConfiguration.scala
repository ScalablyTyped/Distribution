package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLayoutConfiguration extends StObject {
  
  var CanvasSizeOptions: js.UndefOr[GridLayoutCanvasSizeOptions] = js.undefined
  
  /**
    * The elements that are included in a grid layout.
    */
  var Elements: GridLayoutElementList
}
object GridLayoutConfiguration {
  
  inline def apply(Elements: GridLayoutElementList): GridLayoutConfiguration = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCanvasSizeOptions(value: GridLayoutCanvasSizeOptions): Self = StObject.set(x, "CanvasSizeOptions", value.asInstanceOf[js.Any])
    
    inline def setCanvasSizeOptionsUndefined: Self = StObject.set(x, "CanvasSizeOptions", js.undefined)
    
    inline def setElements(value: GridLayoutElementList): Self = StObject.set(x, "Elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: GridLayoutElement*): Self = StObject.set(x, "Elements", js.Array(value*))
  }
}
