package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotRequest extends StObject {
  
  /**
    * The namespace to create a snapshot for.
    */
  var namespaceName: String
  
  /**
    * How long to retain the created snapshot.
    */
  var retentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the snapshot.
    */
  var snapshotName: String
  
  /**
    * An array of Tag objects to associate with the snapshot.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateSnapshotRequest {
  
  inline def apply(namespaceName: String, snapshotName: String): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], snapshotName = snapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriod(value: Integer): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
