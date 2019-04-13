package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobDocumentResponse extends js.Object {
  /**
    * The job document content.
    */
  var document: js.UndefOr[JobDocument] = js.undefined
}

object GetJobDocumentResponse {
  @scala.inline
  def apply(document: JobDocument = null): GetJobDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    __obj.asInstanceOf[GetJobDocumentResponse]
  }
}

