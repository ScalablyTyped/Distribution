package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskImageDetail extends js.Object {
  /**
    * The size of the disk image, in GiB.
    */
  var Bytes: Long
  /**
    * The disk image format.
    */
  var Format: DiskImageFormat
  /**
    * A presigned URL for the import manifest stored in Amazon S3 and presented here as an Amazon S3 presigned URL. For information about creating a presigned URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the Authenticating REST Requests topic in the Amazon Simple Storage Service Developer Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  var ImportManifestUrl: String
}

object DiskImageDetail {
  @scala.inline
  def apply(Bytes: Long, Format: DiskImageFormat, ImportManifestUrl: String): DiskImageDetail = {
    val __obj = js.Dynamic.literal(Bytes = Bytes, Format = Format.asInstanceOf[js.Any], ImportManifestUrl = ImportManifestUrl)
  
    __obj.asInstanceOf[DiskImageDetail]
  }
}

