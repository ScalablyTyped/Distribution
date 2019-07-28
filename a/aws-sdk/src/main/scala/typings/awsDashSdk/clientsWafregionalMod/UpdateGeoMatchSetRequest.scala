package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGeoMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken
  /**
    * The GeoMatchSetId of the GeoMatchSet that you want to update. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId
  /**
    * An array of GeoMatchSetUpdate objects that you want to insert into or delete from an GeoMatchSet. For more information, see the applicable data types:    GeoMatchSetUpdate: Contains Action and GeoMatchConstraint     GeoMatchConstraint: Contains Type and Value  You can have only one Type and Value per GeoMatchConstraint. To add multiple countries, include multiple GeoMatchSetUpdate objects in your request.  
    */
  var Updates: GeoMatchSetUpdates
}

object UpdateGeoMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, GeoMatchSetId: ResourceId, Updates: GeoMatchSetUpdates): UpdateGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, GeoMatchSetId = GeoMatchSetId, Updates = Updates)
  
    __obj.asInstanceOf[UpdateGeoMatchSetRequest]
  }
}

