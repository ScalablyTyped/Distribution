package typings.angularCompiler.compilerMod

import typings.angularCompiler.apiMod.R3DirectiveDef
import typings.angularCompiler.apiMod.R3DirectiveMetadata
import typings.angularCompiler.bindingParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "compileDirectiveFromMetadata")
@js.native
object compileDirectiveFromMetadata extends js.Object {
  def apply(
    meta: R3DirectiveMetadata,
    constantPool: typings.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3DirectiveDef = js.native
}

