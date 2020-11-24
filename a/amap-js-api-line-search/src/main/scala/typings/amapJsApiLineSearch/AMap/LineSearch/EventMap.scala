package typings.amapJsApiLineSearch.AMap.LineSearch

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
import typings.amapJsApiLineSearch.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMap extends js.Object {
  
  var complete: Event_[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete, SearchResult] = js.native
  
  var error: Event_[typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error, Info] = js.native
}
object EventMap {
  
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
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
    def setComplete(value: Event_[complete, SearchResult]): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Event_[error, Info]): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
