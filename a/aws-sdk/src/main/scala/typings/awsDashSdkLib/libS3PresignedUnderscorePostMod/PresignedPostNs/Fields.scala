package typings
package awsDashSdkLib.libS3PresignedUnderscorePostMod.PresignedPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Fields
  extends /**
         * Additional keys that must be included in the form to be submitted. This
         * will include signature metadata as well as any fields provided to
         * s3.createPresignedPost
         */
/* key */ ScalablyTyped.runtime.StringDictionary[java.lang.String] {
  /**
           * A base64-encoded policy detailing what constitutes an acceptable POST
           * upload. Composed of the conditions and expiration provided to
           * s3.createPresignedPost
           */
  var Policy: java.lang.String
  /**
           * A hex-encoded HMAC of the POST policy, signed with the credentials
           * provided to the S3 client.
           */
  var `X-Amz-Signature`: java.lang.String
}

