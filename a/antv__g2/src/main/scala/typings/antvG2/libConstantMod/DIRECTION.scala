package typings.antvG2.libConstantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DIRECTION extends StObject
@JSImport("@antv/g2/lib/constant", "DIRECTION")
@js.native
object DIRECTION extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DIRECTION & String] = js.native
  
  @js.native
  sealed trait BOTTOM
    extends StObject
       with DIRECTION
  /* "bottom" */ val BOTTOM: typings.antvG2.libConstantMod.DIRECTION.BOTTOM & String = js.native
  
  @js.native
  sealed trait BOTTOM_LEFT
    extends StObject
       with DIRECTION
  /* "bottom-left" */ val BOTTOM_LEFT: typings.antvG2.libConstantMod.DIRECTION.BOTTOM_LEFT & String = js.native
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends StObject
       with DIRECTION
  /* "bottom-right" */ val BOTTOM_RIGHT: typings.antvG2.libConstantMod.DIRECTION.BOTTOM_RIGHT & String = js.native
  
  @js.native
  sealed trait CIRCLE
    extends StObject
       with DIRECTION
  /* "circle" */ val CIRCLE: typings.antvG2.libConstantMod.DIRECTION.CIRCLE & String = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with DIRECTION
  /* "left" */ val LEFT: typings.antvG2.libConstantMod.DIRECTION.LEFT & String = js.native
  
  @js.native
  sealed trait LEFT_BOTTOM
    extends StObject
       with DIRECTION
  /* "left-bottom" */ val LEFT_BOTTOM: typings.antvG2.libConstantMod.DIRECTION.LEFT_BOTTOM & String = js.native
  
  @js.native
  sealed trait LEFT_TOP
    extends StObject
       with DIRECTION
  /* "left-top" */ val LEFT_TOP: typings.antvG2.libConstantMod.DIRECTION.LEFT_TOP & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with DIRECTION
  /* "none" */ val NONE: typings.antvG2.libConstantMod.DIRECTION.NONE & String = js.native
  
  @js.native
  sealed trait RADIUS
    extends StObject
       with DIRECTION
  /* "radius" */ val RADIUS: typings.antvG2.libConstantMod.DIRECTION.RADIUS & String = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with DIRECTION
  /* "right" */ val RIGHT: typings.antvG2.libConstantMod.DIRECTION.RIGHT & String = js.native
  
  @js.native
  sealed trait RIGHT_BOTTOM
    extends StObject
       with DIRECTION
  /* "right-bottom" */ val RIGHT_BOTTOM: typings.antvG2.libConstantMod.DIRECTION.RIGHT_BOTTOM & String = js.native
  
  @js.native
  sealed trait RIGHT_TOP
    extends StObject
       with DIRECTION
  /* "right-top" */ val RIGHT_TOP: typings.antvG2.libConstantMod.DIRECTION.RIGHT_TOP & String = js.native
  
  @js.native
  sealed trait TOP
    extends StObject
       with DIRECTION
  /* "top" */ val TOP: typings.antvG2.libConstantMod.DIRECTION.TOP & String = js.native
  
  @js.native
  sealed trait TOP_LEFT
    extends StObject
       with DIRECTION
  /* "top-left" */ val TOP_LEFT: typings.antvG2.libConstantMod.DIRECTION.TOP_LEFT & String = js.native
  
  @js.native
  sealed trait TOP_RIGHT
    extends StObject
       with DIRECTION
  /* "top-right" */ val TOP_RIGHT: typings.antvG2.libConstantMod.DIRECTION.TOP_RIGHT & String = js.native
}
