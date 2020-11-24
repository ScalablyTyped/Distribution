package typings.amapJsApiArrivalRange.AMap.ArrivalRange

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import typings.amapJsApiArrivalRange.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMap extends js.Object {
  
  var error: Event_[typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, Info] = js.native
}
object EventMap {
  
  @scala.inline
  def apply(error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    
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
    def setError(value: Event_[error, Info]): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
