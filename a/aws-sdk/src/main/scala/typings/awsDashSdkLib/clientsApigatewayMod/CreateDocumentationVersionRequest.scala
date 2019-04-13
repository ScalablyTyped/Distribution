package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDocumentationVersionRequest extends js.Object {
  /**
    * A description about the new documentation snapshot.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * [Required] The version identifier of the new snapshot.
    */
  var documentationVersion: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * The stage name to be associated with the new documentation snapshot.
    */
  var stageName: js.UndefOr[String] = js.undefined
}

object CreateDocumentationVersionRequest {
  @scala.inline
  def apply(
    documentationVersion: String,
    restApiId: String,
    description: String = null,
    stageName: String = null
  ): CreateDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion, restApiId = restApiId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (stageName != null) __obj.updateDynamic("stageName")(stageName)
    __obj.asInstanceOf[CreateDocumentationVersionRequest]
  }
}

