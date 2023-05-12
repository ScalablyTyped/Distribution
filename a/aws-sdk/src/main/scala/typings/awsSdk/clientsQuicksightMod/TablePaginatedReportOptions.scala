package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablePaginatedReportOptions extends StObject {
  
  /**
    * The visibility of repeating header rows on each page.
    */
  var OverflowColumnHeaderVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The visibility of printing table overflow across pages.
    */
  var VerticalOverflowVisibility: js.UndefOr[Visibility] = js.undefined
}
object TablePaginatedReportOptions {
  
  inline def apply(): TablePaginatedReportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablePaginatedReportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TablePaginatedReportOptions] (val x: Self) extends AnyVal {
    
    inline def setOverflowColumnHeaderVisibility(value: Visibility): Self = StObject.set(x, "OverflowColumnHeaderVisibility", value.asInstanceOf[js.Any])
    
    inline def setOverflowColumnHeaderVisibilityUndefined: Self = StObject.set(x, "OverflowColumnHeaderVisibility", js.undefined)
    
    inline def setVerticalOverflowVisibility(value: Visibility): Self = StObject.set(x, "VerticalOverflowVisibility", value.asInstanceOf[js.Any])
    
    inline def setVerticalOverflowVisibilityUndefined: Self = StObject.set(x, "VerticalOverflowVisibility", js.undefined)
  }
}
