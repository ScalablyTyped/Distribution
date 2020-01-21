package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryConfigResult extends js.Object {
  /**
    * Information about the directory configuration.
    */
  var DirectoryConfig: js.UndefOr[typings.awsSdk.appstreamMod.DirectoryConfig] = js.native
}

object CreateDirectoryConfigResult {
  @scala.inline
  def apply(DirectoryConfig: DirectoryConfig = null): CreateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryConfig != null) __obj.updateDynamic("DirectoryConfig")(DirectoryConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryConfigResult]
  }
}

