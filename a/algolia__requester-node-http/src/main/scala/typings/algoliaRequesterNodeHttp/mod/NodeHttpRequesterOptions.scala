package typings.algoliaRequesterNodeHttp.mod

import typings.node.httpsMod.Agent
import typings.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeHttpRequesterOptions extends js.Object {
  
  var agent: js.UndefOr[Agent | typings.node.httpMod.Agent] = js.native
  
  var httpAgent: js.UndefOr[typings.node.httpMod.Agent] = js.native
  
  var httpsAgent: js.UndefOr[Agent] = js.native
  
  var requesterOptions: js.UndefOr[RequestOptions] = js.native
}
object NodeHttpRequesterOptions {
  
  @scala.inline
  def apply(): NodeHttpRequesterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeHttpRequesterOptions]
  }
  
  @scala.inline
  implicit class NodeHttpRequesterOptionsOps[Self <: NodeHttpRequesterOptions] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: Agent | typings.node.httpMod.Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setHttpAgent(value: typings.node.httpMod.Agent): Self = this.set("httpAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpAgent: Self = this.set("httpAgent", js.undefined)
    
    @scala.inline
    def setHttpsAgent(value: Agent): Self = this.set("httpsAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsAgent: Self = this.set("httpsAgent", js.undefined)
    
    @scala.inline
    def setRequesterOptions(value: RequestOptions): Self = this.set("requesterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterOptions: Self = this.set("requesterOptions", js.undefined)
  }
}
