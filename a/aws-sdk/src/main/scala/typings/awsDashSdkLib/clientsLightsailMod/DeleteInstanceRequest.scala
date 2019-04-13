package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInstanceRequest extends js.Object {
  /**
    * The name of the instance to delete.
    */
  var instanceName: ResourceName
}

object DeleteInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
}

