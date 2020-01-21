package typings.apolloServerTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ typings.apolloServerTypes.mod.WithRequired[
      typings.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
      typings.apolloServerTypes.apolloServerTypesStrings.document | typings.apolloServerTypes.apolloServerTypesStrings.operationName | typings.apolloServerTypes.apolloServerTypesStrings.operation | typings.apolloServerTypes.apolloServerTypesStrings.queryHash
    ], 
    typings.apolloServerTypes.mod.ValueOrPromise[typings.apolloServerTypes.mod.GraphQLExecutionResult]
  ]
  type ValidationRule = js.Function1[
    /* context */ typings.graphql.mod.ValidationContext, 
    typings.graphql.visitorMod.ASTVisitor
  ]
  type ValueOrPromise[T] = T | js.Promise[T]
  type VariableValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type WithRequired[T, K /* <: java.lang.String */] = T with (typings.std.Required[typings.std.Pick[T, K]])
}
