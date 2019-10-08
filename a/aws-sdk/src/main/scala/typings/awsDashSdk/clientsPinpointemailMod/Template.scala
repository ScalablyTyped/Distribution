package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var TemplateArn: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.TemplateArn] = js.undefined
  /**
    * An object that defines the values to use for message variables in the template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the value to use for that variable.
    */
  var TemplateData: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.TemplateData] = js.undefined
}

object Template {
  @scala.inline
  def apply(TemplateArn: TemplateArn = null, TemplateData: TemplateData = null): Template = {
    val __obj = js.Dynamic.literal()
    if (TemplateArn != null) __obj.updateDynamic("TemplateArn")(TemplateArn)
    if (TemplateData != null) __obj.updateDynamic("TemplateData")(TemplateData)
    __obj.asInstanceOf[Template]
  }
}

