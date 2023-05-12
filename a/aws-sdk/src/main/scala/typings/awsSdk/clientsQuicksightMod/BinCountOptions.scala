package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinCountOptions extends StObject {
  
  /**
    * The options that determine the bin count value.
    */
  var Value: js.UndefOr[BinCountValue] = js.undefined
}
object BinCountOptions {
  
  inline def apply(): BinCountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinCountOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinCountOptions] (val x: Self) extends AnyVal {
    
    inline def setValue(value: BinCountValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
