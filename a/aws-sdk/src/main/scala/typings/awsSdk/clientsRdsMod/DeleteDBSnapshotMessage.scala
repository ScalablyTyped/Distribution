package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBSnapshotMessage extends StObject {
  
  /**
    * The DB snapshot identifier. Constraints: Must be the name of an existing DB snapshot in the available state.
    */
  var DBSnapshotIdentifier: String
}
object DeleteDBSnapshotMessage {
  
  inline def apply(DBSnapshotIdentifier: String): DeleteDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSnapshotMessage]
  }
  
  extension [Self <: DeleteDBSnapshotMessage](x: Self) {
    
    inline def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
