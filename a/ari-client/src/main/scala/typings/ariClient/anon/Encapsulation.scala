package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encapsulation extends js.Object {
  
  var app: String = js.native
  
  var connection_type: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var encapsulation: js.UndefOr[String] = js.native
  
  var external_host: String = js.native
  
  var format: String = js.native
  
  var transport: js.UndefOr[String] = js.native
  
  var variables: js.UndefOr[Containers] = js.native
}
object Encapsulation {
  
  @scala.inline
  def apply(app: String, external_host: String, format: String): Encapsulation = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], external_host = external_host.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encapsulation]
  }
  
  @scala.inline
  implicit class EncapsulationOps[Self <: Encapsulation] (val x: Self) extends AnyVal {
    
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_host(value: String): Self = this.set("external_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_type(value: String): Self = this.set("connection_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection_type: Self = this.set("connection_type", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setEncapsulation(value: String): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncapsulation: Self = this.set("encapsulation", js.undefined)
    
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setVariables(value: Containers): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
