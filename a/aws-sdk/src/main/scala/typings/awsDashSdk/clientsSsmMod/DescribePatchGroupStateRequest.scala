package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchGroupStateRequest extends js.Object {
  /**
    * The name of the patch group whose patch snapshot should be retrieved.
    */
  var PatchGroup: typings.awsDashSdk.clientsSsmMod.PatchGroup = js.native
}

object DescribePatchGroupStateRequest {
  @scala.inline
  def apply(PatchGroup: PatchGroup): DescribePatchGroupStateRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePatchGroupStateRequest]
  }
}

