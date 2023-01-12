package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAttributeGroupResponse extends StObject {
  
  /**
    * Information about the attribute group.
    */
  var attributeGroup: js.UndefOr[AttributeGroup] = js.undefined
}
object CreateAttributeGroupResponse {
  
  inline def apply(): CreateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAttributeGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAttributeGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributeGroup(value: AttributeGroup): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroupUndefined: Self = StObject.set(x, "attributeGroup", js.undefined)
  }
}
