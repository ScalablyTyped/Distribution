package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeFormat extends StObject {
  
  /**
    * The prefix for a negative format.
    */
  var Prefix: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The suffix for a negative format.
    */
  var Suffix: js.UndefOr[LimitedString] = js.undefined
}
object NegativeFormat {
  
  inline def apply(): NegativeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegativeFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NegativeFormat] (val x: Self) extends AnyVal {
    
    inline def setPrefix(value: LimitedString): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setSuffix(value: LimitedString): Self = StObject.set(x, "Suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "Suffix", js.undefined)
  }
}
