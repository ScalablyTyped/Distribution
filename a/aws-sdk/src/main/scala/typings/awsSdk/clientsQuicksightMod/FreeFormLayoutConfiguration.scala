package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeFormLayoutConfiguration extends StObject {
  
  var CanvasSizeOptions: js.UndefOr[FreeFormLayoutCanvasSizeOptions] = js.undefined
  
  /**
    * The elements that are included in a free-form layout.
    */
  var Elements: FreeFromLayoutElementList
}
object FreeFormLayoutConfiguration {
  
  inline def apply(Elements: FreeFromLayoutElementList): FreeFormLayoutConfiguration = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeFormLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeFormLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCanvasSizeOptions(value: FreeFormLayoutCanvasSizeOptions): Self = StObject.set(x, "CanvasSizeOptions", value.asInstanceOf[js.Any])
    
    inline def setCanvasSizeOptionsUndefined: Self = StObject.set(x, "CanvasSizeOptions", js.undefined)
    
    inline def setElements(value: FreeFromLayoutElementList): Self = StObject.set(x, "Elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: FreeFormLayoutElement*): Self = StObject.set(x, "Elements", js.Array(value*))
  }
}
