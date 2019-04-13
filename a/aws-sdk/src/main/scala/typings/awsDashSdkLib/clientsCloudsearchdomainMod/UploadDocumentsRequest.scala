package typings
package awsDashSdkLib.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadDocumentsRequest extends js.Object {
  /**
    * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:  application/json application/xml 
    */
  var contentType: ContentType
  /**
    * A batch of documents formatted in JSON or HTML.
    */
  var documents: _Blob
}

object UploadDocumentsRequest {
  @scala.inline
  def apply(contentType: ContentType, documents: _Blob): UploadDocumentsRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadDocumentsRequest]
  }
}

