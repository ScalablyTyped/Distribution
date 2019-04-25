package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDocumentTextDetectionRequest extends js.Object {
  /**
    * The idempotent token that's used to identify the start request. If you use the same token with multiple StartDocumentTextDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The location of the document to be processed.
    */
  var DocumentLocation: awsDashSdkLib.clientsTextractMod.DocumentLocation
  /**
    * An identifier you specify that's included in the completion notification that's published to the Amazon SNS topic. For example, you can use JobTag to identify the type of document, such as a tax form or a receipt, that the completion notification corresponds to.
    */
  var JobTag: js.UndefOr[JobTag] = js.undefined
  /**
    * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to. 
    */
  var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
}

object StartDocumentTextDetectionRequest {
  @scala.inline
  def apply(
    DocumentLocation: DocumentLocation,
    ClientRequestToken: ClientRequestToken = null,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartDocumentTextDetectionRequest = {
    val __obj = js.Dynamic.literal(DocumentLocation = DocumentLocation)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag)
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel)
    __obj.asInstanceOf[StartDocumentTextDetectionRequest]
  }
}

