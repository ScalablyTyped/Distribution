package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFieldLevelEncryptionProfilesRequest extends js.Object {
  /**
    * Use this when paginating results to indicate where to begin in your list of profiles. The results include profiles in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last profile on that page). 
    */
  var Marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of field-level encryption profiles you want in the response body. 
    */
  var MaxItems: js.UndefOr[java.lang.String] = js.undefined
}

object ListFieldLevelEncryptionProfilesRequest {
  @scala.inline
  def apply(Marker: java.lang.String = null, MaxItems: java.lang.String = null): ListFieldLevelEncryptionProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesRequest]
  }
}

