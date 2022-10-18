package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotCopyGrantMessage extends StObject {
  
  /**
    * The name of the snapshot copy grant to delete.
    */
  var SnapshotCopyGrantName: String
}
object DeleteSnapshotCopyGrantMessage {
  
  inline def apply(SnapshotCopyGrantName: String): DeleteSnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal(SnapshotCopyGrantName = SnapshotCopyGrantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotCopyGrantMessage]
  }
  
  extension [Self <: DeleteSnapshotCopyGrantMessage](x: Self) {
    
    inline def setSnapshotCopyGrantName(value: String): Self = StObject.set(x, "SnapshotCopyGrantName", value.asInstanceOf[js.Any])
  }
}
