package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEntitlementRequest extends StObject {
  
  /**
    * Specifies whether all or only selected apps are entitled.
    */
  var AppVisibility: js.UndefOr[typings.awsSdk.clientsAppstreamMod.AppVisibility] = js.undefined
  
  /**
    * The attributes of the entitlement.
    */
  var Attributes: js.UndefOr[EntitlementAttributeList] = js.undefined
  
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
object UpdateEntitlementRequest {
  
  inline def apply(Name: Name, StackName: Name): UpdateEntitlementRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntitlementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEntitlementRequest] (val x: Self) extends AnyVal {
    
    inline def setAppVisibility(value: AppVisibility): Self = StObject.set(x, "AppVisibility", value.asInstanceOf[js.Any])
    
    inline def setAppVisibilityUndefined: Self = StObject.set(x, "AppVisibility", js.undefined)
    
    inline def setAttributes(value: EntitlementAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: EntitlementAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: Name): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
