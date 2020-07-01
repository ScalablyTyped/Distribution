package typings.apolloServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Context[T] = T
  type ContextFunction[FunctionParams, ProducedContext] = js.Function1[
    /* context */ FunctionParams, 
    typings.apolloServerTypes.mod.ValueOrPromise[typings.apolloServerCore.typesMod.Context[ProducedContext]]
  ]
  type PluginDefinition = typings.apolloServerPluginBase.mod.ApolloServerPlugin[typings.apolloServerTypes.mod.BaseContext] | (js.Function0[
    typings.apolloServerPluginBase.mod.ApolloServerPlugin[typings.apolloServerTypes.mod.BaseContext]
  ])
  type SchemaChangeCallback = js.Function1[/* schema */ typings.graphql.mod.GraphQLSchema, scala.Unit]
  type Unsubscriber = js.Function0[scala.Unit]
}
