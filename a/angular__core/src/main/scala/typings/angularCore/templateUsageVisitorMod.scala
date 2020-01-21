package typings.angularCore

import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.r3AstMod.NullVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/template_usage_visitor", JSImport.Namespace)
@js.native
object templateUsageVisitorMod extends js.Object {
  @js.native
  class TemplateUsageVisitor protected () extends NullVisitor {
    def this(queryPropertyName: String) = this()
    var expressionAstVisitor: js.Any = js.native
    var hasQueryTemplateReference: js.Any = js.native
    var queryPropertyName: String = js.native
    /** Checks whether the given query is statically accessed within the specified HTML nodes. */
    def isQueryUsedStatically(htmlNodes: js.Array[Node]): Boolean = js.native
  }
  
}

