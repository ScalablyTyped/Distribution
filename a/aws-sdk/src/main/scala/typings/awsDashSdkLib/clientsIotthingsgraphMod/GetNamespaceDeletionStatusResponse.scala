package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNamespaceDeletionStatusResponse extends js.Object {
  /**
    * An error code returned by the namespace deletion task.
    */
  var errorCode: js.UndefOr[NamespaceDeletionStatusErrorCodes] = js.undefined
  /**
    * An error code returned by the namespace deletion task.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the namespace that is being deleted.
    */
  var namespaceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the namespace that is being deleted.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  /**
    * The status of the deletion request.
    */
  var status: js.UndefOr[NamespaceDeletionStatus] = js.undefined
}

object GetNamespaceDeletionStatusResponse {
  @scala.inline
  def apply(
    errorCode: NamespaceDeletionStatusErrorCodes = null,
    errorMessage: String = null,
    namespaceArn: Arn = null,
    namespaceName: NamespaceName = null,
    status: NamespaceDeletionStatus = null
  ): GetNamespaceDeletionStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (namespaceArn != null) __obj.updateDynamic("namespaceArn")(namespaceArn)
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamespaceDeletionStatusResponse]
  }
}

