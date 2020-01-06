package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpuSpecification extends js.Object {
  /**
    * The type of Elastic Graphics accelerator. For more information about the values to specify for Type, see Elastic Graphics Basics, specifically the Elastic Graphics accelerator column, in the Amazon Elastic Compute Cloud User Guide for Windows Instances.
    */
  var Type: String = js.native
}

object ElasticGpuSpecification {
  @scala.inline
  def apply(Type: String): ElasticGpuSpecification = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElasticGpuSpecification]
  }
}

