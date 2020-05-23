package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAccess extends js.Object {
  var AllowEdit: Boolean
  @JSName("Excel.UserAccess_typekey")
  var ExcelDotUserAccess_typekey: UserAccess
  val Name: String
  def Delete(): Unit
}

object UserAccess {
  @scala.inline
  def apply(AllowEdit: Boolean, Delete: () => Unit, ExcelDotUserAccess_typekey: UserAccess, Name: String): UserAccess = {
    val __obj = js.Dynamic.literal(AllowEdit = AllowEdit.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.UserAccess_typekey")(ExcelDotUserAccess_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAccess]
  }
}

