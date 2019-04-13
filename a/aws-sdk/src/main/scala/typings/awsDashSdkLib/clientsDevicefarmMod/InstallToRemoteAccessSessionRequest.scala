package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallToRemoteAccessSessionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the app about which you are requesting information.
    */
  var appArn: AmazonResourceName
  /**
    * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
    */
  var remoteAccessSessionArn: AmazonResourceName
}

object InstallToRemoteAccessSessionRequest {
  @scala.inline
  def apply(appArn: AmazonResourceName, remoteAccessSessionArn: AmazonResourceName): InstallToRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn, remoteAccessSessionArn = remoteAccessSessionArn)
  
    __obj.asInstanceOf[InstallToRemoteAccessSessionRequest]
  }
}

