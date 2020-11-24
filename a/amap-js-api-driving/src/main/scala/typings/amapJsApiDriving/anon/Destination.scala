package typings.amapJsApiDriving.anon

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends js.Object {
  
  var destination: LocationValue = js.native
  
  var destinationName: js.UndefOr[String] = js.native
  
  var origin: LocationValue = js.native
  
  var originName: js.UndefOr[String] = js.native
}
object Destination {
  
  @scala.inline
  def apply(destination: LocationValue, origin: LocationValue): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: LocationValue): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: LocationValue): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    
    @scala.inline
    def setOriginName(value: String): Self = this.set("originName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginName: Self = this.set("originName", js.undefined)
  }
}
