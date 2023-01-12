package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterHsmStatus extends StObject {
  
  /**
    * The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data encryption keys that are stored in an HSM.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
    */
  var HsmConfigurationIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a modify cluster command. Type: String Valid values: active | applying 
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterHsmStatus {
  
  inline def apply(): AwsRedshiftClusterHsmStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterHsmStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRedshiftClusterHsmStatus] (val x: Self) extends AnyVal {
    
    inline def setHsmClientCertificateIdentifier(value: NonEmptyString): Self = StObject.set(x, "HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setHsmClientCertificateIdentifierUndefined: Self = StObject.set(x, "HsmClientCertificateIdentifier", js.undefined)
    
    inline def setHsmConfigurationIdentifier(value: NonEmptyString): Self = StObject.set(x, "HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setHsmConfigurationIdentifierUndefined: Self = StObject.set(x, "HsmConfigurationIdentifier", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
