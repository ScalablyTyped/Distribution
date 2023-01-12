package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletableItem extends StObject {
  
  var Attributes: js.UndefOr[DeletableAttributeList] = js.undefined
  
  var Name: String
}
object DeletableItem {
  
  inline def apply(Name: String): DeletableItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletableItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletableItem] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: DeletableAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: DeletableAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
