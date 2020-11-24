package typings.amqpRpc.mod

import typings.amqpRpc.anon.AutoDelete
import typings.amqpRpc.anon.DefaultExchangeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var conn_options: js.UndefOr[js.Any] = js.native
  
  var connection: js.UndefOr[js.Any] = js.native
  
  var exchange: js.UndefOr[String] = js.native
  
  var exchangeInstance: js.UndefOr[js.Any] = js.native
  
  var exchange_options: js.UndefOr[AutoDelete] = js.native
  
  var ipml_options: js.UndefOr[DefaultExchangeName] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setConn_options(value: js.Any): Self = this.set("conn_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConn_options: Self = this.set("conn_options", js.undefined)
    
    @scala.inline
    def setConnection(value: js.Any): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    
    @scala.inline
    def setExchangeInstance(value: js.Any): Self = this.set("exchangeInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchangeInstance: Self = this.set("exchangeInstance", js.undefined)
    
    @scala.inline
    def setExchange_options(value: AutoDelete): Self = this.set("exchange_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange_options: Self = this.set("exchange_options", js.undefined)
    
    @scala.inline
    def setIpml_options(value: DefaultExchangeName): Self = this.set("ipml_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpml_options: Self = this.set("ipml_options", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
