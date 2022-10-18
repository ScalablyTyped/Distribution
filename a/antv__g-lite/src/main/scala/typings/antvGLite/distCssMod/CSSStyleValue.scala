package typings.antvGLite.distCssMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@antv/g-lite/dist/css", "CSSStyleValue")
@js.native
open class CSSStyleValue ()
  extends typings.antvGLite.distCssCssomMod.CSSStyleValue
/* static members */
object CSSStyleValue {
  
  @JSImport("@antv/g-lite/dist/css", "CSSStyleValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAngle(unit: typings.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngle")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLength(`type`: typings.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRelativeUnit(`type`: typings.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUnit")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTime(unit: typings.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTime")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
