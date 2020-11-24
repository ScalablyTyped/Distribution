package typings.amqp.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueOptions extends js.Object {
  
  /**
    * a map of additional arguments to pass in when creating a queue
    */
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Default: true
    *
    * If set, the queue is deleted when all consumers have finished using it.
    *
    * Last consumer can be cancelled either explicitly or because its channel is closed.
    *
    * If there was no consumer ever on the queue, it won't be deleted
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * when true the channel will close on unsubscribe
    */
  var closeChannelOnUnsubscribe: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * Durable queues remain active when a server restarts.
    *
    * Non-durable queues (transient queues) are purged if/when a server restarts.
    *
    * Note that durable queues do not necessarily hold persistent messages,
    * although it does not make sense to send persistent messages to a transient queue
    */
  var durable: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * Exclusive queues may only be consumed from by the current connection.
    *
    * Setting the 'exclusive' flag always implies 'autoDelete'
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * If set, the queue will not be declared, this will allow a queue to be deleted if you don't know its previous options
    */
  var noDeclare: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    *
    * If set, the server will not create the queue.
    *
    * The client can use this to check whether a queue exists without modifying the server state
    */
  var passive: js.UndefOr[Boolean] = js.native
}
object QueueOptions {
  
  @scala.inline
  def apply(): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueOptions]
  }
  
  @scala.inline
  implicit class QueueOptionsOps[Self <: QueueOptions] (val x: Self) extends AnyVal {
    
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
    def setCloseChannelOnUnsubscribe(value: Boolean): Self = this.set("closeChannelOnUnsubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseChannelOnUnsubscribe: Self = this.set("closeChannelOnUnsubscribe", js.undefined)
    
    @scala.inline
    def setDurable(value: Boolean): Self = this.set("durable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurable: Self = this.set("durable", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setNoDeclare(value: Boolean): Self = this.set("noDeclare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDeclare: Self = this.set("noDeclare", js.undefined)
    
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
  }
}
