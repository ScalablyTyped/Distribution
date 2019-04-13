package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGeoMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: awsDashSdkLib.clientsWafregionalMod.ChangeToken
  /**
    * The GeoMatchSetID of the GeoMatchSet that you want to delete. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId
}

object DeleteGeoMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, GeoMatchSetId: ResourceId): DeleteGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, GeoMatchSetId = GeoMatchSetId)
  
    __obj.asInstanceOf[DeleteGeoMatchSetRequest]
  }
}

