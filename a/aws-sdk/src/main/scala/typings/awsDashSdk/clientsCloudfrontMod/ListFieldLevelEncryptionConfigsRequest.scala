package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFieldLevelEncryptionConfigsRequest extends js.Object {
  /**
    * Use this when paginating results to indicate where to begin in your list of configurations. The results include configurations in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last configuration on that page). 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of field-level encryption configurations you want in the response body. 
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}

object ListFieldLevelEncryptionConfigsRequest {
  @scala.inline
  def apply(Marker: String = null, MaxItems: String = null): ListFieldLevelEncryptionConfigsRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListFieldLevelEncryptionConfigsRequest]
  }
}

