package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSet extends js.Object {
  /**
    * An array of GeoMatchConstraint objects, which contain the country that you want AWS WAF to search for.
    */
  var GeoMatchConstraints: typings.awsDashSdk.clientsWafregionalMod.GeoMatchConstraints = js.native
  /**
    * The GeoMatchSetId for an GeoMatchSet. You use GeoMatchSetId to get information about a GeoMatchSet (see GeoMatchSet), update a GeoMatchSet (see UpdateGeoMatchSet), insert a GeoMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a GeoMatchSet from AWS WAF (see DeleteGeoMatchSet).  GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId = js.native
  /**
    * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}

object GeoMatchSet {
  @scala.inline
  def apply(GeoMatchConstraints: GeoMatchConstraints, GeoMatchSetId: ResourceId, Name: ResourceName = null): GeoMatchSet = {
    val __obj = js.Dynamic.literal(GeoMatchConstraints = GeoMatchConstraints.asInstanceOf[js.Any], GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSet]
  }
}

