package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSdkRequest extends js.Object {
  /**
    * A string-to-string key-value map of query parameters sdkType-dependent properties of the SDK. For sdkType of objectivec or swift, a parameter named classPrefix is required. For sdkType of android, parameters named groupId, artifactId, artifactVersion, and invokerPackage are required. For sdkType of java, parameters named serviceName and javaPackageName are required. 
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The language for the generated SDK. Currently java, javascript, android, objectivec (for iOS), swift (for iOS), and ruby are supported.
    */
  var sdkType: String
  /**
    * [Required] The name of the Stage that the SDK will use.
    */
  var stageName: String
}

object GetSdkRequest {
  @scala.inline
  def apply(restApiId: String, sdkType: String, stageName: String, parameters: MapOfStringToString = null): GetSdkRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId, sdkType = sdkType, stageName = stageName)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[GetSdkRequest]
  }
}

