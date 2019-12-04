package typings.atAngularCore

import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Node
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.NullVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/template_usage_visitor", JSImport.Namespace)
@js.native
object schematicsMigrationsStaticDashQueriesStrategiesUsageUnderscoreStrategyTemplateUnderscoreUsageUnderscoreVisitorMod extends js.Object {
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

