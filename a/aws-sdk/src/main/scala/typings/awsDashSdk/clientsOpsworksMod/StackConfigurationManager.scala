package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackConfigurationManager extends js.Object {
  /**
    * The name. This parameter must be set to "Chef".
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows stacks. The default value for Linux stacks is 11.4.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object StackConfigurationManager {
  @scala.inline
  def apply(Name: String = null, Version: String = null): StackConfigurationManager = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[StackConfigurationManager]
  }
}

