package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapToggleToggleEvent extends StObject {
  
  var current: Basemap = js.native
  
  var previous: Basemap = js.native
}
object BasemapToggleToggleEvent {
  
  @scala.inline
  def apply(current: Basemap, previous: Basemap): BasemapToggleToggleEvent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasemapToggleToggleEvent]
  }
  
  @scala.inline
  implicit class BasemapToggleToggleEventMutableBuilder[Self <: BasemapToggleToggleEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Basemap): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: Basemap): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
