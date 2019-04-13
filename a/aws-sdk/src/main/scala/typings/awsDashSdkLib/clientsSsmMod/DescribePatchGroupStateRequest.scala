package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePatchGroupStateRequest extends js.Object {
  /**
    * The name of the patch group whose patch snapshot should be retrieved.
    */
  var PatchGroup: awsDashSdkLib.clientsSsmMod.PatchGroup
}

object DescribePatchGroupStateRequest {
  @scala.inline
  def apply(PatchGroup: PatchGroup): DescribePatchGroupStateRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup)
  
    __obj.asInstanceOf[DescribePatchGroupStateRequest]
  }
}

