package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationVersions extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDocumentationVersion] = js.native
  var position: js.UndefOr[String] = js.native
}

object DocumentationVersions {
  @scala.inline
  def apply(items: ListOfDocumentationVersion = null, position: String = null): DocumentationVersions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationVersions]
  }
}

