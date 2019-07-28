package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRestApiRequest extends js.Object {
  /**
    * [Required] The PUT request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 2MB.
    */
  var body: _Blob
  /**
    * A query parameter to indicate whether to rollback the API update (true) or not (false) when a warning is encountered. The default value is false.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.undefined
  /**
    * The mode query parameter to specify the update mode. Valid values are "merge" and "overwrite". By default, the update mode is "merge".
    */
  var mode: js.UndefOr[PutMode] = js.undefined
  /**
    * Custom header parameters as part of the request. For example, to exclude DocumentationParts from an imported API, set ignore=documentation as a parameters value, as in the AWS CLI command of aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'.
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object PutRestApiRequest {
  @scala.inline
  def apply(
    body: _Blob,
    restApiId: String,
    failOnWarnings: js.UndefOr[Boolean] = js.undefined,
    mode: PutMode = null,
    parameters: MapOfStringToString = null
  ): PutRestApiRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], restApiId = restApiId)
    if (!js.isUndefined(failOnWarnings)) __obj.updateDynamic("failOnWarnings")(failOnWarnings)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[PutRestApiRequest]
  }
}

