package typings.amapJsApiAutocomplete.AMap.Autocomplete

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiAutocomplete.AnonInfo
import typings.amapJsApiAutocomplete.AnonTip
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
import typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var choose: Event_[typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose, AnonTip]
  var complete: Event_[
    typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete, 
    SearchResult | AnonInfo
  ]
  var error: Event_[typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error, AnonInfo]
  var select: Event_[typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select, AnonTip]
}

object EventMap {
  @scala.inline
  def apply(
    choose: Event_[choose, AnonTip],
    complete: Event_[complete, SearchResult | AnonInfo],
    error: Event_[error, AnonInfo],
    select: Event_[select, AnonTip]
  ): EventMap = {
    val __obj = js.Dynamic.literal(choose = choose.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

