package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMatchSetSummary extends js.Object {
  /**
    * The GeoMatchSetId for an GeoMatchSet. You can use GeoMatchSetId in a GetGeoMatchSet request to get detailed information about an GeoMatchSet.
    */
  var GeoMatchSetId: ResourceId
  /**
    * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
    */
  var Name: ResourceName
}

object GeoMatchSetSummary {
  @scala.inline
  def apply(GeoMatchSetId: ResourceId, Name: ResourceName): GeoMatchSetSummary = {
    val __obj = js.Dynamic.literal(GeoMatchSetId = GeoMatchSetId, Name = Name)
  
    __obj.asInstanceOf[GeoMatchSetSummary]
  }
}

