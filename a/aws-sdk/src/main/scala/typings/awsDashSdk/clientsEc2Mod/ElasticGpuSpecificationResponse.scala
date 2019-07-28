package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticGpuSpecificationResponse extends js.Object {
  /**
    * The elastic GPU type.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object ElasticGpuSpecificationResponse {
  @scala.inline
  def apply(Type: String = null): ElasticGpuSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ElasticGpuSpecificationResponse]
  }
}

