package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiTemplate extends js.Object {
  /**
    * The content of the Liquid template for the worker user interface.
    */
  var Content: TemplateContent = js.native
}

object UiTemplate {
  @scala.inline
  def apply(Content: TemplateContent): UiTemplate = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UiTemplate]
  }
}

