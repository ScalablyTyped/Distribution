package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlatformEndpointInput extends js.Object {
  /**
    * For a list of attributes, see SetEndpointAttributes.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.undefined
  /**
    * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.
    */
  var CustomUserData: js.UndefOr[String] = js.undefined
  /**
    * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
    */
  var PlatformApplicationArn: String
  /**
    * Unique identifier created by the notification service for an app on a device. The specific name for Token will vary, depending on which notification service is being used. For example, when using APNS as the notification service, you need the device token. Alternatively, when using GCM or ADM, the device token equivalent is called the registration ID.
    */
  var Token: String
}

object CreatePlatformEndpointInput {
  @scala.inline
  def apply(
    PlatformApplicationArn: String,
    Token: String,
    Attributes: MapStringToString = null,
    CustomUserData: String = null
  ): CreatePlatformEndpointInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn, Token = Token)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (CustomUserData != null) __obj.updateDynamic("CustomUserData")(CustomUserData)
    __obj.asInstanceOf[CreatePlatformEndpointInput]
  }
}

