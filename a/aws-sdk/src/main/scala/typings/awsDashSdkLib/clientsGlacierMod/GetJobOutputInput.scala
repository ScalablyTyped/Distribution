package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobOutputInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: java.lang.String
  /**
    * The job ID whose data is downloaded.
    */
  var jobId: java.lang.String
  /**
    * The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576 bytes, specify the range as bytes=0-1048575. By default, this operation downloads the entire output. If the job output is large, then you can use a range to retrieve a portion of the output. This allows you to download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output you want to download and you decide to download 128 MB chunks of data at a time, which is a total of eight Get Job Output requests. You use the following process to download the job output:   Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data was received.   Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of the payload on the client and compare it with the checksum you received in the response to ensure you received all the expected data.   Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate byte range.   After downloading all the parts of the job output, you have a list of eight checksum values. Compute the tree hash of these values to find the checksum of the entire output. Using the DescribeJob API, obtain job information of the job that provided you the output. The response includes the checksum of the entire archive stored in Amazon Glacier. You compare this value with the checksum you computed to ensure you have downloaded the entire archive content with no errors.   
    */
  var range: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object GetJobOutputInput {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    jobId: java.lang.String,
    vaultName: java.lang.String,
    range: java.lang.String = null
  ): GetJobOutputInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, jobId = jobId, vaultName = vaultName)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[GetJobOutputInput]
  }
}

