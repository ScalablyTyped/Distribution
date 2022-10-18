package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRulesMoveMod {
  
  @JSImport("@angular-devkit/schematics/src/rules/move", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def move(from: String): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(from.asInstanceOf[js.Any]).asInstanceOf[Rule]
  inline def move(from: String, to: String): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Rule]
}
