package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterDeviceRequest extends js.Object {
  /**
    * The unique ID for this identity.
    */
  var IdentityId: typings.awsDashSdk.clientsCognitosyncMod.IdentityId
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. Here, the ID of the pool that the identity belongs to.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolId
  /**
    * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
    */
  var Platform: typings.awsDashSdk.clientsCognitosyncMod.Platform
  /**
    * The push token.
    */
  var Token: PushToken
}

object RegisterDeviceRequest {
  @scala.inline
  def apply(IdentityId: IdentityId, IdentityPoolId: IdentityPoolId, Platform: Platform, Token: PushToken): RegisterDeviceRequest = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId, IdentityPoolId = IdentityPoolId, Platform = Platform.asInstanceOf[js.Any], Token = Token)
  
    __obj.asInstanceOf[RegisterDeviceRequest]
  }
}

