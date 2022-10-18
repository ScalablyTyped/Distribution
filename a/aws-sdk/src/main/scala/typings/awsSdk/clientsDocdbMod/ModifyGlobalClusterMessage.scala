package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyGlobalClusterMessage extends StObject {
  
  /**
    * Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The identifier for the global cluster being modified. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing global cluster.  
    */
  var GlobalClusterIdentifier: typings.awsSdk.clientsDocdbMod.GlobalClusterIdentifier
  
  /**
    * The new identifier for a global cluster when you modify a global cluster. This value is stored as a lowercase string.   Must contain from 1 to 63 letters, numbers, or hyphens The first character must be a letter Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewGlobalClusterIdentifier: js.UndefOr[GlobalClusterIdentifier] = js.undefined
}
object ModifyGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: GlobalClusterIdentifier): ModifyGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalClusterMessage]
  }
  
  extension [Self <: ModifyGlobalClusterMessage](x: Self) {
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNewGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "NewGlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNewGlobalClusterIdentifierUndefined: Self = StObject.set(x, "NewGlobalClusterIdentifier", js.undefined)
  }
}
