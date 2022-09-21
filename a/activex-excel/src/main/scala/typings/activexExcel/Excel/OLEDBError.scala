package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OLEDBError extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  val ErrorString: String
  
  /* private */ @JSName("Excel.OLEDBError_typekey")
  var ExcelDotOLEDBError_typekey: OLEDBError
  
  val Native: Double
  
  val Number: Double
  
  val Parent: Any
  
  val SqlState: String
  
  val Stage: Double
}
object OLEDBError {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    ErrorString: String,
    ExcelDotOLEDBError_typekey: OLEDBError,
    Native: Double,
    Number: Double,
    Parent: Any,
    SqlState: String,
    Stage: Double
  ): OLEDBError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorString = ErrorString.asInstanceOf[js.Any], Native = Native.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SqlState = SqlState.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.OLEDBError_typekey")(ExcelDotOLEDBError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEDBError]
  }
  
  extension [Self <: OLEDBError](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setErrorString(value: String): Self = StObject.set(x, "ErrorString", value.asInstanceOf[js.Any])
    
    inline def setExcelDotOLEDBError_typekey(value: OLEDBError): Self = StObject.set(x, "Excel.OLEDBError_typekey", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Double): Self = StObject.set(x, "Native", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSqlState(value: String): Self = StObject.set(x, "SqlState", value.asInstanceOf[js.Any])
    
    inline def setStage(value: Double): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
  }
}
