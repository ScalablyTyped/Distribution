package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticInferenceAccelerator extends js.Object {
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.small, eia1.medium, and eia1.large. 
    */
  var Type: String
}

object ElasticInferenceAccelerator {
  @scala.inline
  def apply(Type: String): ElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal(Type = Type)
  
    __obj.asInstanceOf[ElasticInferenceAccelerator]
  }
}

