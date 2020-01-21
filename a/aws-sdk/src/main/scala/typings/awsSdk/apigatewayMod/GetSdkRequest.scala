package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSdkRequest extends js.Object {
  /**
    * A string-to-string key-value map of query parameters sdkType-dependent properties of the SDK. For sdkType of objectivec or swift, a parameter named classPrefix is required. For sdkType of android, parameters named groupId, artifactId, artifactVersion, and invokerPackage are required. For sdkType of java, parameters named serviceName and javaPackageName are required. 
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * [Required] The language for the generated SDK. Currently java, javascript, android, objectivec (for iOS), swift (for iOS), and ruby are supported.
    */
  var sdkType: String = js.native
  /**
    * [Required] The name of the Stage that the SDK will use.
    */
  var stageName: String = js.native
}

object GetSdkRequest {
  @scala.inline
  def apply(restApiId: String, sdkType: String, stageName: String, parameters: MapOfStringToString = null): GetSdkRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], sdkType = sdkType.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSdkRequest]
  }
}

