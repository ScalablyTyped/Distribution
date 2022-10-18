package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3MonitoringConfiguration extends StObject {
  
  /**
    * The KMS key ARN to encrypt the logs published to the given Amazon S3 destination.
    */
  var encryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined
  
  /**
    * The Amazon S3 destination URI for log publishing.
    */
  var logUri: js.UndefOr[UriString] = js.undefined
}
object S3MonitoringConfiguration {
  
  inline def apply(): S3MonitoringConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3MonitoringConfiguration]
  }
  
  extension [Self <: S3MonitoringConfiguration](x: Self) {
    
    inline def setEncryptionKeyArn(value: EncryptionKeyArn): Self = StObject.set(x, "encryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "encryptionKeyArn", js.undefined)
    
    inline def setLogUri(value: UriString): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
    
    inline def setLogUriUndefined: Self = StObject.set(x, "logUri", js.undefined)
  }
}
