package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeFormSectionLayoutConfiguration extends StObject {
  
  /**
    * The elements that are included in the free-form layout.
    */
  var Elements: FreeFromLayoutElementList
}
object FreeFormSectionLayoutConfiguration {
  
  inline def apply(Elements: FreeFromLayoutElementList): FreeFormSectionLayoutConfiguration = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeFormSectionLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeFormSectionLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setElements(value: FreeFromLayoutElementList): Self = StObject.set(x, "Elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: FreeFormLayoutElement*): Self = StObject.set(x, "Elements", js.Array(value*))
  }
}
