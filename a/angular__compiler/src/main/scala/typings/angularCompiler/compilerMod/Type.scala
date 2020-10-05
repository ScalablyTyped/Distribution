package typings.angularCompiler.compilerMod

import typings.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "Type")
@js.native
abstract class Type ()
  extends typings.angularCompiler.publicApiMod.Type {
  def this(modifiers: js.Array[TypeModifier]) = this()
}

