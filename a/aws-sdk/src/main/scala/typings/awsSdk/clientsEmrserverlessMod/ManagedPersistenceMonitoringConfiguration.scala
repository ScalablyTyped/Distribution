package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedPersistenceMonitoringConfiguration extends StObject {
  
  /**
    * Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The KMS key ARN to encrypt the logs stored in managed log persistence.
    */
  var encryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined
}
object ManagedPersistenceMonitoringConfiguration {
  
  inline def apply(): ManagedPersistenceMonitoringConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPersistenceMonitoringConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedPersistenceMonitoringConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEncryptionKeyArn(value: EncryptionKeyArn): Self = StObject.set(x, "encryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "encryptionKeyArn", js.undefined)
  }
}
