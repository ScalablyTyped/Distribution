package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceAttributeRequest extends StObject {
  
  /**
    * The type of attribute.  Only allowlisted customers can consume USE_CUSTOM_TTS_VOICES. To access this feature, contact Amazon Web Services Support for allowlisting. 
    */
  var AttributeType: InstanceAttributeType
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The value for the attribute. Maximum character limit is 100. 
    */
  var Value: InstanceAttributeValue
}
object UpdateInstanceAttributeRequest {
  
  inline def apply(AttributeType: InstanceAttributeType, InstanceId: InstanceId, Value: InstanceAttributeValue): UpdateInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(AttributeType = AttributeType.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceAttributeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInstanceAttributeRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributeType(value: InstanceAttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: InstanceAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
