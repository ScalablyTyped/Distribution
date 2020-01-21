package typings.angularCompiler.publicApiMod

import typings.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Type")
@js.native
abstract class Type ()
  extends typings.angularCompiler.srcCompilerMod.Type {
  def this(modifiers: js.Array[TypeModifier]) = this()
}

