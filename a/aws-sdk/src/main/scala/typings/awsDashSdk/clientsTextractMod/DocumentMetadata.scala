package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMetadata extends js.Object {
  /**
    * The number of pages that are detected in the document.
    */
  var Pages: js.UndefOr[UInteger] = js.native
}

object DocumentMetadata {
  @scala.inline
  def apply(Pages: Int | Double = null): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    if (Pages != null) __obj.updateDynamic("Pages")(Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
}

