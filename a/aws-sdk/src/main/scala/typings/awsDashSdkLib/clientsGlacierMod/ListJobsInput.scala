package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: java.lang.String
  /**
    * The state of the jobs to return. You can specify true or false.
    */
  var completed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer than the specified limit, but the number of returned jobs never exceeds the limit.
    */
  var limit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of results started in a previous List Jobs request.
    */
  var marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of job status to return. You can specify the following values: InProgress, Succeeded, or Failed.
    */
  var statuscode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object ListJobsInput {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    vaultName: java.lang.String,
    completed: java.lang.String = null,
    limit: java.lang.String = null,
    marker: java.lang.String = null,
    statuscode: java.lang.String = null
  ): ListJobsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if (completed != null) __obj.updateDynamic("completed")(completed)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (statuscode != null) __obj.updateDynamic("statuscode")(statuscode)
    __obj.asInstanceOf[ListJobsInput]
  }
}

