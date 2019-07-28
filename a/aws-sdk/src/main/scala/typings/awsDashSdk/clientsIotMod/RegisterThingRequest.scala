package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterThingRequest extends js.Object {
  /**
    * The parameters for provisioning a thing. See Programmatic Provisioning for more information.
    */
  var parameters: js.UndefOr[Parameters] = js.undefined
  /**
    * The provisioning template. See Programmatic Provisioning for more information.
    */
  var templateBody: TemplateBody
}

object RegisterThingRequest {
  @scala.inline
  def apply(templateBody: TemplateBody, parameters: Parameters = null): RegisterThingRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[RegisterThingRequest]
  }
}

