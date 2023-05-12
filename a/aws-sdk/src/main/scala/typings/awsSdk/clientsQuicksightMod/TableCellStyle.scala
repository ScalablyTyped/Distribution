package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellStyle extends StObject {
  
  /**
    * The background color for the table cells.
    */
  var BackgroundColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The borders for the table cells.
    */
  var Border: js.UndefOr[GlobalTableBorderOptions] = js.undefined
  
  /**
    * The font configuration of the table cells.
    */
  var FontConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontConfiguration] = js.undefined
  
  /**
    * The height color for the table cells.
    */
  var Height: js.UndefOr[TableFieldHeight] = js.undefined
  
  /**
    * The horizontal text alignment (left, center, right, auto) for the table cells.
    */
  var HorizontalTextAlignment: js.UndefOr[typings.awsSdk.clientsQuicksightMod.HorizontalTextAlignment] = js.undefined
  
  /**
    * The text wrap (none, wrap) for the table cells.
    */
  var TextWrap: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TextWrap] = js.undefined
  
  /**
    * The vertical text alignment (top, middle, bottom) for the table cells.
    */
  var VerticalTextAlignment: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VerticalTextAlignment] = js.undefined
  
  /**
    * The visibility of the table cells.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object TableCellStyle {
  
  inline def apply(): TableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCellStyle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: HexColor): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    inline def setBorder(value: GlobalTableBorderOptions): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "Border", js.undefined)
    
    inline def setFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "FontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFontConfigurationUndefined: Self = StObject.set(x, "FontConfiguration", js.undefined)
    
    inline def setHeight(value: TableFieldHeight): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setHorizontalTextAlignment(value: HorizontalTextAlignment): Self = StObject.set(x, "HorizontalTextAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "HorizontalTextAlignment", js.undefined)
    
    inline def setTextWrap(value: TextWrap): Self = StObject.set(x, "TextWrap", value.asInstanceOf[js.Any])
    
    inline def setTextWrapUndefined: Self = StObject.set(x, "TextWrap", js.undefined)
    
    inline def setVerticalTextAlignment(value: VerticalTextAlignment): Self = StObject.set(x, "VerticalTextAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalTextAlignmentUndefined: Self = StObject.set(x, "VerticalTextAlignment", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
