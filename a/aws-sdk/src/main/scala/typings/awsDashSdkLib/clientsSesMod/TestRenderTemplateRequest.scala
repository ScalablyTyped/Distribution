package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRenderTemplateRequest extends js.Object {
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: awsDashSdkLib.clientsSesMod.TemplateData
  /**
    * The name of the template that you want to render.
    */
  var TemplateName: awsDashSdkLib.clientsSesMod.TemplateName
}

object TestRenderTemplateRequest {
  @scala.inline
  def apply(TemplateData: TemplateData, TemplateName: TemplateName): TestRenderTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateData = TemplateData, TemplateName = TemplateName)
  
    __obj.asInstanceOf[TestRenderTemplateRequest]
  }
}

