package typings.amqp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.amqp.amqpStrings.direct
import typings.amqp.amqpStrings.fanout
import typings.amqp.amqpStrings.topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeOptions extends js.Object {
  
  /**
    * a map of additional arguments to pass in when creating an exchange
    */
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Default: true
    *
    * If set, the exchange is deleted when there are no longer queues bound to it
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * If set, the exchange will be in confirm mode, and you will get a 'ack'|'error' event emitted on a publish,
    * or the callback on the publish will be called
    */
  var confirm: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: true
    *
    * If set when creating a new exchange, the exchange will be marked as durable.
    *
    * Durable exchanges remain active when a server restarts.
    *
    * Non-durable exchanges (transient exchanges) are purged if/when a server restarts
    */
  var durable: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * If set, the exchange will not be declared,
    * this will allow the exchange to be deleted if you dont know its previous options
    */
  var noDeclare: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * f set, the server will not create the exchange. The client can use this to check whether an exchange exists without modifying the server state
    */
  var passive: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: 'topic'
    */
  var `type`: js.UndefOr[direct | fanout | topic] = js.native
}
object ExchangeOptions {
  
  @scala.inline
  def apply(): ExchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeOptions]
  }
  
  @scala.inline
  implicit class ExchangeOptionsOps[Self <: ExchangeOptions] (val x: Self) extends AnyVal {
    
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
    def setArguments(value: StringDictionary[js.Any]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setAutoDelete(value: Boolean): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
    
    @scala.inline
    def setConfirm(value: Boolean): Self = this.set("confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    
    @scala.inline
    def setDurable(value: Boolean): Self = this.set("durable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurable: Self = this.set("durable", js.undefined)
    
    @scala.inline
    def setNoDeclare(value: Boolean): Self = this.set("noDeclare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDeclare: Self = this.set("noDeclare", js.undefined)
    
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
    
    @scala.inline
    def setType(value: direct | fanout | topic): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
