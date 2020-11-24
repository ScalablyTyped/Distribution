package typings.angularCompiler.viewCompilerMod

import typings.angularCompiler.apiMod.R3DirectiveDef
import typings.angularCompiler.apiMod.R3DirectiveMetadata
import typings.angularCompiler.bindingParserMod.BindingParser
import typings.angularCompiler.constantPoolMod.ConstantPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/compiler", "compileDirectiveFromMetadata")
@js.native
object compileDirectiveFromMetadata extends js.Object {
  
  def apply(meta: R3DirectiveMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3DirectiveDef = js.native
}
