package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetadata extends js.Object {
  /**
    * The number of pages detected in the document.
    */
  var Pages: js.UndefOr[UInteger] = js.undefined
}

object DocumentMetadata {
  @scala.inline
  def apply(Pages: js.UndefOr[UInteger] = js.undefined): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Pages)) __obj.updateDynamic("Pages")(Pages)
    __obj.asInstanceOf[DocumentMetadata]
  }
}

