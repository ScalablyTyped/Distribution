package typings.angularCompiler.compilerMod

import typings.angularCompiler.apiMod.R3ComponentDef
import typings.angularCompiler.apiMod.R3ComponentMetadata
import typings.angularCompiler.bindingParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "compileComponentFromMetadata")
@js.native
object compileComponentFromMetadata extends js.Object {
  def apply(
    meta: R3ComponentMetadata,
    constantPool: typings.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3ComponentDef = js.native
}

