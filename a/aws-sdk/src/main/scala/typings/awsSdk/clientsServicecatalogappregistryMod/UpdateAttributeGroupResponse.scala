package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAttributeGroupResponse extends StObject {
  
  /**
    * The updated information of the attribute group.
    */
  var attributeGroup: js.UndefOr[AttributeGroup] = js.undefined
}
object UpdateAttributeGroupResponse {
  
  inline def apply(): UpdateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAttributeGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAttributeGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributeGroup(value: AttributeGroup): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroupUndefined: Self = StObject.set(x, "attributeGroup", js.undefined)
  }
}
