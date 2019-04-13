package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyOptionGroupMessage extends js.Object {
  /**
    * Indicates whether the changes should be applied immediately, or during the next maintenance window for each instance associated with the option group.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the option group to be modified. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: String
  /**
    * Options in this list are added to the option group or, if already present, the specified configuration is used to update the existing configuration.
    */
  var OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.undefined
  /**
    * Options in this list are removed from the option group.
    */
  var OptionsToRemove: js.UndefOr[OptionNamesList] = js.undefined
}

object ModifyOptionGroupMessage {
  @scala.inline
  def apply(
    OptionGroupName: String,
    ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
    OptionsToInclude: OptionConfigurationList = null,
    OptionsToRemove: OptionNamesList = null
  ): ModifyOptionGroupMessage = {
    val __obj = js.Dynamic.literal(OptionGroupName = OptionGroupName)
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately)
    if (OptionsToInclude != null) __obj.updateDynamic("OptionsToInclude")(OptionsToInclude)
    if (OptionsToRemove != null) __obj.updateDynamic("OptionsToRemove")(OptionsToRemove)
    __obj.asInstanceOf[ModifyOptionGroupMessage]
  }
}

