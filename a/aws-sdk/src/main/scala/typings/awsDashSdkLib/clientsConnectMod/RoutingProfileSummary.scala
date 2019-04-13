package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingProfileSummary extends js.Object {
  /**
    * The ARN of the routing profile.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  /**
    * The identifier of the routing profile.
    */
  var Id: js.UndefOr[RoutingProfileId] = js.undefined
  /**
    * The name of the routing profile.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.undefined
}

object RoutingProfileSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: RoutingProfileId = null, Name: RoutingProfileName = null): RoutingProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[RoutingProfileSummary]
  }
}

