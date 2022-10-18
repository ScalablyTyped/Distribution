package typings.antvG2plot.anon

import typings.antvG2plot.libTypesAnimationMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'animation'> */
trait PickOptionsanimation extends StObject {
  
  var animation: js.UndefOr[Animation] = js.undefined
}
object PickOptionsanimation {
  
  inline def apply(): PickOptionsanimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionsanimation]
  }
  
  extension [Self <: PickOptionsanimation](x: Self) {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
