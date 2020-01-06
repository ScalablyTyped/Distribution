package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrailRequest extends js.Object {
  /**
    * The name or the Amazon Resource Name (ARN) of the trail for which you want to retrieve settings information.
    */
  var Name: String = js.native
}

object GetTrailRequest {
  @scala.inline
  def apply(Name: String): GetTrailRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTrailRequest]
  }
}

