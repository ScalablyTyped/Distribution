package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "CompilerFactory")
@js.native
open class CompilerFactory () extends StObject {
  
  def createCompiler(): Compiler = js.native
  def createCompiler(options: js.Array[CompilerOptions]): Compiler = js.native
}
