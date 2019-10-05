package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportTask extends js.Object {
  /**
    * The total number of application records in the import file that failed to be imported.
    */
  var applicationImportFailure: js.UndefOr[Integer] = js.undefined
  /**
    * The total number of application records in the import file that were successfully imported.
    */
  var applicationImportSuccess: js.UndefOr[Integer] = js.undefined
  /**
    * A unique token used to prevent the same import request from occurring more than once. If you didn't provide a token, a token was automatically generated when the import task request was sent.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed records. You can use these two files to quickly identify records that failed, why they failed, and correct those records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another import task request. This field also includes authorization information so you can confirm the authenticity of the compressed archive before you download it. If some records failed to be imported we recommend that you correct the records in the failed entries file and then imports that failed entries file. This prevents you from having to correct and update the larger original file and attempt importing it again.
    */
  var errorsAndFailedEntriesZip: js.UndefOr[S3PresignedUrl] = js.undefined
  /**
    * The time that the import task request finished, presented in the Unix time stamp format.
    */
  var importCompletionTime: js.UndefOr[TimeStamp] = js.undefined
  /**
    * The time that the import task request was deleted, presented in the Unix time stamp format.
    */
  var importDeletedTime: js.UndefOr[TimeStamp] = js.undefined
  /**
    * The time that the import task request was made, presented in the Unix time stamp format.
    */
  var importRequestTime: js.UndefOr[TimeStamp] = js.undefined
  /**
    * The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an AWS account.
    */
  var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.undefined
  /**
    * The URL for your import file that you've uploaded to Amazon S3.
    */
  var importUrl: js.UndefOr[ImportURL] = js.undefined
  /**
    * A descriptive name for an import task. You can use this name to filter future requests related to this import task, such as identifying applications and servers that were included in this import task. We recommend that you use a meaningful name for each import task.
    */
  var name: js.UndefOr[ImportTaskName] = js.undefined
  /**
    * The total number of server records in the import file that failed to be imported.
    */
  var serverImportFailure: js.UndefOr[Integer] = js.undefined
  /**
    * The total number of server records in the import file that were successfully imported.
    */
  var serverImportSuccess: js.UndefOr[Integer] = js.undefined
  /**
    * The status of the import task. An import can have the status of IMPORT_COMPLETE and still have some records fail to import from the overall request. More information can be found in the downloadable archive defined in the errorsAndFailedEntriesZip field, or in the Migration Hub management console.
    */
  var status: js.UndefOr[ImportStatus] = js.undefined
}

object ImportTask {
  @scala.inline
  def apply(
    applicationImportFailure: Int | Double = null,
    applicationImportSuccess: Int | Double = null,
    clientRequestToken: ClientRequestToken = null,
    errorsAndFailedEntriesZip: S3PresignedUrl = null,
    importCompletionTime: TimeStamp = null,
    importDeletedTime: TimeStamp = null,
    importRequestTime: TimeStamp = null,
    importTaskId: ImportTaskIdentifier = null,
    importUrl: ImportURL = null,
    name: ImportTaskName = null,
    serverImportFailure: Int | Double = null,
    serverImportSuccess: Int | Double = null,
    status: ImportStatus = null
  ): ImportTask = {
    val __obj = js.Dynamic.literal()
    if (applicationImportFailure != null) __obj.updateDynamic("applicationImportFailure")(applicationImportFailure.asInstanceOf[js.Any])
    if (applicationImportSuccess != null) __obj.updateDynamic("applicationImportSuccess")(applicationImportSuccess.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (errorsAndFailedEntriesZip != null) __obj.updateDynamic("errorsAndFailedEntriesZip")(errorsAndFailedEntriesZip)
    if (importCompletionTime != null) __obj.updateDynamic("importCompletionTime")(importCompletionTime)
    if (importDeletedTime != null) __obj.updateDynamic("importDeletedTime")(importDeletedTime)
    if (importRequestTime != null) __obj.updateDynamic("importRequestTime")(importRequestTime)
    if (importTaskId != null) __obj.updateDynamic("importTaskId")(importTaskId)
    if (importUrl != null) __obj.updateDynamic("importUrl")(importUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (serverImportFailure != null) __obj.updateDynamic("serverImportFailure")(serverImportFailure.asInstanceOf[js.Any])
    if (serverImportSuccess != null) __obj.updateDynamic("serverImportSuccess")(serverImportSuccess.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTask]
  }
}

