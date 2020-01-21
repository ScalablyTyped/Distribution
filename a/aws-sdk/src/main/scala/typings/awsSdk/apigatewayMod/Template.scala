package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  /**
    * The Apache Velocity Template Language (VTL) template content used for the template resource.
    */
  var value: js.UndefOr[String] = js.native
}

object Template {
  @scala.inline
  def apply(value: String = null): Template = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

