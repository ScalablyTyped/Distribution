package typings.agentkeepalive.mod

import typings.node.httpMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.agentkeepalive.mod.CommonHttpOption because var conflicts: keepAlive, timeout. Inlined freeSocketTimeout, freeSocketKeepAliveTimeout, socketActiveTTL */ @js.native
trait HttpOptions extends AgentOptions {
  
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
  
  var freeSocketTimeout: js.UndefOr[Double] = js.native
  
  var socketActiveTTL: js.UndefOr[Double] = js.native
}
object HttpOptions {
  
  @scala.inline
  def apply(): HttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOptions]
  }
  
  @scala.inline
  implicit class HttpOptionsOps[Self <: HttpOptions] (val x: Self) extends AnyVal {
    
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
    def setFreeSocketKeepAliveTimeout(value: Double): Self = this.set("freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeSocketKeepAliveTimeout: Self = this.set("freeSocketKeepAliveTimeout", js.undefined)
    
    @scala.inline
    def setFreeSocketTimeout(value: Double): Self = this.set("freeSocketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeSocketTimeout: Self = this.set("freeSocketTimeout", js.undefined)
    
    @scala.inline
    def setSocketActiveTTL(value: Double): Self = this.set("socketActiveTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketActiveTTL: Self = this.set("socketActiveTTL", js.undefined)
  }
}
