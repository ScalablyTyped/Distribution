package typings.antvG2

import typings.antvG2.libDependentsMod.Attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilAttrMod {
  
  @JSImport("@antv/g2/lib/util/attr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMappingValue(attr: Attribute, value: Any, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMappingValue")(attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
}
