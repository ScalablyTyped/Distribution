package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadDocumentsRequest extends js.Object {
  /**
    * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:  application/json application/xml 
    */
  var contentType: ContentType = js.native
  /**
    * A batch of documents formatted in JSON or HTML.
    */
  var documents: _Blob = js.native
}

object UploadDocumentsRequest {
  @scala.inline
  def apply(contentType: ContentType, documents: _Blob): UploadDocumentsRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadDocumentsRequest]
  }
}

