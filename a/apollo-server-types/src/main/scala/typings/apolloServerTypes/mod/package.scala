package typings.apolloServerTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart[TContext], 
    typings.apolloServerTypes.mod.ValueOrPromise[typings.apolloServerTypes.mod.GraphQLExecutionResult]
  ]
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.apolloServerTypes.apolloServerTypesStrings.Mutable with T
  type ValidationRule = js.Function1[
    /* context */ typings.graphql.mod.ValidationContext, 
    typings.graphql.visitorMod.ASTVisitor
  ]
  type ValueOrPromise[T] = T | js.Promise[T]
  type VariableValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type WithRequired[T, K /* <: java.lang.String */] = T with (typings.std.Required[typings.std.Pick[T, K]])
}
