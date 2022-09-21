package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dialog extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Dialog_typekey")
  var ExcelDotDialog_typekey: Dialog
  
  val Parent: Any
  
  def Show(
    Arg1: js.UndefOr[Any],
    Arg2: js.UndefOr[Any],
    Arg3: js.UndefOr[Any],
    Arg4: js.UndefOr[Any],
    Arg5: js.UndefOr[Any],
    Arg6: js.UndefOr[Any],
    Arg7: js.UndefOr[Any],
    Arg8: js.UndefOr[Any],
    Arg9: js.UndefOr[Any],
    Arg10: js.UndefOr[Any],
    Arg11: js.UndefOr[Any],
    Arg12: js.UndefOr[Any],
    Arg13: js.UndefOr[Any],
    Arg14: js.UndefOr[Any],
    Arg15: js.UndefOr[Any],
    Arg16: js.UndefOr[Any],
    Arg17: js.UndefOr[Any],
    Arg18: js.UndefOr[Any],
    Arg19: js.UndefOr[Any],
    Arg20: js.UndefOr[Any],
    Arg21: js.UndefOr[Any],
    Arg22: js.UndefOr[Any],
    Arg23: js.UndefOr[Any],
    Arg24: js.UndefOr[Any],
    Arg25: js.UndefOr[Any],
    Arg26: js.UndefOr[Any],
    Arg27: js.UndefOr[Any],
    Arg28: js.UndefOr[Any],
    Arg29: js.UndefOr[Any],
    Arg30: js.UndefOr[Any]
  ): Boolean
}
object Dialog {
  
  inline def apply(Application: Application, Creator: XlCreator, ExcelDotDialog_typekey: Dialog, Parent: Any): Dialog = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Dialog_typekey")(ExcelDotDialog_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialog]
  }
  
  extension [Self <: Dialog](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotDialog_typekey(value: Dialog): Self = StObject.set(x, "Excel.Dialog_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
