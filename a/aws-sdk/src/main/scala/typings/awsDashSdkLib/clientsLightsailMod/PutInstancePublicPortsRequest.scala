package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutInstancePublicPortsRequest extends js.Object {
  /**
    * The Lightsail instance name of the public port(s) you are setting.
    */
  var instanceName: ResourceName
  /**
    * Specifies information about the public port(s).
    */
  var portInfos: PortInfoList
}

object PutInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfos: PortInfoList): PutInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName, portInfos = portInfos)
  
    __obj.asInstanceOf[PutInstancePublicPortsRequest]
  }
}

