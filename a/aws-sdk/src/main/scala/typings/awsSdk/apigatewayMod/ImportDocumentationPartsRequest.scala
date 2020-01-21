package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDocumentationPartsRequest extends js.Object {
  /**
    * [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file, this is a JSON object.
    */
  var body: _Blob = js.native
  /**
    * A query parameter to specify whether to rollback the documentation importation (true) or not (false) when a warning is encountered. The default value is false.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.native
  /**
    * A query parameter to indicate whether to overwrite (OVERWRITE) any existing DocumentationParts definition or to merge (MERGE) the new definition into the existing one. The default value is MERGE.
    */
  var mode: js.UndefOr[PutMode] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object ImportDocumentationPartsRequest {
  @scala.inline
  def apply(
    body: _Blob,
    restApiId: String,
    failOnWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    mode: PutMode = null
  ): ImportDocumentationPartsRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnWarnings)) __obj.updateDynamic("failOnWarnings")(failOnWarnings.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDocumentationPartsRequest]
  }
}

