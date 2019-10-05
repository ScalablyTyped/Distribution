package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUploadStatusResponse extends js.Object {
  /**
    * The date at which the upload was created.
    */
  var createdDate: Timestamp
  /**
    * The reason for an upload failure.
    */
  var failureReason: js.UndefOr[StringList] = js.undefined
  /**
    * The ARN of the upload.
    */
  var namespaceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the upload's namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  /**
    * The ID of the upload.
    */
  var uploadId: UploadId
  /**
    * The status of the upload. The initial status is IN_PROGRESS. The response show all validation failures if the upload fails.
    */
  var uploadStatus: UploadStatus
}

object GetUploadStatusResponse {
  @scala.inline
  def apply(
    createdDate: Timestamp,
    uploadId: UploadId,
    uploadStatus: UploadStatus,
    failureReason: StringList = null,
    namespaceArn: Arn = null,
    namespaceName: NamespaceName = null,
    namespaceVersion: Int | Double = null
  ): GetUploadStatusResponse = {
    val __obj = js.Dynamic.literal(createdDate = createdDate, uploadId = uploadId, uploadStatus = uploadStatus.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (namespaceArn != null) __obj.updateDynamic("namespaceArn")(namespaceArn)
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName)
    if (namespaceVersion != null) __obj.updateDynamic("namespaceVersion")(namespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadStatusResponse]
  }
}

