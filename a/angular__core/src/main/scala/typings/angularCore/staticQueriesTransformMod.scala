package typings.angularCore

import typings.angularCore.anon.FailureMessage
import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import typings.angularCore.queryDefinitionMod.QueryTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticQueriesTransformMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTransformedQueryCallExpr(query: NgQueryDefinition, timing: Null, createTodo: Boolean): TransformedQueryResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformedQueryCallExpr")(query.asInstanceOf[js.Any], timing.asInstanceOf[js.Any], createTodo.asInstanceOf[js.Any])).asInstanceOf[TransformedQueryResult]
  inline def getTransformedQueryCallExpr(query: NgQueryDefinition, timing: QueryTiming, createTodo: Boolean): TransformedQueryResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformedQueryCallExpr")(query.asInstanceOf[js.Any], timing.asInstanceOf[js.Any], createTodo.asInstanceOf[js.Any])).asInstanceOf[TransformedQueryResult]
  
  type TransformedQueryResult = Null | FailureMessage
}
