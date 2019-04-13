package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyPairsRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get key pairs request.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetKeyPairsRequest {
  @scala.inline
  def apply(pageToken: java.lang.String = null): GetKeyPairsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetKeyPairsRequest]
  }
}

