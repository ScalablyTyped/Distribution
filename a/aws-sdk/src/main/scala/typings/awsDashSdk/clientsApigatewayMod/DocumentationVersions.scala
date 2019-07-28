package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationVersions extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDocumentationVersion] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object DocumentationVersions {
  @scala.inline
  def apply(items: ListOfDocumentationVersion = null, position: String = null): DocumentationVersions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[DocumentationVersions]
  }
}

