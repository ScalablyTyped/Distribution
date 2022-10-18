package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSelectionCriteria extends StObject {
  
  /**
    * A filter that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when Filter is specified), you can specify this element and set the status to Enabled to replicate modifications on replicas.    If you don't specify the Filter element, Amazon S3 assumes that the replication configuration is the earlier version, V1. In the earlier version, this element is not allowed 
    */
  var ReplicaModifications: js.UndefOr[typings.awsSdk.clientsS3Mod.ReplicaModifications] = js.undefined
  
  /**
    *  A container for filter information for the selection of Amazon S3 objects encrypted with Amazon Web Services KMS. If you include SourceSelectionCriteria in the replication configuration, this element is required. 
    */
  var SseKmsEncryptedObjects: js.UndefOr[typings.awsSdk.clientsS3Mod.SseKmsEncryptedObjects] = js.undefined
}
object SourceSelectionCriteria {
  
  inline def apply(): SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSelectionCriteria]
  }
  
  extension [Self <: SourceSelectionCriteria](x: Self) {
    
    inline def setReplicaModifications(value: ReplicaModifications): Self = StObject.set(x, "ReplicaModifications", value.asInstanceOf[js.Any])
    
    inline def setReplicaModificationsUndefined: Self = StObject.set(x, "ReplicaModifications", js.undefined)
    
    inline def setSseKmsEncryptedObjects(value: SseKmsEncryptedObjects): Self = StObject.set(x, "SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
    
    inline def setSseKmsEncryptedObjectsUndefined: Self = StObject.set(x, "SseKmsEncryptedObjects", js.undefined)
  }
}
