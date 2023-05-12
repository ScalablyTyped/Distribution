package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantEntitlementRequest extends StObject {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.undefined
  
  /**
    * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the subscriber or end user.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The type of encryption that will be used on the output that is associated with this entitlement. Allowable encryption types: static-key, speke.
    */
  var Encryption: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Encryption] = js.undefined
  
  /**
    * An indication of whether the new entitlement should be enabled or disabled as soon as it is created. If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to ENABLED.
    */
  var EntitlementStatus: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.EntitlementStatus] = js.undefined
  
  /**
    * The name of the entitlement. This value must be unique within the current flow.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flows using your content as the source.
    */
  var Subscribers: listOfString
}
object GrantEntitlementRequest {
  
  inline def apply(Subscribers: listOfString): GrantEntitlementRequest = {
    val __obj = js.Dynamic.literal(Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantEntitlementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrantEntitlementRequest] (val x: Self) extends AnyVal {
    
    inline def setDataTransferSubscriberFeePercent(value: integer): Self = StObject.set(x, "DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    inline def setDataTransferSubscriberFeePercentUndefined: Self = StObject.set(x, "DataTransferSubscriberFeePercent", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setEntitlementStatus(value: EntitlementStatus): Self = StObject.set(x, "EntitlementStatus", value.asInstanceOf[js.Any])
    
    inline def setEntitlementStatusUndefined: Self = StObject.set(x, "EntitlementStatus", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSubscribers(value: listOfString): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: string*): Self = StObject.set(x, "Subscribers", js.Array(value*))
  }
}
