package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectoryConfigResult extends js.Object {
  /**
    * Information about the Directory Config object.
    */
  var DirectoryConfig: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DirectoryConfig] = js.native
}

object UpdateDirectoryConfigResult {
  @scala.inline
  def apply(DirectoryConfig: DirectoryConfig = null): UpdateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryConfig != null) __obj.updateDynamic("DirectoryConfig")(DirectoryConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDirectoryConfigResult]
  }
}

