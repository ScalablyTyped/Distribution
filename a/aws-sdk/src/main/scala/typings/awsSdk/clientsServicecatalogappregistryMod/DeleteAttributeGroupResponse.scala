package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttributeGroupResponse extends StObject {
  
  /**
    * Information about the deleted attribute group.
    */
  var attributeGroup: js.UndefOr[AttributeGroupSummary] = js.undefined
}
object DeleteAttributeGroupResponse {
  
  inline def apply(): DeleteAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAttributeGroupResponse]
  }
  
  extension [Self <: DeleteAttributeGroupResponse](x: Self) {
    
    inline def setAttributeGroup(value: AttributeGroupSummary): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroupUndefined: Self = StObject.set(x, "attributeGroup", js.undefined)
  }
}
