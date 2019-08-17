package typings.amapDashJsDashApiDashAutocomplete.AMapNs.AutocompleteNs

import typings.amapDashJsDashApi.AMapNs.Event
import typings.amapDashJsDashApiDashAutocomplete.Anon_Info
import typings.amapDashJsDashApiDashAutocomplete.Anon_Tip
import typings.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.choose
import typings.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.complete
import typings.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.error
import typings.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var choose: Event[
    typings.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.choose, 
    Anon_Tip
  ]
  var complete: Event[
    typings.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.complete, 
    SearchResult | Anon_Info
  ]
  var error: Event[
    typings.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.error, 
    Anon_Info
  ]
  var select: Event[
    typings.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.select, 
    Anon_Tip
  ]
}

object EventMap {
  @scala.inline
  def apply(
    choose: Event[choose, Anon_Tip],
    complete: Event[complete, SearchResult | Anon_Info],
    error: Event[error, Anon_Info],
    select: Event[select, Anon_Tip]
  ): EventMap = {
    val __obj = js.Dynamic.literal(choose = choose, complete = complete, error = error, select = select)
  
    __obj.asInstanceOf[EventMap]
  }
}

