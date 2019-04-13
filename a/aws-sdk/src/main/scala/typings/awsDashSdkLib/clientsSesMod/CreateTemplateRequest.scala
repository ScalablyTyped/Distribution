package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTemplateRequest extends js.Object {
  /**
    * The content of the email, composed of a subject line, an HTML part, and a text-only part.
    */
  var Template: awsDashSdkLib.clientsSesMod.Template
}

object CreateTemplateRequest {
  @scala.inline
  def apply(Template: Template): CreateTemplateRequest = {
    val __obj = js.Dynamic.literal(Template = Template)
  
    __obj.asInstanceOf[CreateTemplateRequest]
  }
}

