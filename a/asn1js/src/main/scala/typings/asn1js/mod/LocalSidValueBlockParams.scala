package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSidValueBlockParams
  extends StObject
     with LocalHexBlockParams {
  
  var isFirstSid: js.UndefOr[scala.Boolean] = js.undefined
  
  var valueDec: js.UndefOr[Double] = js.undefined
}
object LocalSidValueBlockParams {
  
  inline def apply(): LocalSidValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSidValueBlockParams]
  }
  
  extension [Self <: LocalSidValueBlockParams](x: Self) {
    
    inline def setIsFirstSid(value: scala.Boolean): Self = StObject.set(x, "isFirstSid", value.asInstanceOf[js.Any])
    
    inline def setIsFirstSidUndefined: Self = StObject.set(x, "isFirstSid", js.undefined)
    
    inline def setValueDec(value: Double): Self = StObject.set(x, "valueDec", value.asInstanceOf[js.Any])
    
    inline def setValueDecUndefined: Self = StObject.set(x, "valueDec", js.undefined)
  }
}
