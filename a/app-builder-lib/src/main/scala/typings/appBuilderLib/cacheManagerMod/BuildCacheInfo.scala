package typings.appBuilderLib.cacheManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildCacheInfo extends js.Object {
  var executableDigest: String
}

object BuildCacheInfo {
  @scala.inline
  def apply(executableDigest: String): BuildCacheInfo = {
    val __obj = js.Dynamic.literal(executableDigest = executableDigest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildCacheInfo]
  }
}

