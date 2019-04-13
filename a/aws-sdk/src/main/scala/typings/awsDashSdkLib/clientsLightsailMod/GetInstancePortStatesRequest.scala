package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancePortStatesRequest extends js.Object {
  /**
    * The name of the instance.
    */
  var instanceName: ResourceName
}

object GetInstancePortStatesRequest {
  @scala.inline
  def apply(instanceName: ResourceName): GetInstancePortStatesRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[GetInstancePortStatesRequest]
  }
}

