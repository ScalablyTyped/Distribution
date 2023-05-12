package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryPointSelection extends StObject {
  
  var DateRange: js.UndefOr[typings.awsSdk.clientsBackupMod.DateRange] = js.undefined
  
  /**
    * These are the resources included in the resource selection (including type of resources and vaults).
    */
  var ResourceIdentifiers: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceIdentifiers] = js.undefined
  
  /**
    * These are the names of the vaults in which the selected recovery points are contained.
    */
  var VaultNames: js.UndefOr[typings.awsSdk.clientsBackupMod.VaultNames] = js.undefined
}
object RecoveryPointSelection {
  
  inline def apply(): RecoveryPointSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryPointSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecoveryPointSelection] (val x: Self) extends AnyVal {
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "DateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "DateRange", js.undefined)
    
    inline def setResourceIdentifiers(value: ResourceIdentifiers): Self = StObject.set(x, "ResourceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifiersUndefined: Self = StObject.set(x, "ResourceIdentifiers", js.undefined)
    
    inline def setResourceIdentifiersVarargs(value: String*): Self = StObject.set(x, "ResourceIdentifiers", js.Array(value*))
    
    inline def setVaultNames(value: VaultNames): Self = StObject.set(x, "VaultNames", value.asInstanceOf[js.Any])
    
    inline def setVaultNamesUndefined: Self = StObject.set(x, "VaultNames", js.undefined)
    
    inline def setVaultNamesVarargs(value: String*): Self = StObject.set(x, "VaultNames", js.Array(value*))
  }
}
