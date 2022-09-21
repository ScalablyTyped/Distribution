package typings.antvGLite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "CSSStyleValue")
@js.native
abstract class CSSStyleValue ()
  extends typings.antvGLite.cssMod.CSSStyleValue
/* static members */
object CSSStyleValue {
  
  @JSImport("@antv/g-lite", "CSSStyleValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAngle(unit: typings.antvGLite.typesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngle")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLength(`type`: typings.antvGLite.typesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRelativeUnit(`type`: typings.antvGLite.typesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUnit")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTime(unit: typings.antvGLite.typesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTime")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
