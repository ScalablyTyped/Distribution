package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigRequest extends js.Object {
  /**
    * The ARN of the client.
    */
  var ClientArn: awsDashSdkLib.clientsCloudhsmMod.ClientArn
  /**
    * The client version.
    */
  var ClientVersion: awsDashSdkLib.clientsCloudhsmMod.ClientVersion
  /**
    * A list of ARNs that identify the high-availability partition groups that are associated with the client.
    */
  var HapgList: awsDashSdkLib.clientsCloudhsmMod.HapgList
}

object GetConfigRequest {
  @scala.inline
  def apply(ClientArn: ClientArn, ClientVersion: ClientVersion, HapgList: HapgList): GetConfigRequest = {
    val __obj = js.Dynamic.literal(ClientArn = ClientArn, ClientVersion = ClientVersion.asInstanceOf[js.Any], HapgList = HapgList)
  
    __obj.asInstanceOf[GetConfigRequest]
  }
}

