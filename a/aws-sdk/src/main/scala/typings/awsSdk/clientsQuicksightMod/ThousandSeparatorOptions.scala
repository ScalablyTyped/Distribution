package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThousandSeparatorOptions extends StObject {
  
  /**
    * Determines the thousands separator symbol.
    */
  var Symbol: js.UndefOr[NumericSeparatorSymbol] = js.undefined
  
  /**
    * Determines the visibility of the thousands separator.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object ThousandSeparatorOptions {
  
  inline def apply(): ThousandSeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThousandSeparatorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThousandSeparatorOptions] (val x: Self) extends AnyVal {
    
    inline def setSymbol(value: NumericSeparatorSymbol): Self = StObject.set(x, "Symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "Symbol", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
