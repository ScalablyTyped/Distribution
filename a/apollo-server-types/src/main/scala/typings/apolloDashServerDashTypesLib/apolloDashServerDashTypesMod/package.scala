package typings
package apolloDashServerDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apolloDashServerDashTypesMod {
  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ WithRequired[
      GraphQLRequestContext[TContext], 
      apolloDashServerDashTypesLib.apolloDashServerDashTypesLibStrings.document | apolloDashServerDashTypesLib.apolloDashServerDashTypesLibStrings.operationName | apolloDashServerDashTypesLib.apolloDashServerDashTypesLibStrings.operation | apolloDashServerDashTypesLib.apolloDashServerDashTypesLibStrings.queryHash
    ], 
    ValueOrPromise[GraphQLExecutionResult]
  ]
  type ValidationRule = js.Function1[
    /* context */ graphqlLib.graphqlMod.ValidationContext, 
    graphqlLib.languageVisitorMod.ASTVisitor
  ]
  type ValueOrPromise[T] = T | js.Promise[T]
  type VariableValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type WithRequired[T, K /* <: java.lang.String */] = T with (stdLib.Required[stdLib.Pick[T, K]])
}
