package typings.antvG2.constantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELEMENT_STATE extends StObject
@JSImport("@antv/g2/lib/constant", "ELEMENT_STATE")
@js.native
object ELEMENT_STATE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ELEMENT_STATE & String] = js.native
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with ELEMENT_STATE
  /* "active" */ val ACTIVE: typings.antvG2.constantMod.ELEMENT_STATE.ACTIVE & String = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with ELEMENT_STATE
  /* "default" */ val DEFAULT: typings.antvG2.constantMod.ELEMENT_STATE.DEFAULT & String = js.native
  
  @js.native
  sealed trait INACTIVE
    extends StObject
       with ELEMENT_STATE
  /* "inactive" */ val INACTIVE: typings.antvG2.constantMod.ELEMENT_STATE.INACTIVE & String = js.native
  
  @js.native
  sealed trait SELECTED
    extends StObject
       with ELEMENT_STATE
  /* "selected" */ val SELECTED: typings.antvG2.constantMod.ELEMENT_STATE.SELECTED & String = js.native
}
