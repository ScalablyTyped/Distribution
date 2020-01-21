package typings.angularCompiler.publicApiMod

import typings.angularCompiler.AnonExpressionType
import typings.angularCompiler.bindingParserMod.BindingParser
import typings.angularCompiler.viewCompilerMod.R3BaseRefMetaData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "compileBaseDefFromMetadata")
@js.native
object compileBaseDefFromMetadata extends js.Object {
  def apply(
    meta: R3BaseRefMetaData,
    constantPool: typings.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): AnonExpressionType = js.native
}

