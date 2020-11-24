package typings.awsLambda.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientContext extends js.Object {
  
  var Custom: js.UndefOr[js.Any] = js.native
  
  var client: ClientContextClient = js.native
  
  var env: ClientContextEnv = js.native
}
object ClientContext {
  
  @scala.inline
  def apply(client: ClientContextClient, env: ClientContextEnv): ClientContext = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContext]
  }
  
  @scala.inline
  implicit class ClientContextOps[Self <: ClientContext] (val x: Self) extends AnyVal {
    
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
    def setClient(value: ClientContextClient): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: ClientContextEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: js.Any): Self = this.set("Custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("Custom", js.undefined)
  }
}
