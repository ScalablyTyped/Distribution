package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalOctetStringValueBlock extends StObject {
  
  var isConstructed: scala.Boolean
}
object ILocalOctetStringValueBlock {
  
  inline def apply(isConstructed: scala.Boolean): ILocalOctetStringValueBlock = {
    val __obj = js.Dynamic.literal(isConstructed = isConstructed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalOctetStringValueBlock]
  }
  
  extension [Self <: ILocalOctetStringValueBlock](x: Self) {
    
    inline def setIsConstructed(value: scala.Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
  }
}
