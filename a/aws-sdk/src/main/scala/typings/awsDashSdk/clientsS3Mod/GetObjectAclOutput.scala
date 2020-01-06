package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectAclOutput extends js.Object {
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Grants] = js.native
  /**
    *  Container for the bucket owner's display name and ID.
    */
  var Owner: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Owner] = js.native
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.native
}

object GetObjectAclOutput {
  @scala.inline
  def apply(Grants: Grants = null, Owner: Owner = null, RequestCharged: RequestCharged = null): GetObjectAclOutput = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAclOutput]
  }
}

