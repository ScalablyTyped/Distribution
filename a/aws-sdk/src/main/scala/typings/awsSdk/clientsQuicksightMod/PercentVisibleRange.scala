package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentVisibleRange extends StObject {
  
  /**
    * The lower bound of the range.
    */
  var From: js.UndefOr[PercentNumber] = js.undefined
  
  /**
    * The top bound of the range.
    */
  var To: js.UndefOr[PercentNumber] = js.undefined
}
object PercentVisibleRange {
  
  inline def apply(): PercentVisibleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PercentVisibleRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PercentVisibleRange] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: PercentNumber): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    inline def setTo(value: PercentNumber): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
