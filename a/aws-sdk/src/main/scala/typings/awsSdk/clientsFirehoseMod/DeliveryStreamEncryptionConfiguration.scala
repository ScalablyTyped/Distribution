package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryStreamEncryptionConfiguration extends StObject {
  
  /**
    * Provides details in case one of the following operations fails due to an error related to KMS: CreateDeliveryStream, DeleteDeliveryStream, StartDeliveryStreamEncryption, StopDeliveryStreamEncryption.
    */
  var FailureDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.FailureDescription] = js.undefined
  
  /**
    * If KeyType is CUSTOMER_MANAGED_CMK, this field contains the ARN of the customer managed CMK. If KeyType is Amazon Web Services_OWNED_CMK, DeliveryStreamEncryptionConfiguration doesn't contain a value for KeyARN.
    */
  var KeyARN: js.UndefOr[AWSKMSKeyARN] = js.undefined
  
  /**
    * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is Amazon Web Services_OWNED_CMK. For more information about CMKs, see Customer Master Keys (CMKs).
    */
  var KeyType: js.UndefOr[typings.awsSdk.clientsFirehoseMod.KeyType] = js.undefined
  
  /**
    * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different values of this status, see StartDeliveryStreamEncryption and StopDeliveryStreamEncryption. If this status is ENABLING_FAILED or DISABLING_FAILED, it is the status of the most recent attempt to enable or disable SSE, respectively.
    */
  var Status: js.UndefOr[DeliveryStreamEncryptionStatus] = js.undefined
}
object DeliveryStreamEncryptionConfiguration {
  
  inline def apply(): DeliveryStreamEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryStreamEncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryStreamEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFailureDescription(value: FailureDescription): Self = StObject.set(x, "FailureDescription", value.asInstanceOf[js.Any])
    
    inline def setFailureDescriptionUndefined: Self = StObject.set(x, "FailureDescription", js.undefined)
    
    inline def setKeyARN(value: AWSKMSKeyARN): Self = StObject.set(x, "KeyARN", value.asInstanceOf[js.Any])
    
    inline def setKeyARNUndefined: Self = StObject.set(x, "KeyARN", js.undefined)
    
    inline def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "KeyType", js.undefined)
    
    inline def setStatus(value: DeliveryStreamEncryptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
