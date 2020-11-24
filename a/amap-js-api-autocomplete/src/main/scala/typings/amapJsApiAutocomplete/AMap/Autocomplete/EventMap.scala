package typings.amapJsApiAutocomplete.AMap.Autocomplete

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select
import typings.amapJsApiAutocomplete.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMap extends js.Object {
  
  var choose: Event_[
    typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose, 
    typings.amapJsApiAutocomplete.anon.Tip
  ] = js.native
  
  var complete: Event_[
    typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete, 
    SearchResult | Info
  ] = js.native
  
  var error: Event_[typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error, Info] = js.native
  
  var select: Event_[
    typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select, 
    typings.amapJsApiAutocomplete.anon.Tip
  ] = js.native
}
object EventMap {
  
  @scala.inline
  def apply(
    choose: Event_[choose, typings.amapJsApiAutocomplete.anon.Tip],
    complete: Event_[complete, SearchResult | Info],
    error: Event_[error, Info],
    select: Event_[select, typings.amapJsApiAutocomplete.anon.Tip]
  ): EventMap = {
    val __obj = js.Dynamic.literal(choose = choose.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
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
    def setChoose(value: Event_[choose, typings.amapJsApiAutocomplete.anon.Tip]): Self = this.set("choose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: Event_[complete, SearchResult | Info]): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Event_[error, Info]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: Event_[select, typings.amapJsApiAutocomplete.anon.Tip]): Self = this.set("select", value.asInstanceOf[js.Any])
  }
}
