package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalIntegerValueBlock extends StObject {
  
  var value: Double
}
object ILocalIntegerValueBlock {
  
  inline def apply(value: Double): ILocalIntegerValueBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalIntegerValueBlock]
  }
  
  extension [Self <: ILocalIntegerValueBlock](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
