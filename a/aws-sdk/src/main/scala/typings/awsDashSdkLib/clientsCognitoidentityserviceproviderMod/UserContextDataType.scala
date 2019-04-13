package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserContextDataType extends js.Object {
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var EncodedData: js.UndefOr[StringType] = js.undefined
}

object UserContextDataType {
  @scala.inline
  def apply(EncodedData: StringType = null): UserContextDataType = {
    val __obj = js.Dynamic.literal()
    if (EncodedData != null) __obj.updateDynamic("EncodedData")(EncodedData)
    __obj.asInstanceOf[UserContextDataType]
  }
}

