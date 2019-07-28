package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPolicyPrincipalsResponse extends js.Object {
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * The descriptions of the principals.
    */
  var principals: js.UndefOr[Principals] = js.undefined
}

object ListPolicyPrincipalsResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, principals: Principals = null): ListPolicyPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    if (principals != null) __obj.updateDynamic("principals")(principals)
    __obj.asInstanceOf[ListPolicyPrincipalsResponse]
  }
}

