package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectoryConfigRequest extends js.Object {
  /**
    * The name of the directory configuration.
    */
  var DirectoryName: typings.awsSdk.appstreamMod.DirectoryName = js.native
}

object DeleteDirectoryConfigRequest {
  @scala.inline
  def apply(DirectoryName: DirectoryName): DeleteDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryConfigRequest]
  }
}

