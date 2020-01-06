package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHarvestJobRequest extends js.Object {
  /**
    * The ID of the HarvestJob.
    */
  var Id: __string = js.native
}

object DescribeHarvestJobRequest {
  @scala.inline
  def apply(Id: __string): DescribeHarvestJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeHarvestJobRequest]
  }
}

