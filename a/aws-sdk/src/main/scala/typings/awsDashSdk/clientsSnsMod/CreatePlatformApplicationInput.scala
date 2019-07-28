package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlatformApplicationInput extends js.Object {
  /**
    * For a list of attributes, see SetPlatformApplicationAttributes 
    */
  var Attributes: MapStringToString
  /**
    * Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, hyphens, and periods, and must be between 1 and 256 characters long.
    */
  var Name: String
  /**
    * The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google Cloud Messaging).
    */
  var Platform: String
}

object CreatePlatformApplicationInput {
  @scala.inline
  def apply(Attributes: MapStringToString, Name: String, Platform: String): CreatePlatformApplicationInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, Name = Name, Platform = Platform)
  
    __obj.asInstanceOf[CreatePlatformApplicationInput]
  }
}

