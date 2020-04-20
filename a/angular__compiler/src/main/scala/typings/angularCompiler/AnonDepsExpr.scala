package typings.angularCompiler

import typings.angularCompiler.coreMod.NodeFlags
import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDepsExpr extends js.Object {
  var depsExpr: Expression
  var flags: NodeFlags
  var providerExpr: Expression
  var tokenExpr: Expression
}

object AnonDepsExpr {
  @scala.inline
  def apply(depsExpr: Expression, flags: NodeFlags, providerExpr: Expression, tokenExpr: Expression): AnonDepsExpr = {
    val __obj = js.Dynamic.literal(depsExpr = depsExpr.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], providerExpr = providerExpr.asInstanceOf[js.Any], tokenExpr = tokenExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDepsExpr]
  }
}

