package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmsKeyToGrant extends StObject {
  
  /**
    * The AWS KMS CMK (Key Management System Customer Managed Key) used to encrypt S3 objects in the shared S3 Bucket. AWS Data exchange will create a KMS grant for each subscriber to allow them to access and decrypt their entitled data that is encrypted using this KMS key specified.
    */
  var KmsKeyArn: typings.awsSdk.clientsDataexchangeMod.KmsKeyArn
}
object KmsKeyToGrant {
  
  inline def apply(KmsKeyArn: KmsKeyArn): KmsKeyToGrant = {
    val __obj = js.Dynamic.literal(KmsKeyArn = KmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmsKeyToGrant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmsKeyToGrant] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
  }
}
