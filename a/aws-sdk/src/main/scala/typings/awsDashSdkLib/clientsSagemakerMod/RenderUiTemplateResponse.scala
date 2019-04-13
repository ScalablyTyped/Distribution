package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderUiTemplateResponse extends js.Object {
  /**
    * A list of one or more RenderingError objects if any were encountered while rendering the template. If there were no errors, the list is empty.
    */
  var Errors: RenderingErrorList
  /**
    * A Liquid template that renders the HTML for the worker UI.
    */
  var RenderedContent: String
}

object RenderUiTemplateResponse {
  @scala.inline
  def apply(Errors: RenderingErrorList, RenderedContent: String): RenderUiTemplateResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors, RenderedContent = RenderedContent)
  
    __obj.asInstanceOf[RenderUiTemplateResponse]
  }
}

