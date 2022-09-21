package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalBooleanValueBlock extends StObject {
  
  var value: scala.Boolean
}
object ILocalBooleanValueBlock {
  
  inline def apply(value: scala.Boolean): ILocalBooleanValueBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalBooleanValueBlock]
  }
  
  extension [Self <: ILocalBooleanValueBlock](x: Self) {
    
    inline def setValue(value: scala.Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
