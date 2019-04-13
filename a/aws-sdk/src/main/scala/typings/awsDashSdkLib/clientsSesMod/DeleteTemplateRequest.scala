package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTemplateRequest extends js.Object {
  /**
    * The name of the template to be deleted.
    */
  var TemplateName: awsDashSdkLib.clientsSesMod.TemplateName
}

object DeleteTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): DeleteTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName)
  
    __obj.asInstanceOf[DeleteTemplateRequest]
  }
}

