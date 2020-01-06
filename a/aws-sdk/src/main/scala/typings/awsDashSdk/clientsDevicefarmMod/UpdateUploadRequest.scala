package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUploadRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the uploaded test spec.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The upload's content type (for example, application/x-yaml).
    */
  var contentType: js.UndefOr[ContentType] = js.native
  /**
    * Set to true if the YAML file has changed and must be updated. Otherwise, set to false.
    */
  var editContent: js.UndefOr[Boolean] = js.native
  /**
    * The upload's test spec file name. The name must not contain any forward slashes (/). The test spec file name must end with the .yaml or .yml file extension.
    */
  var name: js.UndefOr[Name] = js.native
}

object UpdateUploadRequest {
  @scala.inline
  def apply(
    arn: AmazonResourceName,
    contentType: ContentType = null,
    editContent: js.UndefOr[scala.Boolean] = js.undefined,
    name: Name = null
  ): UpdateUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(editContent)) __obj.updateDynamic("editContent")(editContent.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUploadRequest]
  }
}

