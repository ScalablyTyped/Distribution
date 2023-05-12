package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalOptions extends StObject {
  
  /**
    * The custom label string for the total cells.
    */
  var CustomLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The placement (start, end) for the total cells.
    */
  var Placement: js.UndefOr[TableTotalsPlacement] = js.undefined
  
  /**
    * The scroll status (pinned, scrolled) for the total cells.
    */
  var ScrollStatus: js.UndefOr[TableTotalsScrollStatus] = js.undefined
  
  /**
    * Cell styling options for the total cells.
    */
  var TotalCellStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /**
    * The visibility configuration for the total cells.
    */
  var TotalsVisibility: js.UndefOr[Visibility] = js.undefined
}
object TotalOptions {
  
  inline def apply(): TotalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomLabel(value: String): Self = StObject.set(x, "CustomLabel", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelUndefined: Self = StObject.set(x, "CustomLabel", js.undefined)
    
    inline def setPlacement(value: TableTotalsPlacement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setScrollStatus(value: TableTotalsScrollStatus): Self = StObject.set(x, "ScrollStatus", value.asInstanceOf[js.Any])
    
    inline def setScrollStatusUndefined: Self = StObject.set(x, "ScrollStatus", js.undefined)
    
    inline def setTotalCellStyle(value: TableCellStyle): Self = StObject.set(x, "TotalCellStyle", value.asInstanceOf[js.Any])
    
    inline def setTotalCellStyleUndefined: Self = StObject.set(x, "TotalCellStyle", js.undefined)
    
    inline def setTotalsVisibility(value: Visibility): Self = StObject.set(x, "TotalsVisibility", value.asInstanceOf[js.Any])
    
    inline def setTotalsVisibilityUndefined: Self = StObject.set(x, "TotalsVisibility", js.undefined)
  }
}
