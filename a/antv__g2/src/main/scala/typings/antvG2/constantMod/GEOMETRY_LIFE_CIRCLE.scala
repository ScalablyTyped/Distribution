package typings.antvG2.constantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GEOMETRY_LIFE_CIRCLE extends StObject
@JSImport("@antv/g2/lib/constant", "GEOMETRY_LIFE_CIRCLE")
@js.native
object GEOMETRY_LIFE_CIRCLE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GEOMETRY_LIFE_CIRCLE & String] = js.native
  
  @js.native
  sealed trait AFTER_DRAW_ANIMATE
    extends StObject
       with GEOMETRY_LIFE_CIRCLE
  /* "afteranimate" */ val AFTER_DRAW_ANIMATE: typings.antvG2.constantMod.GEOMETRY_LIFE_CIRCLE.AFTER_DRAW_ANIMATE & String = js.native
  
  @js.native
  sealed trait AFTER_RENDER_LABEL
    extends StObject
       with GEOMETRY_LIFE_CIRCLE
  /* "afterrenderlabel" */ val AFTER_RENDER_LABEL: typings.antvG2.constantMod.GEOMETRY_LIFE_CIRCLE.AFTER_RENDER_LABEL & String = js.native
  
  @js.native
  sealed trait BEFORE_DRAW_ANIMATE
    extends StObject
       with GEOMETRY_LIFE_CIRCLE
  /* "beforeanimate" */ val BEFORE_DRAW_ANIMATE: typings.antvG2.constantMod.GEOMETRY_LIFE_CIRCLE.BEFORE_DRAW_ANIMATE & String = js.native
  
  @js.native
  sealed trait BEFORE_RENDER_LABEL
    extends StObject
       with GEOMETRY_LIFE_CIRCLE
  /* "beforerenderlabel" */ val BEFORE_RENDER_LABEL: typings.antvG2.constantMod.GEOMETRY_LIFE_CIRCLE.BEFORE_RENDER_LABEL & String = js.native
}
