package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.angularDevkitSchematics.srcTreeInterfaceMod.FilePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRulesRenameMod {
  
  @JSImport("@angular-devkit/schematics/src/rules/rename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rename(`match`: FilePredicate[Boolean], to: FilePredicate[String]): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(`match`.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Rule]
}
