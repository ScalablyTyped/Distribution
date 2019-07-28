package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIdentityPoolConfigurationRequest extends js.Object {
  /**
    * Options to apply to this identity pool for Amazon Cognito streams.
    */
  var CognitoStreams: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.CognitoStreams] = js.undefined
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This is the ID of the pool to modify.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolId
  /**
    * Options to apply to this identity pool for push synchronization.
    */
  var PushSync: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.PushSync] = js.undefined
}

object SetIdentityPoolConfigurationRequest {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId, CognitoStreams: CognitoStreams = null, PushSync: PushSync = null): SetIdentityPoolConfigurationRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId)
    if (CognitoStreams != null) __obj.updateDynamic("CognitoStreams")(CognitoStreams)
    if (PushSync != null) __obj.updateDynamic("PushSync")(PushSync)
    __obj.asInstanceOf[SetIdentityPoolConfigurationRequest]
  }
}

