package typings.angularCore

import typings.angularCore.anon.FailureMessage
import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import typings.angularCore.queryDefinitionMod.QueryTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticQueriesTransformMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/transform", "getTransformedQueryCallExpr")
  @js.native
  def getTransformedQueryCallExpr(query: NgQueryDefinition, timing: Null, createTodo: Boolean): TransformedQueryResult = js.native
  @JSImport("@angular/core/schematics/migrations/static-queries/transform", "getTransformedQueryCallExpr")
  @js.native
  def getTransformedQueryCallExpr(query: NgQueryDefinition, timing: QueryTiming, createTodo: Boolean): TransformedQueryResult = js.native
  
  type TransformedQueryResult = Null | FailureMessage
}
