package typings.apolloDashServerDashTypes

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.document
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.operation
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.operationName
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.queryHash
import typings.graphql.graphqlMod.ValidationContext
import typings.graphql.languageVisitorMod.ASTVisitor
import typings.std.Pick
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apolloDashServerDashTypesMod {
  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ WithRequired[GraphQLRequestContext[TContext], document | operationName | operation | queryHash], 
    ValueOrPromise[GraphQLExecutionResult]
  ]
  type ValidationRule = js.Function1[/* context */ ValidationContext, ASTVisitor]
  type ValueOrPromise[T] = T | js.Promise[T]
  type VariableValues = StringDictionary[js.Any]
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}
