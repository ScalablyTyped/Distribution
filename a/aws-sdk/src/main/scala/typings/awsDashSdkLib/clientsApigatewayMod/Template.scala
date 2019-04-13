package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /**
    * The Apache Velocity Template Language (VTL) template content used for the template resource.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Template {
  @scala.inline
  def apply(value: String = null): Template = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Template]
  }
}

