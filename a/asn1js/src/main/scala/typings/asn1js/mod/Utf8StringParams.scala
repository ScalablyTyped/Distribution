package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utf8StringParams extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object Utf8StringParams {
  
  inline def apply(): Utf8StringParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Utf8StringParams]
  }
  
  extension [Self <: Utf8StringParams](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
