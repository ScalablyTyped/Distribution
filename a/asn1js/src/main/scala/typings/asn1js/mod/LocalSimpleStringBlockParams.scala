package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSimpleStringBlockParams extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object LocalSimpleStringBlockParams {
  
  inline def apply(): LocalSimpleStringBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSimpleStringBlockParams]
  }
  
  extension [Self <: LocalSimpleStringBlockParams](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
