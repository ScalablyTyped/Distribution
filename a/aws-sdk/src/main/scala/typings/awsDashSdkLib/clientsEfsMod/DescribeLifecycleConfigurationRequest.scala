package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLifecycleConfigurationRequest extends js.Object {
  /**
    * The ID of the file system whose LifecycleConfiguration object you want to retrieve (String).
    */
  var FileSystemId: awsDashSdkLib.clientsEfsMod.FileSystemId
}

object DescribeLifecycleConfigurationRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DescribeLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId)
  
    __obj.asInstanceOf[DescribeLifecycleConfigurationRequest]
  }
}

