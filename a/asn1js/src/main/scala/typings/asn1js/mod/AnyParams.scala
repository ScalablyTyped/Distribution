package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyParams extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var optional: js.UndefOr[scala.Boolean] = js.undefined
}
object AnyParams {
  
  inline def apply(): AnyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnyParams]
  }
  
  extension [Self <: AnyParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
