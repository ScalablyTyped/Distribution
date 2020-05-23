package typings.amapJsApiAutocomplete.AMap.Autocomplete

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select
import typings.amapJsApiAutocomplete.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var choose: Event_[
    typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose, 
    typings.amapJsApiAutocomplete.anon.Tip
  ]
  var complete: Event_[
    typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete, 
    SearchResult | Info
  ]
  var error: Event_[typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error, Info]
  var select: Event_[
    typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select, 
    typings.amapJsApiAutocomplete.anon.Tip
  ]
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
}

