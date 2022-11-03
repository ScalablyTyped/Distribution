package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ecl[BaseToken] extends StObject {
  
  var ccc: Content[BaseToken]
  
  var ecl: Element[BaseToken]
  
  var gap: `200`
  
  var inset: `200`
  
  var pixel: `20`[BaseToken]
  
  var scale: `050`[BaseToken]
  
  var scaleLinear: `1000`[BaseToken]
  
  var size: Medium[BaseToken]
}
object Ecl {
  
  inline def apply[BaseToken](
    ccc: Content[BaseToken],
    ecl: Element[BaseToken],
    gap: `200`,
    inset: `200`,
    pixel: `20`[BaseToken],
    scale: `050`[BaseToken],
    scaleLinear: `1000`[BaseToken],
    size: Medium[BaseToken]
  ): Ecl[BaseToken] = {
    val __obj = js.Dynamic.literal(ccc = ccc.asInstanceOf[js.Any], ecl = ecl.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], inset = inset.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleLinear = scaleLinear.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ecl[BaseToken]]
  }
  
  extension [Self <: Ecl[?], BaseToken](x: Self & Ecl[BaseToken]) {
    
    inline def setCcc(value: Content[BaseToken]): Self = StObject.set(x, "ccc", value.asInstanceOf[js.Any])
    
    inline def setEcl(value: Element[BaseToken]): Self = StObject.set(x, "ecl", value.asInstanceOf[js.Any])
    
    inline def setGap(value: `200`): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setInset(value: `200`): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setPixel(value: `20`[BaseToken]): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    inline def setScale(value: `050`[BaseToken]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleLinear(value: `1000`[BaseToken]): Self = StObject.set(x, "scaleLinear", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Medium[BaseToken]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
