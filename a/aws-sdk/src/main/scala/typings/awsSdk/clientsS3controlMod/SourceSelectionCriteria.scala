package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSelectionCriteria extends StObject {
  
  /**
    * A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica modification sync can help you keep object metadata synchronized between replicas and source objects. By default, S3 on Outposts replicates metadata from the source objects to the replicas only. When replica modification sync is enabled, S3 on Outposts replicates metadata changes made to the replica copies back to the source object, making the replication bidirectional. To replicate object metadata modifications on replicas, you can specify this element and set the Status of this element to Enabled.  You must enable replica modification sync on the source and destination buckets to replicate replica metadata changes between the source and the replicas. 
    */
  var ReplicaModifications: js.UndefOr[typings.awsSdk.clientsS3controlMod.ReplicaModifications] = js.undefined
  
  /**
    * A filter that you can use to select Amazon S3 objects that are encrypted with server-side encryption by using Key Management Service (KMS) keys. If you include SourceSelectionCriteria in the replication configuration, this element is required.   This is not supported by Amazon S3 on Outposts buckets. 
    */
  var SseKmsEncryptedObjects: js.UndefOr[typings.awsSdk.clientsS3controlMod.SseKmsEncryptedObjects] = js.undefined
}
object SourceSelectionCriteria {
  
  inline def apply(): SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSelectionCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceSelectionCriteria] (val x: Self) extends AnyVal {
    
    inline def setReplicaModifications(value: ReplicaModifications): Self = StObject.set(x, "ReplicaModifications", value.asInstanceOf[js.Any])
    
    inline def setReplicaModificationsUndefined: Self = StObject.set(x, "ReplicaModifications", js.undefined)
    
    inline def setSseKmsEncryptedObjects(value: SseKmsEncryptedObjects): Self = StObject.set(x, "SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
    
    inline def setSseKmsEncryptedObjectsUndefined: Self = StObject.set(x, "SseKmsEncryptedObjects", js.undefined)
  }
}
