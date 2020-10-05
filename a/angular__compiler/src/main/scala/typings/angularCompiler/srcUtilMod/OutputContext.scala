package typings.angularCompiler.srcUtilMod

import typings.angularCompiler.constantPoolMod.ConstantPool
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputContext extends js.Object {
  var constantPool: ConstantPool = js.native
  var genFilePath: String = js.native
  var statements: js.Array[Statement] = js.native
  def importExpr(reference: js.Any): Expression = js.native
  def importExpr(reference: js.Any, typeParams: js.UndefOr[scala.Nothing], useSummaries: Boolean): Expression = js.native
  def importExpr(reference: js.Any, typeParams: js.Array[Type]): Expression = js.native
  def importExpr(reference: js.Any, typeParams: js.Array[Type], useSummaries: Boolean): Expression = js.native
  def importExpr(reference: js.Any, typeParams: Null, useSummaries: Boolean): Expression = js.native
}

