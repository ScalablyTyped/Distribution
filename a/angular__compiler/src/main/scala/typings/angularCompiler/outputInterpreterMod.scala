package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputInterpreterMod {
  
  @JSImport("@angular/compiler/src/output/output_interpreter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def interpretStatements(statements: js.Array[Statement], reflector: CompileReflector): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpretStatements")(statements.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
}
