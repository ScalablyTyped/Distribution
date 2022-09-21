package typings.antvG2plot.anon

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskStyle extends StObject {
  
  var maskStyle: ShapeAttrs
}
object MaskStyle {
  
  inline def apply(maskStyle: ShapeAttrs): MaskStyle = {
    val __obj = js.Dynamic.literal(maskStyle = maskStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskStyle]
  }
  
  extension [Self <: MaskStyle](x: Self) {
    
    inline def setMaskStyle(value: ShapeAttrs): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
  }
}
