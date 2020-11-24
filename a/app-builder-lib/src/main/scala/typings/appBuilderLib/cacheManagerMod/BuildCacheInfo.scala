package typings.appBuilderLib.cacheManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildCacheInfo extends js.Object {
  
  var executableDigest: String = js.native
}
object BuildCacheInfo {
  
  @scala.inline
  def apply(executableDigest: String): BuildCacheInfo = {
    val __obj = js.Dynamic.literal(executableDigest = executableDigest.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildCacheInfo]
  }
  
  @scala.inline
  implicit class BuildCacheInfoOps[Self <: BuildCacheInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecutableDigest(value: String): Self = this.set("executableDigest", value.asInstanceOf[js.Any])
  }
}
