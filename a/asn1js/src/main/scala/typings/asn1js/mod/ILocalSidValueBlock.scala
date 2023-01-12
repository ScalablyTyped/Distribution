package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalSidValueBlock extends StObject {
  
  var isFirstSid: scala.Boolean
  
  var valueDec: Double
}
object ILocalSidValueBlock {
  
  inline def apply(isFirstSid: scala.Boolean, valueDec: Double): ILocalSidValueBlock = {
    val __obj = js.Dynamic.literal(isFirstSid = isFirstSid.asInstanceOf[js.Any], valueDec = valueDec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalSidValueBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILocalSidValueBlock] (val x: Self) extends AnyVal {
    
    inline def setIsFirstSid(value: scala.Boolean): Self = StObject.set(x, "isFirstSid", value.asInstanceOf[js.Any])
    
    inline def setValueDec(value: Double): Self = StObject.set(x, "valueDec", value.asInstanceOf[js.Any])
  }
}
