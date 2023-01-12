package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamespaceRequest extends StObject {
  
  /**
    * The name of the snapshot to be created before the namespace is deleted.
    */
  var finalSnapshotName: js.UndefOr[String] = js.undefined
  
  /**
    * How long to retain the final snapshot.
    */
  var finalSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the namespace to delete.
    */
  var namespaceName: NamespaceName
}
object DeleteNamespaceRequest {
  
  inline def apply(namespaceName: NamespaceName): DeleteNamespaceRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamespaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNamespaceRequest] (val x: Self) extends AnyVal {
    
    inline def setFinalSnapshotName(value: String): Self = StObject.set(x, "finalSnapshotName", value.asInstanceOf[js.Any])
    
    inline def setFinalSnapshotNameUndefined: Self = StObject.set(x, "finalSnapshotName", js.undefined)
    
    inline def setFinalSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "finalSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setFinalSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "finalSnapshotRetentionPeriod", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
  }
}
