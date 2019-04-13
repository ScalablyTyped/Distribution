package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: java.lang.String
  /**
    * The maximum number of parts to be returned. The default limit is 50. The number of parts returned might be fewer than the specified limit, but the number of returned parts never exceeds the limit.
    */
  var limit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An opaque string used for pagination. This value specifies the part at which the listing of parts should begin. Get the marker value from the response of a previous List Parts response. You need only include the marker if you are continuing the pagination of results started in a previous List Parts request.
    */
  var marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The upload ID of the multipart upload.
    */
  var uploadId: java.lang.String
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object ListPartsInput {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    uploadId: java.lang.String,
    vaultName: java.lang.String,
    limit: java.lang.String = null,
    marker: java.lang.String = null
  ): ListPartsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, uploadId = uploadId, vaultName = vaultName)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[ListPartsInput]
  }
}

