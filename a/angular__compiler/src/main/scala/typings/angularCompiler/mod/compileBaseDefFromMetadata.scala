package typings.angularCompiler.mod

import typings.angularCompiler.AnonExpressionType
import typings.angularCompiler.bindingParserMod.BindingParser
import typings.angularCompiler.viewCompilerMod.R3BaseRefMetaData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "compileBaseDefFromMetadata")
@js.native
object compileBaseDefFromMetadata extends js.Object {
  def apply(
    meta: R3BaseRefMetaData,
    constantPool: typings.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: BindingParser
  ): AnonExpressionType = js.native
}

