package typings.antvG2.anon

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskStyle extends StObject {
  
  var maskStyle: LooseObject
}
object MaskStyle {
  
  inline def apply(maskStyle: LooseObject): MaskStyle = {
    val __obj = js.Dynamic.literal(maskStyle = maskStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskStyle]
  }
  
  extension [Self <: MaskStyle](x: Self) {
    
    inline def setMaskStyle(value: LooseObject): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
  }
}
