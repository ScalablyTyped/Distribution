package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import typings.activexExcel.Excel.XlXmlImportResult
import typings.activexExcel.Excel.XmlMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRefresh extends StObject {
  
  val IsRefresh: Boolean
  
  val Map: XmlMap
  
  val Result: XlXmlImportResult
  
  val Wb: Workbook
}
object IsRefresh {
  
  inline def apply(IsRefresh: Boolean, Map: XmlMap, Result: XlXmlImportResult, Wb: Workbook): IsRefresh = {
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefresh]
  }
  
  extension [Self <: IsRefresh](x: Self) {
    
    inline def setIsRefresh(value: Boolean): Self = StObject.set(x, "IsRefresh", value.asInstanceOf[js.Any])
    
    inline def setMap(value: XmlMap): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
    
    inline def setResult(value: XlXmlImportResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
