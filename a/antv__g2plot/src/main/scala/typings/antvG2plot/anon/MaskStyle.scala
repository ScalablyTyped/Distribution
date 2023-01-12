package typings.antvG2plot.anon

import typings.antvGBase.libTypesMod.ShapeAttrs
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaskStyle] (val x: Self) extends AnyVal {
    
    inline def setMaskStyle(value: ShapeAttrs): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
  }
}
