package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyAction extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup. For example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var DestinationBackupVaultArn: ARN
  
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.undefined
}
object CopyAction {
  
  inline def apply(DestinationBackupVaultArn: ARN): CopyAction = {
    val __obj = js.Dynamic.literal(DestinationBackupVaultArn = DestinationBackupVaultArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyAction]
  }
  
  extension [Self <: CopyAction](x: Self) {
    
    inline def setDestinationBackupVaultArn(value: ARN): Self = StObject.set(x, "DestinationBackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setLifecycle(value: Lifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
  }
}
