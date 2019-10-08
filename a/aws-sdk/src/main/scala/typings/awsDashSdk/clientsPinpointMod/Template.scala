package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /**
    * The name of the message template to use for the message. If specified, this value must match the name of an existing message template.
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object Template {
  @scala.inline
  def apply(Name: __string = null): Template = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Template]
  }
}

