package typings.awsDashSdk.libS3PresignedUnderscorePostMod.PresignedPostNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields
  extends /**
  * Additional keys that must be included in the form to be submitted. This
  * will include signature metadata as well as any fields provided to
  * s3.createPresignedPost
  */
/* key */ StringDictionary[String] {
  /**
    * A base64-encoded policy detailing what constitutes an acceptable POST
    * upload. Composed of the conditions and expiration provided to
    * s3.createPresignedPost
    */
  var Policy: String
  /**
    * A hex-encoded HMAC of the POST policy, signed with the credentials
    * provided to the S3 client.
    */
  var `X-Amz-Signature`: String
}

object Fields {
  @scala.inline
  def apply(
    Policy: String,
    `X-Amz-Signature`: String,
    StringDictionary: /**
    * Additional keys that must be included in the form to be submitted. This
    * will include signature metadata as well as any fields provided to
    * s3.createPresignedPost
    */
  /* key */ StringDictionary[String] = null
  ): Fields = {
    val __obj = js.Dynamic.literal(Policy = Policy)
    __obj.updateDynamic("X-Amz-Signature")(`X-Amz-Signature`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Fields]
  }
}

