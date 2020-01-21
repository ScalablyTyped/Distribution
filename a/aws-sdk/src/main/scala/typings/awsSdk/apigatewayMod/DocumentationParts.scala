package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationParts extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDocumentationPart] = js.native
  var position: js.UndefOr[String] = js.native
}

object DocumentationParts {
  @scala.inline
  def apply(items: ListOfDocumentationPart = null, position: String = null): DocumentationParts = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationParts]
  }
}

