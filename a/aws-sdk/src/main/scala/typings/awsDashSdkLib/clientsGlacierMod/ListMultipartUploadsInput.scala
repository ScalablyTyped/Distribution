package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMultipartUploadsInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: java.lang.String
  /**
    * Specifies the maximum number of uploads returned in the response body. If this value is not specified, the List Uploads operation returns up to 50 uploads.
    */
  var limit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An opaque string used for pagination. This value specifies the upload at which the listing of uploads should begin. Get the marker value from a previous List Uploads response. You need only include the marker if you are continuing the pagination of results started in a previous List Uploads request.
    */
  var marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object ListMultipartUploadsInput {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    vaultName: java.lang.String,
    limit: java.lang.String = null,
    marker: java.lang.String = null
  ): ListMultipartUploadsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[ListMultipartUploadsInput]
  }
}

