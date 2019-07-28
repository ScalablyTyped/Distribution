package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplateRequest extends js.Object {
  /**
    * The name of the template you want to retrieve.
    */
  var TemplateName: typings.awsDashSdk.clientsSesMod.TemplateName
}

object GetTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): GetTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName)
  
    __obj.asInstanceOf[GetTemplateRequest]
  }
}

