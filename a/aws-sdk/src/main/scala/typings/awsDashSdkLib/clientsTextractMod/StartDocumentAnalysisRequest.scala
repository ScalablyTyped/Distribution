package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDocumentAnalysisRequest extends js.Object {
  /**
    * The idempotent token that you use to identify the start request. If you use the same token with multiple StartDocumentAnalysis requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The location of the document to be processed.
    */
  var DocumentLocation: awsDashSdkLib.clientsTextractMod.DocumentLocation
  /**
    * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that are detected in the input document. Add FORMS to return detected fields and the associated text. To perform both types of analysis, add TABLES and FORMS to FeatureTypes.
    */
  var FeatureTypes: awsDashSdkLib.clientsTextractMod.FeatureTypes
  /**
    * The unique identifier you specify to identify the job in the completion status that's published to the Amazon SNS topic.
    */
  var JobTag: js.UndefOr[JobTag] = js.undefined
  /**
    * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to. 
    */
  var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
}

object StartDocumentAnalysisRequest {
  @scala.inline
  def apply(
    DocumentLocation: DocumentLocation,
    FeatureTypes: FeatureTypes,
    ClientRequestToken: ClientRequestToken = null,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartDocumentAnalysisRequest = {
    val __obj = js.Dynamic.literal(DocumentLocation = DocumentLocation, FeatureTypes = FeatureTypes)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag)
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel)
    __obj.asInstanceOf[StartDocumentAnalysisRequest]
  }
}

