package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAttribute extends js.Object {
  /**
    *  The maximum allowed value. 
    */
  var Maximum: js.UndefOr[Integer] = js.undefined
  /**
    *  The attribute name. The following are supported attribute names.     ServerLimit: The number of current servers/maximum number of servers allowed. By default, you can have a maximum of 10 servers.     ManualBackupLimit: The number of current manual backups/maximum number of backups allowed. By default, you can have a maximum of 50 manual backups saved.   
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    *  The current usage, such as the current number of servers that are associated with the account. 
    */
  var Used: js.UndefOr[Integer] = js.undefined
}

object AccountAttribute {
  @scala.inline
  def apply(
    Maximum: js.UndefOr[Integer] = js.undefined,
    Name: String = null,
    Used: js.UndefOr[Integer] = js.undefined
  ): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Maximum)) __obj.updateDynamic("Maximum")(Maximum)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Used)) __obj.updateDynamic("Used")(Used)
    __obj.asInstanceOf[AccountAttribute]
  }
}

