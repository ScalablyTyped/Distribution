package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootInstanceRequest extends js.Object {
  /**
    * The name of the instance to reboot.
    */
  var instanceName: ResourceName
}

object RebootInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): RebootInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[RebootInstanceRequest]
  }
}

