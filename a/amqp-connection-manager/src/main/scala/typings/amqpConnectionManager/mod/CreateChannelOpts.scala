package typings.amqpConnectionManager.mod

import typings.amqplib.mod.ConfirmChannel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelOpts extends js.Object {
  
  /**
    * if true, then ChannelWrapper assumes all messages passed to publish() and sendToQueue() are plain JSON objects.
    * These will be encoded automatically before being sent.
    */
  var json: js.UndefOr[Boolean] = js.native
  
  /**
    * Name for this channel. Used for debugging.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A function to call whenever we reconnect to the broker (and therefore create a new underlying channel.)
    * This function should either accept a callback, or return a Promise. See addSetup below
    */
  var setup: js.UndefOr[SetupFunc] = js.native
}
object CreateChannelOpts {
  
  @scala.inline
  def apply(): CreateChannelOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelOpts]
  }
  
  @scala.inline
  implicit class CreateChannelOptsOps[Self <: CreateChannelOpts] (val x: Self) extends AnyVal {
    
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
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSetupFunction2(
      value: (/* channel */ ConfirmChannel, /* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit]) => Unit
    ): Self = this.set("setup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetupFunction1(value: /* channel */ ConfirmChannel => js.Promise[Unit]): Self = this.set("setup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetup(value: SetupFunc): Self = this.set("setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
  }
}
