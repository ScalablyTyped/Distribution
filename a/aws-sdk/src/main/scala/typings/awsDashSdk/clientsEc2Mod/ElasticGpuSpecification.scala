package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticGpuSpecification extends js.Object {
  /**
    * The type of Elastic Graphics accelerator.
    */
  var Type: String
}

object ElasticGpuSpecification {
  @scala.inline
  def apply(Type: String): ElasticGpuSpecification = {
    val __obj = js.Dynamic.literal(Type = Type)
  
    __obj.asInstanceOf[ElasticGpuSpecification]
  }
}

