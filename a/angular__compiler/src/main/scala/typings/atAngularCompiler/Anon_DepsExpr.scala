package typings.atAngularCompiler

import typings.atAngularCompiler.srcCoreMod.NodeFlags
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DepsExpr extends js.Object {
  var depsExpr: Expression
  var flags: NodeFlags
  var providerExpr: Expression
  var tokenExpr: Expression
}

object Anon_DepsExpr {
  @scala.inline
  def apply(depsExpr: Expression, flags: NodeFlags, providerExpr: Expression, tokenExpr: Expression): Anon_DepsExpr = {
    val __obj = js.Dynamic.literal(depsExpr = depsExpr.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], providerExpr = providerExpr.asInstanceOf[js.Any], tokenExpr = tokenExpr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DepsExpr]
  }
}

