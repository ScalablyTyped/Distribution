package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreFromSnapshotResponse extends StObject {
  
  var namespace: js.UndefOr[Namespace] = js.undefined
  
  /**
    * The owner Amazon Web Services; account of the snapshot that was restored.
    */
  var ownerAccount: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the snapshot used to restore the namespace.
    */
  var snapshotName: js.UndefOr[String] = js.undefined
}
object RestoreFromSnapshotResponse {
  
  inline def apply(): RestoreFromSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreFromSnapshotResponse]
  }
  
  extension [Self <: RestoreFromSnapshotResponse](x: Self) {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOwnerAccount(value: String): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
  }
}
