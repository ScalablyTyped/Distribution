package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsKinesisStreamStreamEncryptionDetails extends StObject {
  
  /**
    * The encryption type to use. 
    */
  var EncryptionType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The globally unique identifier for the customer-managed KMS key to use for encryption. 
    */
  var KeyId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsKinesisStreamStreamEncryptionDetails {
  
  inline def apply(): AwsKinesisStreamStreamEncryptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsKinesisStreamStreamEncryptionDetails]
  }
  
  extension [Self <: AwsKinesisStreamStreamEncryptionDetails](x: Self) {
    
    inline def setEncryptionType(value: NonEmptyString): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setKeyId(value: NonEmptyString): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
