package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalStringValueBlock extends StObject {
  
  var value: String
}
object ILocalStringValueBlock {
  
  inline def apply(value: String): ILocalStringValueBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalStringValueBlock]
  }
  
  extension [Self <: ILocalStringValueBlock](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
