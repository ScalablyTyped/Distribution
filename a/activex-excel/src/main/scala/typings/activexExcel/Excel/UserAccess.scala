package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAccess extends StObject {
  
  var AllowEdit: Boolean = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.UserAccess_typekey")
  var ExcelDotUserAccess_typekey: UserAccess = js.native
  
  val Name: String = js.native
}
object UserAccess {
  
  @scala.inline
  def apply(AllowEdit: Boolean, Delete: () => Unit, ExcelDotUserAccess_typekey: UserAccess, Name: String): UserAccess = {
    val __obj = js.Dynamic.literal(AllowEdit = AllowEdit.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.UserAccess_typekey")(ExcelDotUserAccess_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAccess]
  }
  
  @scala.inline
  implicit class UserAccessMutableBuilder[Self <: UserAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEdit(value: Boolean): Self = StObject.set(x, "AllowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotUserAccess_typekey(value: UserAccess): Self = StObject.set(x, "Excel.UserAccess_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
