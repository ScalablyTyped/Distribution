package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinWidthOptions extends StObject {
  
  /**
    * The options that determine the bin count limit.
    */
  var BinCountLimit: js.UndefOr[typings.awsSdk.clientsQuicksightMod.BinCountLimit] = js.undefined
  
  /**
    * The options that determine the bin width value.
    */
  var Value: js.UndefOr[BinWidthValue] = js.undefined
}
object BinWidthOptions {
  
  inline def apply(): BinWidthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinWidthOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinWidthOptions] (val x: Self) extends AnyVal {
    
    inline def setBinCountLimit(value: BinCountLimit): Self = StObject.set(x, "BinCountLimit", value.asInstanceOf[js.Any])
    
    inline def setBinCountLimitUndefined: Self = StObject.set(x, "BinCountLimit", js.undefined)
    
    inline def setValue(value: BinWidthValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
