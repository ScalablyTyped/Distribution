package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPolicyPrincipalsResponse extends js.Object {
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The descriptions of the principals.
    */
  var principals: js.UndefOr[Principals] = js.native
}

object ListPolicyPrincipalsResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, principals: Principals = null): ListPolicyPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    if (principals != null) __obj.updateDynamic("principals")(principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyPrincipalsResponse]
  }
}

