package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextDataType extends js.Object {
  /**
    * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection library.
    */
  var EncodedData: js.UndefOr[StringType] = js.undefined
  /**
    * HttpHeaders received on your server in same order.
    */
  var HttpHeaders: HttpHeaderList
  /**
    * Source IP address of your user.
    */
  var IpAddress: StringType
  /**
    * Your server endpoint where this API is invoked.
    */
  var ServerName: StringType
  /**
    * Your server path where this API is invoked. 
    */
  var ServerPath: StringType
}

object ContextDataType {
  @scala.inline
  def apply(
    HttpHeaders: HttpHeaderList,
    IpAddress: StringType,
    ServerName: StringType,
    ServerPath: StringType,
    EncodedData: StringType = null
  ): ContextDataType = {
    val __obj = js.Dynamic.literal(HttpHeaders = HttpHeaders, IpAddress = IpAddress, ServerName = ServerName, ServerPath = ServerPath)
    if (EncodedData != null) __obj.updateDynamic("EncodedData")(EncodedData)
    __obj.asInstanceOf[ContextDataType]
  }
}

