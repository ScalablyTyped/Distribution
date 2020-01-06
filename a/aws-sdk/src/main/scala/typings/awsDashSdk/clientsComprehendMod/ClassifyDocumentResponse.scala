package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifyDocumentResponse extends js.Object {
  /**
    * The classes used by the document being analyzed. These are used for multi-class trained models. Individual classes are mutually exclusive and each document is expected to have only a single class assigned to it. For example, an animal can be a dog or a cat, but not both at the same time. 
    */
  var Classes: js.UndefOr[ListOfClasses] = js.native
}

object ClassifyDocumentResponse {
  @scala.inline
  def apply(Classes: ListOfClasses = null): ClassifyDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (Classes != null) __obj.updateDynamic("Classes")(Classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyDocumentResponse]
  }
}

