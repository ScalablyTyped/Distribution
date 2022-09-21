package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalObjectIdentifierValueBlock extends StObject {
  
  var value: String
}
object ILocalObjectIdentifierValueBlock {
  
  inline def apply(value: String): ILocalObjectIdentifierValueBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalObjectIdentifierValueBlock]
  }
  
  extension [Self <: ILocalObjectIdentifierValueBlock](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
