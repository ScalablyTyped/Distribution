package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactAttributesRequest extends StObject {
  
  /**
    * The identifier of the initial contact.
    */
  var InitialContactId: ContactId
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object GetContactAttributesRequest {
  
  inline def apply(InitialContactId: ContactId, InstanceId: InstanceId): GetContactAttributesRequest = {
    val __obj = js.Dynamic.literal(InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactAttributesRequest]
  }
  
  extension [Self <: GetContactAttributesRequest](x: Self) {
    
    inline def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
