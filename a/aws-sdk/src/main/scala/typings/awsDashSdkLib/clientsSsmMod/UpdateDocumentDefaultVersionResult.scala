package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentDefaultVersionResult extends js.Object {
  /**
    * The description of a custom document that you want to set as the default version.
    */
  var Description: js.UndefOr[DocumentDefaultVersionDescription] = js.undefined
}

object UpdateDocumentDefaultVersionResult {
  @scala.inline
  def apply(Description: DocumentDefaultVersionDescription = null): UpdateDocumentDefaultVersionResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateDocumentDefaultVersionResult]
  }
}

