package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalRelativeObjectIdentifierValueBlock extends StObject {
  
  var value: String
}
object ILocalRelativeObjectIdentifierValueBlock {
  
  inline def apply(value: String): ILocalRelativeObjectIdentifierValueBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalRelativeObjectIdentifierValueBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILocalRelativeObjectIdentifierValueBlock] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
