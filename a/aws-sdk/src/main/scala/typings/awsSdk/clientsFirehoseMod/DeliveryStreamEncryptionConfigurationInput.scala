package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryStreamEncryptionConfigurationInput extends StObject {
  
  /**
    * If you set KeyType to CUSTOMER_MANAGED_CMK, you must specify the Amazon Resource Name (ARN) of the CMK. If you set KeyType to Amazon Web Services_OWNED_CMK, Kinesis Data Firehose uses a service-account CMK.
    */
  var KeyARN: js.UndefOr[AWSKMSKeyARN] = js.undefined
  
  /**
    * Indicates the type of customer master key (CMK) to use for encryption. The default setting is Amazon Web Services_OWNED_CMK. For more information about CMKs, see Customer Master Keys (CMKs). When you invoke CreateDeliveryStream or StartDeliveryStreamEncryption with KeyType set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation CreateGrant to create a grant that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and decryption. Kinesis Data Firehose manages that grant.  When you invoke StartDeliveryStreamEncryption to change the CMK for a delivery stream that is encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for retirement. You can use a CMK of type CUSTOMER_MANAGED_CMK to encrypt up to 500 delivery streams. If a CreateDeliveryStream or StartDeliveryStreamEncryption operation exceeds this limit, Kinesis Data Firehose throws a LimitExceededException.   To encrypt your delivery stream, use symmetric CMKs. Kinesis Data Firehose doesn't support asymmetric CMKs. For information about symmetric and asymmetric CMKs, see About Symmetric and Asymmetric CMKs in the Amazon Web Services Key Management Service developer guide. 
    */
  var KeyType: typings.awsSdk.clientsFirehoseMod.KeyType
}
object DeliveryStreamEncryptionConfigurationInput {
  
  inline def apply(KeyType: KeyType): DeliveryStreamEncryptionConfigurationInput = {
    val __obj = js.Dynamic.literal(KeyType = KeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamEncryptionConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryStreamEncryptionConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setKeyARN(value: AWSKMSKeyARN): Self = StObject.set(x, "KeyARN", value.asInstanceOf[js.Any])
    
    inline def setKeyARNUndefined: Self = StObject.set(x, "KeyARN", js.undefined)
    
    inline def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
  }
}
