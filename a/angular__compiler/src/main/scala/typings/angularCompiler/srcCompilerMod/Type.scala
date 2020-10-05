package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "Type")
@js.native
abstract class Type ()
  extends typings.angularCompiler.outputAstMod.Type {
  def this(modifiers: js.Array[TypeModifier]) = this()
}

