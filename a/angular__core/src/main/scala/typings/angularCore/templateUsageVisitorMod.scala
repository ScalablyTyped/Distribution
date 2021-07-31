package typings.angularCore

import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.r3AstMod.NullVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateUsageVisitorMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/template_usage_visitor", "TemplateUsageVisitor")
  @js.native
  class TemplateUsageVisitor protected () extends NullVisitor {
    def this(queryPropertyName: String) = this()
    
    var expressionAstVisitor: js.Any = js.native
    
    var hasQueryTemplateReference: js.Any = js.native
    
    /** Checks whether the given query is statically accessed within the specified HTML nodes. */
    def isQueryUsedStatically(htmlNodes: js.Array[Node]): Boolean = js.native
    
    var queryPropertyName: String = js.native
  }
}
