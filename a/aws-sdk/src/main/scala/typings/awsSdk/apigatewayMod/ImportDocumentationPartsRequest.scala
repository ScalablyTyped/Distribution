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
  def apply(body: _Blob, restApiId: String): ImportDocumentationPartsRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDocumentationPartsRequest]
  }
  @scala.inline
  implicit class ImportDocumentationPartsRequestOps[Self <: ImportDocumentationPartsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: _Blob): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailOnWarnings(value: Boolean): Self = this.set("failOnWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailOnWarnings: Self = this.set("failOnWarnings", js.undefined)
    @scala.inline
    def setMode(value: PutMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

