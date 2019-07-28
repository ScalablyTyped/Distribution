package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDirectoryConfigResult extends js.Object {
  /**
    * Information about the Directory Config object.
    */
  var DirectoryConfig: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DirectoryConfig] = js.undefined
}

object UpdateDirectoryConfigResult {
  @scala.inline
  def apply(DirectoryConfig: DirectoryConfig = null): UpdateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryConfig != null) __obj.updateDynamic("DirectoryConfig")(DirectoryConfig)
    __obj.asInstanceOf[UpdateDirectoryConfigResult]
  }
}

