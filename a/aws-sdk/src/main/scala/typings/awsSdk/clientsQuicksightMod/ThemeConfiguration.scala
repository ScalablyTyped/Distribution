package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeConfiguration extends StObject {
  
  /**
    * Color properties that apply to chart data colors.
    */
  var DataColorPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataColorPalette] = js.undefined
  
  /**
    * Display options related to sheets.
    */
  var Sheet: js.UndefOr[SheetStyle] = js.undefined
  
  /**
    * Color properties that apply to the UI and to charts, excluding the colors that apply to data. 
    */
  var UIColorPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.UIColorPalette] = js.undefined
}
object ThemeConfiguration {
  
  inline def apply(): ThemeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataColorPalette(value: DataColorPalette): Self = StObject.set(x, "DataColorPalette", value.asInstanceOf[js.Any])
    
    inline def setDataColorPaletteUndefined: Self = StObject.set(x, "DataColorPalette", js.undefined)
    
    inline def setSheet(value: SheetStyle): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetUndefined: Self = StObject.set(x, "Sheet", js.undefined)
    
    inline def setUIColorPalette(value: UIColorPalette): Self = StObject.set(x, "UIColorPalette", value.asInstanceOf[js.Any])
    
    inline def setUIColorPaletteUndefined: Self = StObject.set(x, "UIColorPalette", js.undefined)
  }
}
