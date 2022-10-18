package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecoveryRequestSourceServer extends StObject {
  
  /**
    * The ID of a Recovery Snapshot we want to recover from. Omit this field to launch from the latest data by taking an on-demand snapshot.
    */
  var recoverySnapshotID: js.UndefOr[RecoverySnapshotID] = js.undefined
  
  /**
    * The ID of the Source Server you want to recover.
    */
  var sourceServerID: SourceServerID
}
object StartRecoveryRequestSourceServer {
  
  inline def apply(sourceServerID: SourceServerID): StartRecoveryRequestSourceServer = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecoveryRequestSourceServer]
  }
  
  extension [Self <: StartRecoveryRequestSourceServer](x: Self) {
    
    inline def setRecoverySnapshotID(value: RecoverySnapshotID): Self = StObject.set(x, "recoverySnapshotID", value.asInstanceOf[js.Any])
    
    inline def setRecoverySnapshotIDUndefined: Self = StObject.set(x, "recoverySnapshotID", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
