package typings.angularCompiler.viewCompilerMod

import typings.angularCompiler.apiMod.R3ComponentDef
import typings.angularCompiler.apiMod.R3ComponentMetadata
import typings.angularCompiler.bindingParserMod.BindingParser
import typings.angularCompiler.constantPoolMod.ConstantPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/compiler", "compileComponentFromMetadata")
@js.native
object compileComponentFromMetadata extends js.Object {
  def apply(meta: R3ComponentMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3ComponentDef = js.native
}

