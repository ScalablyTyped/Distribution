package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectoryConfigResult extends js.Object {
  /**
    * Information about the directory configuration.
    */
  var DirectoryConfig: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DirectoryConfig] = js.undefined
}

object CreateDirectoryConfigResult {
  @scala.inline
  def apply(DirectoryConfig: DirectoryConfig = null): CreateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryConfig != null) __obj.updateDynamic("DirectoryConfig")(DirectoryConfig)
    __obj.asInstanceOf[CreateDirectoryConfigResult]
  }
}

