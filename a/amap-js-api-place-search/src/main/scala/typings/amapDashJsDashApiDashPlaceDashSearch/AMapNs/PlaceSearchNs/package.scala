package typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PlaceSearchNs {
  import typings.amapDashJsDashApi.AMapNs.Event
  import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_Adcode
  import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_CINEMA
  import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_DINING
  import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_Deeptype
  import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_DeeptypeHOTEL
  import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_EventE
  import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_False
  import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_Indoordata

  type Poi = PoiBase | PoiExt
  type PoiExt = Anon_Adcode with PoiBase with (Anon_Indoordata | Anon_False) with (Anon_CINEMA | Anon_DINING | Anon_Deeptype | Anon_DeeptypeHOTEL)
  type SelectChangeEvent[N /* <: String */, E] = Event[N, SelectChangeEventData with Anon_EventE[E]]
}
