package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLifecycleConfigurationRequest extends StObject {
  
  /**
    * The ID of the file system for which you are creating the LifecycleConfiguration object (String).
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
  
  /**
    * An array of LifecyclePolicy objects that define the file system's LifecycleConfiguration object. A LifecycleConfiguration object informs EFS lifecycle management and EFS Intelligent-Tiering of the following:   When to move files in the file system from primary storage to the IA storage class.   When to move files that are in IA storage to primary storage.    When using the put-lifecycle-configuration CLI command or the PutLifecycleConfiguration API action, Amazon EFS requires that each LifecyclePolicy object have only a single transition. This means that in a request body, LifecyclePolicies must be structured as an array of LifecyclePolicy objects, one object for each transition, TransitionToIA, TransitionToPrimaryStorageClass. See the example requests in the following section for more information. 
    */
  var LifecyclePolicies: typings.awsSdk.clientsEfsMod.LifecyclePolicies
}
object PutLifecycleConfigurationRequest {
  
  inline def apply(FileSystemId: FileSystemId, LifecyclePolicies: LifecyclePolicies): PutLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], LifecyclePolicies = LifecyclePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecycleConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutLifecycleConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePolicies(value: LifecyclePolicies): Self = StObject.set(x, "LifecyclePolicies", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePoliciesVarargs(value: LifecyclePolicy*): Self = StObject.set(x, "LifecyclePolicies", js.Array(value*))
  }
}
