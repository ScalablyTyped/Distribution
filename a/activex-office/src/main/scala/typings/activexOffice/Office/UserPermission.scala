package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermission extends js.Object {
  val Application: js.Any
  val Creator: Double
  var ExpirationDate: VarDate
  @JSName("Office.UserPermission_typekey")
  var OfficeDotUserPermission_typekey: UserPermission
  val Parent: js.Any
  var Permission: Double
  val UserId: String
  def Remove(): Unit
}

object UserPermission {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    ExpirationDate: VarDate,
    OfficeDotUserPermission_typekey: UserPermission,
    Parent: js.Any,
    Permission: Double,
    Remove: () => Unit,
    UserId: String
  ): UserPermission = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), UserId = UserId.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.UserPermission_typekey")(OfficeDotUserPermission_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPermission]
  }
}

