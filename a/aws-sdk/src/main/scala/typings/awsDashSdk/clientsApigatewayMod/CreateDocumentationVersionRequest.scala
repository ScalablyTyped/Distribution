package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDocumentationVersionRequest extends js.Object {
  /**
    * A description about the new documentation snapshot.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Required] The version identifier of the new snapshot.
    */
  var documentationVersion: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * The stage name to be associated with the new documentation snapshot.
    */
  var stageName: js.UndefOr[String] = js.native
}

object CreateDocumentationVersionRequest {
  @scala.inline
  def apply(
    documentationVersion: String,
    restApiId: String,
    description: String = null,
    stageName: String = null
  ): CreateDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentationVersionRequest]
  }
}

