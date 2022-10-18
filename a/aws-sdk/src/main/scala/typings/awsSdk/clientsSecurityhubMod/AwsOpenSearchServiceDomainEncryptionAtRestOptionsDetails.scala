package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails extends StObject {
  
  /**
    * Whether encryption at rest is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The KMS key ID.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails {
  
  inline def apply(): AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails]
  }
  
  extension [Self <: AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
