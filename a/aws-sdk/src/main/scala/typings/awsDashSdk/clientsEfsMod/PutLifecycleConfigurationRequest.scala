package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLifecycleConfigurationRequest extends js.Object {
  /**
    * The ID of the file system for which you are creating the LifecycleConfiguration object (String).
    */
  var FileSystemId: typings.awsDashSdk.clientsEfsMod.FileSystemId
  /**
    * An array of LifecyclePolicy objects that define the file system's LifecycleConfiguration object. A LifecycleConfiguration object tells lifecycle management when to transition files from the Standard storage class to the Infrequent Access storage class.
    */
  var LifecyclePolicies: typings.awsDashSdk.clientsEfsMod.LifecyclePolicies
}

object PutLifecycleConfigurationRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, LifecyclePolicies: LifecyclePolicies): PutLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId, LifecyclePolicies = LifecyclePolicies)
  
    __obj.asInstanceOf[PutLifecycleConfigurationRequest]
  }
}

