package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePlatformApplicationInput extends js.Object {
  /**
    * PlatformApplicationArn of platform application object to delete.
    */
  var PlatformApplicationArn: String
}

object DeletePlatformApplicationInput {
  @scala.inline
  def apply(PlatformApplicationArn: String): DeletePlatformApplicationInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn)
  
    __obj.asInstanceOf[DeletePlatformApplicationInput]
  }
}

