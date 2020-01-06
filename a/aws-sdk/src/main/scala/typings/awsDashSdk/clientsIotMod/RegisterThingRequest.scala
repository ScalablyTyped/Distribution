package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterThingRequest extends js.Object {
  /**
    * The parameters for provisioning a thing. See Programmatic Provisioning for more information.
    */
  var parameters: js.UndefOr[Parameters] = js.native
  /**
    * The provisioning template. See Programmatic Provisioning for more information.
    */
  var templateBody: TemplateBody = js.native
}

object RegisterThingRequest {
  @scala.inline
  def apply(templateBody: TemplateBody, parameters: Parameters = null): RegisterThingRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterThingRequest]
  }
}

