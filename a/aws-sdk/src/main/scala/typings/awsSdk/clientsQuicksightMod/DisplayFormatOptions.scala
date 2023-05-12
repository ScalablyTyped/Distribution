package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayFormatOptions extends StObject {
  
  /**
    * Determines the blank cell format.
    */
  var BlankCellFormat: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The currency symbol, such as USD.
    */
  var CurrencySymbol: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * Determines the DateTime format.
    */
  var DateFormat: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * Determines the decimal separator.
    */
  var DecimalSeparator: js.UndefOr[TopicNumericSeparatorSymbol] = js.undefined
  
  /**
    * Determines the number of fraction digits.
    */
  var FractionDigits: js.UndefOr[Integer] = js.undefined
  
  /**
    * Determines the grouping separator.
    */
  var GroupingSeparator: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The negative format.
    */
  var NegativeFormat: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NegativeFormat] = js.undefined
  
  /**
    * The prefix value for a display format.
    */
  var Prefix: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The suffix value for a display format.
    */
  var Suffix: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The unit scaler. Valid values for this structure are: NONE, AUTO, THOUSANDS, MILLIONS, BILLIONS, and TRILLIONS.
    */
  var UnitScaler: js.UndefOr[NumberScale] = js.undefined
  
  /**
    * A Boolean value that indicates whether to use blank cell format.
    */
  var UseBlankCellFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether to use grouping.
    */
  var UseGrouping: js.UndefOr[Boolean] = js.undefined
}
object DisplayFormatOptions {
  
  inline def apply(): DisplayFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setBlankCellFormat(value: LimitedString): Self = StObject.set(x, "BlankCellFormat", value.asInstanceOf[js.Any])
    
    inline def setBlankCellFormatUndefined: Self = StObject.set(x, "BlankCellFormat", js.undefined)
    
    inline def setCurrencySymbol(value: LimitedString): Self = StObject.set(x, "CurrencySymbol", value.asInstanceOf[js.Any])
    
    inline def setCurrencySymbolUndefined: Self = StObject.set(x, "CurrencySymbol", js.undefined)
    
    inline def setDateFormat(value: LimitedString): Self = StObject.set(x, "DateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "DateFormat", js.undefined)
    
    inline def setDecimalSeparator(value: TopicNumericSeparatorSymbol): Self = StObject.set(x, "DecimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "DecimalSeparator", js.undefined)
    
    inline def setFractionDigits(value: Integer): Self = StObject.set(x, "FractionDigits", value.asInstanceOf[js.Any])
    
    inline def setFractionDigitsUndefined: Self = StObject.set(x, "FractionDigits", js.undefined)
    
    inline def setGroupingSeparator(value: LimitedString): Self = StObject.set(x, "GroupingSeparator", value.asInstanceOf[js.Any])
    
    inline def setGroupingSeparatorUndefined: Self = StObject.set(x, "GroupingSeparator", js.undefined)
    
    inline def setNegativeFormat(value: NegativeFormat): Self = StObject.set(x, "NegativeFormat", value.asInstanceOf[js.Any])
    
    inline def setNegativeFormatUndefined: Self = StObject.set(x, "NegativeFormat", js.undefined)
    
    inline def setPrefix(value: LimitedString): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setSuffix(value: LimitedString): Self = StObject.set(x, "Suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "Suffix", js.undefined)
    
    inline def setUnitScaler(value: NumberScale): Self = StObject.set(x, "UnitScaler", value.asInstanceOf[js.Any])
    
    inline def setUnitScalerUndefined: Self = StObject.set(x, "UnitScaler", js.undefined)
    
    inline def setUseBlankCellFormat(value: Boolean): Self = StObject.set(x, "UseBlankCellFormat", value.asInstanceOf[js.Any])
    
    inline def setUseBlankCellFormatUndefined: Self = StObject.set(x, "UseBlankCellFormat", js.undefined)
    
    inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "UseGrouping", value.asInstanceOf[js.Any])
    
    inline def setUseGroupingUndefined: Self = StObject.set(x, "UseGrouping", js.undefined)
  }
}
