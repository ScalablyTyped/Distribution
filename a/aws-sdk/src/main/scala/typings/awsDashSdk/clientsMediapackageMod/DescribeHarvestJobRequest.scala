package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHarvestJobRequest extends js.Object {
  /**
    * The ID of the HarvestJob.
    */
  var Id: __string
}

object DescribeHarvestJobRequest {
  @scala.inline
  def apply(Id: __string): DescribeHarvestJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DescribeHarvestJobRequest]
  }
}

