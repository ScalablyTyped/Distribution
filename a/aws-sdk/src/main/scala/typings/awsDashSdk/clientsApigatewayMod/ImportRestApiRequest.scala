package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportRestApiRequest extends js.Object {
  /**
    * [Required] The POST request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 2MB.
    */
  var body: _Blob = js.native
  /**
    * A query parameter to indicate whether to rollback the API creation (true) or not (false) when a warning is encountered. The default value is false.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.native
  /**
    * A key-value map of context-specific query string parameters specifying the behavior of different API importing operations. The following shows operation-specific parameters and their supported values.  To exclude DocumentationParts from the import, set parameters as ignore=documentation.  To configure the endpoint type, set parameters as endpointConfigurationTypes=EDGE, endpointConfigurationTypes=REGIONAL, or endpointConfigurationTypes=PRIVATE. The default endpoint type is EDGE.  To handle imported basepath, set parameters as basepath=ignore, basepath=prepend or basepath=split. For example, the AWS CLI command to exclude documentation from the imported API is: aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json' The AWS CLI command to set the regional endpoint on the imported API is: aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.native
}

object ImportRestApiRequest {
  @scala.inline
  def apply(
    body: _Blob,
    failOnWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    parameters: MapOfStringToString = null
  ): ImportRestApiRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnWarnings)) __obj.updateDynamic("failOnWarnings")(failOnWarnings.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportRestApiRequest]
  }
}

