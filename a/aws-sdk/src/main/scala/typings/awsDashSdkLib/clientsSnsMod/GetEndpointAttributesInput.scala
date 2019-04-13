package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEndpointAttributesInput extends js.Object {
  /**
    * EndpointArn for GetEndpointAttributes input.
    */
  var EndpointArn: String
}

object GetEndpointAttributesInput {
  @scala.inline
  def apply(EndpointArn: String): GetEndpointAttributesInput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn)
  
    __obj.asInstanceOf[GetEndpointAttributesInput]
  }
}

