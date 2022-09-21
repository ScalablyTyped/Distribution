package typings.asn1js.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHexBlock extends StObject {
  
  var isHexOnly: scala.Boolean
  
  var valueHex: BufferSource
}
object IHexBlock {
  
  inline def apply(isHexOnly: scala.Boolean, valueHex: BufferSource): IHexBlock = {
    val __obj = js.Dynamic.literal(isHexOnly = isHexOnly.asInstanceOf[js.Any], valueHex = valueHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHexBlock]
  }
  
  extension [Self <: IHexBlock](x: Self) {
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setValueHex(value: BufferSource): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
  }
}
