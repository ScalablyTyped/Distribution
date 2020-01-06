package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the template.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Arn] = js.native
  /**
    * The creation status of the template.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The ID for the template.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * The ARN for the template, including the version information of the first version.
    */
  var VersionArn: js.UndefOr[Arn] = js.native
}

object UpdateTemplateResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreationStatus: ResourceStatus = null,
    RequestId: String = null,
    Status: Int | scala.Double = null,
    TemplateId: RestrictiveResourceId = null,
    VersionArn: Arn = null
  ): UpdateTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationStatus != null) __obj.updateDynamic("CreationStatus")(CreationStatus.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    if (VersionArn != null) __obj.updateDynamic("VersionArn")(VersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateResponse]
  }
}

