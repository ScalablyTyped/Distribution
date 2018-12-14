package typings
package awsDashSdkLib.libS3PresignedUnderscorePostMod.PresignedPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Params extends js.Object {
  /**
           * The S3 bucket to which the form should upload an attached file.
           */
  var Bucket: js.UndefOr[java.lang.String] = js.undefined
  /**
           * An array of conditions that must be met for the form upload to be
           * accepted by S3.
           */
  var Conditions: js.UndefOr[
    js.Array[
      org.scalablytyped.runtime.StringDictionary[_] | (js.Tuple3[java.lang.String, _, _])
    ]
  ] = js.undefined
  /**
           * The number of seconds for which the POST form's signed policy should be
           * valid. Defaults to 3600 (one hour).
           */
  var Expires: js.UndefOr[scala.Double] = js.undefined
  /**
           * A hash of form fields to include in the presigned POST form. All fields
           * (except 'key') will be included as exact match conditions in the
           * presigned policy.
           */
  var Fields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

