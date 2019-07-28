package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityPoolConfigurationResponse extends js.Object {
  /**
    * Options to apply to this identity pool for Amazon Cognito streams.
    */
  var CognitoStreams: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.CognitoStreams] = js.undefined
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito.
    */
  var IdentityPoolId: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolId] = js.undefined
  /**
    * Options to apply to this identity pool for push synchronization.
    */
  var PushSync: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.PushSync] = js.undefined
}

object GetIdentityPoolConfigurationResponse {
  @scala.inline
  def apply(
    CognitoStreams: CognitoStreams = null,
    IdentityPoolId: IdentityPoolId = null,
    PushSync: PushSync = null
  ): GetIdentityPoolConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (CognitoStreams != null) __obj.updateDynamic("CognitoStreams")(CognitoStreams)
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (PushSync != null) __obj.updateDynamic("PushSync")(PushSync)
    __obj.asInstanceOf[GetIdentityPoolConfigurationResponse]
  }
}

