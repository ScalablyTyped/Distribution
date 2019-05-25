package typings
package awsDashSdkLib.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectRequest extends js.Object {
  /**
    * The bytes to be stored. 
    */
  var Body: PayloadBlob
  /**
    * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
    */
  var CacheControl: js.UndefOr[StringPrimitive] = js.undefined
  /**
    * The content type of the object.
    */
  var ContentType: js.UndefOr[ContentType] = js.undefined
  /**
    * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt; For example, to upload the file mlaw.avi to the folder path premium\canada in the container movies, enter the path premium/canada/mlaw.avi. Do not include the container name in this path. If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an existing premium/usa subfolder. If you specify premium/canada, the service creates a canada subfolder in the premium folder. You then have two subfolders, usa and canada, in the premium folder.  There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental MediaStore. For more information about folders and how they exist in a container, see the AWS Elemental MediaStore User Guide. The file name is the name that is assigned to the file that you upload. The file can have the same name inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an extension. 
    */
  var Path: PathNaming
  /**
    * Indicates the storage class of a Put request. Defaults to high-performance temporal storage class, and objects are persisted into durable storage shortly after being received.
    */
  var StorageClass: js.UndefOr[StorageClass] = js.undefined
  /**
    * Indicates the availability of an object while it is still uploading. If the value is set to streaming, the object is available for downloading after some initial buffering but before the object is uploaded completely. If the value is set to standard, the object is available for downloading only when it is uploaded completely. The default value for this header is standard. To use this header, you must also set the HTTP Transfer-Encoding header to chunked.
    */
  var UploadAvailability: js.UndefOr[UploadAvailability] = js.undefined
}

object PutObjectRequest {
  @scala.inline
  def apply(
    Body: PayloadBlob,
    Path: PathNaming,
    CacheControl: StringPrimitive = null,
    ContentType: ContentType = null,
    StorageClass: StorageClass = null,
    UploadAvailability: UploadAvailability = null
  ): PutObjectRequest = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Path = Path)
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadAvailability != null) __obj.updateDynamic("UploadAvailability")(UploadAvailability.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectRequest]
  }
}

