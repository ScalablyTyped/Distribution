package typings.angularCore

import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directiveInputsMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/angular/directive_inputs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getInputNamesOfClass(node: ClassDeclaration, typeChecker: TypeChecker): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputNamesOfClass")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
