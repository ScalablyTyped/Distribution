package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceableItem extends StObject {
  
  /**
    * The list of attributes for a replaceable item.
    */
  var Attributes: ReplaceableAttributeList
  
  /**
    * The name of the replaceable item.
    */
  var Name: String
}
object ReplaceableItem {
  
  inline def apply(Attributes: ReplaceableAttributeList, Name: String): ReplaceableItem = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceableItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceableItem] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: ReplaceableAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: ReplaceableAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
