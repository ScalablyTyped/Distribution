package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCloudFrontOriginAccessIdentitiesRequest extends js.Object {
  /**
    * Use this when paginating results to indicate where to begin in your list of origin access identities. The results include identities in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last identity on that page).
    */
  var Marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of origin access identities you want in the response body. 
    */
  var MaxItems: js.UndefOr[java.lang.String] = js.undefined
}

object ListCloudFrontOriginAccessIdentitiesRequest {
  @scala.inline
  def apply(Marker: java.lang.String = null, MaxItems: java.lang.String = null): ListCloudFrontOriginAccessIdentitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesRequest]
  }
}

