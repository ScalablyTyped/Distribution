package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSigningJobRequest extends js.Object {
  /**
    * String that identifies the signing request. All calls after the first that use this token return the same response as the first call.
    */
  var clientRequestToken: ClientRequestToken
  /**
    * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an optional prefix.
    */
  var destination: Destination
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  /**
    * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
    */
  var source: Source
}

object StartSigningJobRequest {
  @scala.inline
  def apply(
    clientRequestToken: ClientRequestToken,
    destination: Destination,
    source: Source,
    profileName: ProfileName = null
  ): StartSigningJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken, destination = destination, source = source)
    if (profileName != null) __obj.updateDynamic("profileName")(profileName)
    __obj.asInstanceOf[StartSigningJobRequest]
  }
}

