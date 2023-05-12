package typings.adobeAioLibAnalytics.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstPage extends StObject {
  
  var firstPage: js.UndefOr[Boolean] = js.undefined
  
  var lastPage: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var numberOfElements: js.UndefOr[Double] = js.undefined
  
  var reportId: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[js.Array[Data]] = js.undefined
  
  var summaryData: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var totalElements: js.UndefOr[Double] = js.undefined
}
object FirstPage {
  
  inline def apply(): FirstPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstPage] (val x: Self) extends AnyVal {
    
    inline def setFirstPage(value: Boolean): Self = StObject.set(x, "firstPage", value.asInstanceOf[js.Any])
    
    inline def setFirstPageUndefined: Self = StObject.set(x, "firstPage", js.undefined)
    
    inline def setLastPage(value: Boolean): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
    
    inline def setLastPageUndefined: Self = StObject.set(x, "lastPage", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberOfElements(value: Double): Self = StObject.set(x, "numberOfElements", value.asInstanceOf[js.Any])
    
    inline def setNumberOfElementsUndefined: Self = StObject.set(x, "numberOfElements", js.undefined)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    inline def setRows(value: js.Array[Data]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Data*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSummaryData(value: Record[String, scala.Nothing]): Self = StObject.set(x, "summaryData", value.asInstanceOf[js.Any])
    
    inline def setSummaryDataUndefined: Self = StObject.set(x, "summaryData", js.undefined)
    
    inline def setTotalElements(value: Double): Self = StObject.set(x, "totalElements", value.asInstanceOf[js.Any])
    
    inline def setTotalElementsUndefined: Self = StObject.set(x, "totalElements", js.undefined)
  }
}
