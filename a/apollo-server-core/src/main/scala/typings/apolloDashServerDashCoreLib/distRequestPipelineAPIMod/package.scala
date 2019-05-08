package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distRequestPipelineAPIMod {
  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ apolloDashServerDashEnvLib.distTypescriptDashUtilityDashTypesMod.WithRequired[
      GraphQLRequestContext[TContext], 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.document | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.operationName | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.operation
    ], 
    apolloDashServerDashEnvLib.distTypescriptDashUtilityDashTypesMod.ValueOrPromise[GraphQLExecutionResult]
  ]
  type ValidationRule = js.Function1[
    /* context */ graphqlLib.graphqlMod.ValidationContext, 
    graphqlLib.languageVisitorMod.ASTVisitor
  ]
  type VariableValues = org.scalablytyped.runtime.StringDictionary[js.Any]
}
