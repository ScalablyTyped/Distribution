package typings.awsDashSdk.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectResponse extends js.Object {
  /**
    * The bytes of the object. 
    */
  var Body: js.UndefOr[PayloadBlob] = js.undefined
  /**
    * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP spec at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
    */
  var CacheControl: js.UndefOr[StringPrimitive] = js.undefined
  /**
    * The length of the object in bytes.
    */
  var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
  /**
    * The range of bytes to retrieve.
    */
  var ContentRange: js.UndefOr[ContentRangePattern] = js.undefined
  /**
    * The content type of the object.
    */
  var ContentType: js.UndefOr[typings.awsDashSdk.clientsMediastoredataMod.ContentType] = js.undefined
  /**
    * The ETag that represents a unique instance of the object.
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsMediastoredataMod.ETag] = js.undefined
  /**
    * The date and time that the object was last modified.
    */
  var LastModified: js.UndefOr[TimeStamp] = js.undefined
  /**
    * The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other status codes indicate the type of error that occurred.
    */
  var StatusCode: statusCode
}

object GetObjectResponse {
  @scala.inline
  def apply(
    StatusCode: statusCode,
    Body: PayloadBlob = null,
    CacheControl: StringPrimitive = null,
    ContentLength: Int | Double = null,
    ContentRange: ContentRangePattern = null,
    ContentType: ContentType = null,
    ETag: ETag = null,
    LastModified: TimeStamp = null
  ): GetObjectResponse = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode)
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl)
    if (ContentLength != null) __obj.updateDynamic("ContentLength")(ContentLength.asInstanceOf[js.Any])
    if (ContentRange != null) __obj.updateDynamic("ContentRange")(ContentRange)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    __obj.asInstanceOf[GetObjectResponse]
  }
}

