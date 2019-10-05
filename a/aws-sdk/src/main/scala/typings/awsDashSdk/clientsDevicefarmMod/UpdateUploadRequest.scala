package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUploadRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the uploaded test spec.
    */
  var arn: AmazonResourceName
  /**
    * The upload's content type (for example, "application/x-yaml").
    */
  var contentType: js.UndefOr[ContentType] = js.undefined
  /**
    * Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
    */
  var editContent: js.UndefOr[Boolean] = js.undefined
  /**
    * The upload's test spec file name. The name should not contain the '/' character. The test spec file name must end with the .yaml or .yml file extension.
    */
  var name: js.UndefOr[Name] = js.undefined
}

object UpdateUploadRequest {
  @scala.inline
  def apply(
    arn: AmazonResourceName,
    contentType: ContentType = null,
    editContent: js.UndefOr[scala.Boolean] = js.undefined,
    name: Name = null
  ): UpdateUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(editContent)) __obj.updateDynamic("editContent")(editContent)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateUploadRequest]
  }
}

