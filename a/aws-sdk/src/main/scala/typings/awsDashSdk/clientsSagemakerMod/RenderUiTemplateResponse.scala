package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderUiTemplateResponse extends js.Object {
  /**
    * A list of one or more RenderingError objects if any were encountered while rendering the template. If there were no errors, the list is empty.
    */
  var Errors: RenderingErrorList = js.native
  /**
    * A Liquid template that renders the HTML for the worker UI.
    */
  var RenderedContent: String = js.native
}

object RenderUiTemplateResponse {
  @scala.inline
  def apply(Errors: RenderingErrorList, RenderedContent: String): RenderUiTemplateResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any], RenderedContent = RenderedContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderUiTemplateResponse]
  }
}

