package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotMessage extends StObject {
  
  /**
    * The name of the snapshot to be deleted.
    */
  var SnapshotName: String
}
object DeleteSnapshotMessage {
  
  inline def apply(SnapshotName: String): DeleteSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSnapshotMessage] (val x: Self) extends AnyVal {
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
  }
}
