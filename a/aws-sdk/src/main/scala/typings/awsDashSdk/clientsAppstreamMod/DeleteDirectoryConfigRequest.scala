package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectoryConfigRequest extends js.Object {
  /**
    * The name of the directory configuration.
    */
  var DirectoryName: typings.awsDashSdk.clientsAppstreamMod.DirectoryName
}

object DeleteDirectoryConfigRequest {
  @scala.inline
  def apply(DirectoryName: DirectoryName): DeleteDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName)
  
    __obj.asInstanceOf[DeleteDirectoryConfigRequest]
  }
}

