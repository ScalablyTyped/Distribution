package typings.ably.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientId extends js.Object {
  
  var clientId: String | Null = js.native
  
  var disconnectedAt: Double = js.native
  
  var location: String = js.native
  
  var recoveryKey: String = js.native
}
object ClientId {
  
  @scala.inline
  def apply(disconnectedAt: Double, location: String, recoveryKey: String): ClientId = {
    val __obj = js.Dynamic.literal(disconnectedAt = disconnectedAt.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], recoveryKey = recoveryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientId]
  }
  
  @scala.inline
  implicit class ClientIdOps[Self <: ClientId] (val x: Self) extends AnyVal {
    
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
    def setDisconnectedAt(value: Double): Self = this.set("disconnectedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryKey(value: String): Self = this.set("recoveryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdNull: Self = this.set("clientId", null)
  }
}
