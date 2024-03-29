package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeGroupDetails extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the attribute group.
    */
  var arn: js.UndefOr[AttributeGroupArn] = js.undefined
  
  /**
    * The service principal that created the attribute group.
    */
  var createdBy: js.UndefOr[CreatedBy] = js.undefined
  
  /**
    * The unique identifier of the attribute group.
    */
  var id: js.UndefOr[AttributeGroupId] = js.undefined
  
  /**
    *   This field is no longer supported. We recommend you don't use the field when using ListAttributeGroupsForApplication.    The name of the attribute group. 
    */
  var name: js.UndefOr[Name] = js.undefined
}
object AttributeGroupDetails {
  
  inline def apply(): AttributeGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeGroupDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeGroupDetails] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AttributeGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setId(value: AttributeGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
