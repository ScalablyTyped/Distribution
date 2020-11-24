package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "CompilerFactory")
@js.native
abstract class CompilerFactory () extends js.Object {
  
  def createCompiler(): Compiler = js.native
  def createCompiler(options: js.Array[CompilerOptions]): Compiler = js.native
}
