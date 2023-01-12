package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entitlement extends StObject {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.undefined
  
  /**
    * A description of the entitlement.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The type of encryption that will be used on the output that is associated with this entitlement.
    */
  var Encryption: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Encryption] = js.undefined
  
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: string
  
  /**
    * An indication of whether the entitlement is enabled.
    */
  var EntitlementStatus: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.EntitlementStatus] = js.undefined
  
  /**
    * The name of the entitlement.
    */
  var Name: string
  
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
    */
  var Subscribers: listOfString
}
object Entitlement {
  
  inline def apply(EntitlementArn: string, Name: string, Subscribers: listOfString): Entitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entitlement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entitlement] (val x: Self) extends AnyVal {
    
    inline def setDataTransferSubscriberFeePercent(value: integer): Self = StObject.set(x, "DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    inline def setDataTransferSubscriberFeePercentUndefined: Self = StObject.set(x, "DataTransferSubscriberFeePercent", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    inline def setEntitlementStatus(value: EntitlementStatus): Self = StObject.set(x, "EntitlementStatus", value.asInstanceOf[js.Any])
    
    inline def setEntitlementStatusUndefined: Self = StObject.set(x, "EntitlementStatus", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSubscribers(value: listOfString): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: string*): Self = StObject.set(x, "Subscribers", js.Array(value*))
  }
}
