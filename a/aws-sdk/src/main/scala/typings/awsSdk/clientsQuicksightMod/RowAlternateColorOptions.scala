package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowAlternateColorOptions extends StObject {
  
  /**
    * Determines the list of row alternate colors.
    */
  var RowAlternateColors: js.UndefOr[RowAlternateColorList] = js.undefined
  
  /**
    * Determines the widget status.
    */
  var Status: js.UndefOr[WidgetStatus] = js.undefined
}
object RowAlternateColorOptions {
  
  inline def apply(): RowAlternateColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowAlternateColorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowAlternateColorOptions] (val x: Self) extends AnyVal {
    
    inline def setRowAlternateColors(value: RowAlternateColorList): Self = StObject.set(x, "RowAlternateColors", value.asInstanceOf[js.Any])
    
    inline def setRowAlternateColorsUndefined: Self = StObject.set(x, "RowAlternateColors", js.undefined)
    
    inline def setRowAlternateColorsVarargs(value: HexColor*): Self = StObject.set(x, "RowAlternateColors", js.Array(value*))
    
    inline def setStatus(value: WidgetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
