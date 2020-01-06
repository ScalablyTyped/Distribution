package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobDocumentResponse extends js.Object {
  /**
    * The job document content.
    */
  var document: js.UndefOr[JobDocument] = js.native
}

object GetJobDocumentResponse {
  @scala.inline
  def apply(document: JobDocument = null): GetJobDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobDocumentResponse]
  }
}

