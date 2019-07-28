package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UiTemplate extends js.Object {
  /**
    * The content of the Liquid template for the worker user interface.
    */
  var Content: TemplateContent
}

object UiTemplate {
  @scala.inline
  def apply(Content: TemplateContent): UiTemplate = {
    val __obj = js.Dynamic.literal(Content = Content)
  
    __obj.asInstanceOf[UiTemplate]
  }
}

