package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalBitStringValueBlock extends StObject {
  
  var isConstructed: scala.Boolean
  
  var unusedBits: Double
}
object ILocalBitStringValueBlock {
  
  inline def apply(isConstructed: scala.Boolean, unusedBits: Double): ILocalBitStringValueBlock = {
    val __obj = js.Dynamic.literal(isConstructed = isConstructed.asInstanceOf[js.Any], unusedBits = unusedBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalBitStringValueBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILocalBitStringValueBlock] (val x: Self) extends AnyVal {
    
    inline def setIsConstructed(value: scala.Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
    
    inline def setUnusedBits(value: Double): Self = StObject.set(x, "unusedBits", value.asInstanceOf[js.Any])
  }
}
