package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalRelativeSidValueBlock extends StObject {
  
  var valueDec: Double
}
object ILocalRelativeSidValueBlock {
  
  inline def apply(valueDec: Double): ILocalRelativeSidValueBlock = {
    val __obj = js.Dynamic.literal(valueDec = valueDec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalRelativeSidValueBlock]
  }
  
  extension [Self <: ILocalRelativeSidValueBlock](x: Self) {
    
    inline def setValueDec(value: Double): Self = StObject.set(x, "valueDec", value.asInstanceOf[js.Any])
  }
}
