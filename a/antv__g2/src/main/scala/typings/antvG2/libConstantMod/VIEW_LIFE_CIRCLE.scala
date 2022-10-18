package typings.antvG2.libConstantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VIEW_LIFE_CIRCLE extends StObject
@JSImport("@antv/g2/lib/constant", "VIEW_LIFE_CIRCLE")
@js.native
object VIEW_LIFE_CIRCLE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VIEW_LIFE_CIRCLE & String] = js.native
  
  @js.native
  sealed trait AFTER_CHANGE_DATA
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "afterchangedata" */ val AFTER_CHANGE_DATA: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_CHANGE_DATA & String = js.native
  
  @js.native
  sealed trait AFTER_CHANGE_SIZE
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "afterchangesize" */ val AFTER_CHANGE_SIZE: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_CHANGE_SIZE & String = js.native
  
  @js.native
  sealed trait AFTER_CLEAR
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "afterclear" */ val AFTER_CLEAR: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_CLEAR & String = js.native
  
  @js.native
  sealed trait AFTER_PAINT
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "afterpaint" */ val AFTER_PAINT: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_PAINT & String = js.native
  
  @js.native
  sealed trait AFTER_RENDER
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "afterrender" */ val AFTER_RENDER: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_RENDER & String = js.native
  
  @js.native
  sealed trait BEFORE_CHANGE_DATA
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "beforechangedata" */ val BEFORE_CHANGE_DATA: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_CHANGE_DATA & String = js.native
  
  @js.native
  sealed trait BEFORE_CHANGE_SIZE
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "beforechangesize" */ val BEFORE_CHANGE_SIZE: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_CHANGE_SIZE & String = js.native
  
  @js.native
  sealed trait BEFORE_CLEAR
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "beforeclear" */ val BEFORE_CLEAR: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_CLEAR & String = js.native
  
  @js.native
  sealed trait BEFORE_DESTROY
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "beforedestroy" */ val BEFORE_DESTROY: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_DESTROY & String = js.native
  
  @js.native
  sealed trait BEFORE_PAINT
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "beforepaint" */ val BEFORE_PAINT: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_PAINT & String = js.native
  
  @js.native
  sealed trait BEFORE_RENDER
    extends StObject
       with VIEW_LIFE_CIRCLE
  /* "beforerender" */ val BEFORE_RENDER: typings.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_RENDER & String = js.native
}
