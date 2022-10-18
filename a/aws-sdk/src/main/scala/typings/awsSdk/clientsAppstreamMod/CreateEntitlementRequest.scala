package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEntitlementRequest extends StObject {
  
  /**
    * Specifies whether all or selected apps are entitled.
    */
  var AppVisibility: typings.awsSdk.clientsAppstreamMod.AppVisibility
  
  /**
    * The attributes of the entitlement.
    */
  var Attributes: EntitlementAttributeList
  
  /**
    * The description of the entitlement.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Description] = js.undefined
  
  /**
    * The name of the entitlement.
    */
  var Name: typings.awsSdk.clientsAppstreamMod.Name
  
  /**
    * The name of the stack with which the entitlement is associated.
    */
  var StackName: Name
}
object CreateEntitlementRequest {
  
  inline def apply(AppVisibility: AppVisibility, Attributes: EntitlementAttributeList, Name: Name, StackName: Name): CreateEntitlementRequest = {
    val __obj = js.Dynamic.literal(AppVisibility = AppVisibility.asInstanceOf[js.Any], Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEntitlementRequest]
  }
  
  extension [Self <: CreateEntitlementRequest](x: Self) {
    
    inline def setAppVisibility(value: AppVisibility): Self = StObject.set(x, "AppVisibility", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: EntitlementAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: EntitlementAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: Name): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
