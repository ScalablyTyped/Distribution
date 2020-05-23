package typings.angularCompiler.anon

import typings.angularCompiler.coreMod.NodeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepsExpr extends js.Object {
  var depsExpr: typings.angularCompiler.outputAstMod.Expression
  var flags: NodeFlags
  var providerExpr: typings.angularCompiler.outputAstMod.Expression
  var tokenExpr: typings.angularCompiler.outputAstMod.Expression
}

object DepsExpr {
  @scala.inline
  def apply(
    depsExpr: typings.angularCompiler.outputAstMod.Expression,
    flags: NodeFlags,
    providerExpr: typings.angularCompiler.outputAstMod.Expression,
    tokenExpr: typings.angularCompiler.outputAstMod.Expression
  ): DepsExpr = {
    val __obj = js.Dynamic.literal(depsExpr = depsExpr.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], providerExpr = providerExpr.asInstanceOf[js.Any], tokenExpr = tokenExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepsExpr]
  }
}

