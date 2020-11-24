package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamLayerViewUpdateRateEvent extends js.Object {
  
  var client: Double = js.native
  
  var websocket: Double = js.native
}
object StreamLayerViewUpdateRateEvent {
  
  @scala.inline
  def apply(client: Double, websocket: Double): StreamLayerViewUpdateRateEvent = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerViewUpdateRateEvent]
  }
  
  @scala.inline
  implicit class StreamLayerViewUpdateRateEventOps[Self <: StreamLayerViewUpdateRateEvent] (val x: Self) extends AnyVal {
    
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
    def setClient(value: Double): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsocket(value: Double): Self = this.set("websocket", value.asInstanceOf[js.Any])
  }
}
