package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcRender3ViewApiMod.R3DirectiveDef
import typings.atAngularCompiler.srcRender3ViewApiMod.R3DirectiveMetadata
import typings.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "compileDirectiveFromMetadata")
@js.native
object compileDirectiveFromMetadata extends js.Object {
  def apply(
    meta: R3DirectiveMetadata,
    constantPool: typings.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: BindingParser
  ): R3DirectiveDef = js.native
}

