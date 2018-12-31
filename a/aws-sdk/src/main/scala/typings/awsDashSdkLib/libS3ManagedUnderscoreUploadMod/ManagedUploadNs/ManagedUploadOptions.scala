package typings
package awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedUploadOptions extends js.Object {
  /**
    * Default: false
    * Whether to abort the multipart upload if an error occurs. Set to true if you want to handle failures manually.
    */
  var leavePartsOnError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A map of parameters to pass to the upload requests.
    * The "Body" parameter is required to be specified either on the service or in the params option.
    */
  var params: js.UndefOr[awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRequest] = js.undefined
  /**
    * Default: 5 mb
    * The size in bytes for each individual part to be uploaded. Adjust the part size to ensure the number of parts does not exceed maxTotalParts. See minPartSize for the minimum allowed part size.
    */
  var partSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size of the concurrent queue manager to upload parts in parallel. Set to 1 for synchronous uploading of parts. Note that the uploader will buffer at most queueSize * partSize bytes into memory at any given time.
    * default: 4
    */
  var queueSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional S3 service object to use for requests.
    * This object might have bound parameters used by the uploader.
    */
  var service: js.UndefOr[awsDashSdkLib.clientsS3Mod.namespaced] = js.undefined
  /**
    * The tags to apply to the object.
    */
  var tags: js.UndefOr[js.Array[awsDashSdkLib.clientsS3Mod.S3Ns.Tag]] = js.undefined
}

