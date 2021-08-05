package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAccess extends StObject {
  
  var AllowEdit: Boolean
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.UserAccess_typekey")
  var ExcelDotUserAccess_typekey: UserAccess
  
  val Name: String
}
object UserAccess {
  
  inline def apply(AllowEdit: Boolean, Delete: () => Unit, ExcelDotUserAccess_typekey: UserAccess, Name: String): UserAccess = {
    val __obj = js.Dynamic.literal(AllowEdit = AllowEdit.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.UserAccess_typekey")(ExcelDotUserAccess_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAccess]
  }
  
  extension [Self <: UserAccess](x: Self) {
    
    inline def setAllowEdit(value: Boolean): Self = StObject.set(x, "AllowEdit", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotUserAccess_typekey(value: UserAccess): Self = StObject.set(x, "Excel.UserAccess_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
