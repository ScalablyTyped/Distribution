package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericSeparatorConfiguration extends StObject {
  
  /**
    * Determines the decimal separator.
    */
  var DecimalSeparator: js.UndefOr[NumericSeparatorSymbol] = js.undefined
  
  /**
    * The options that determine the thousands separator configuration.
    */
  var ThousandsSeparator: js.UndefOr[ThousandSeparatorOptions] = js.undefined
}
object NumericSeparatorConfiguration {
  
  inline def apply(): NumericSeparatorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericSeparatorConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericSeparatorConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDecimalSeparator(value: NumericSeparatorSymbol): Self = StObject.set(x, "DecimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "DecimalSeparator", js.undefined)
    
    inline def setThousandsSeparator(value: ThousandSeparatorOptions): Self = StObject.set(x, "ThousandsSeparator", value.asInstanceOf[js.Any])
    
    inline def setThousandsSeparatorUndefined: Self = StObject.set(x, "ThousandsSeparator", js.undefined)
  }
}
