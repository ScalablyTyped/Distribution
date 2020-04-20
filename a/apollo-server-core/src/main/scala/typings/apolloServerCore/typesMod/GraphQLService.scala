package typings.apolloServerCore.typesMod

import typings.apolloServerCore.AnonEngine
import typings.apolloServerTypes.mod.GraphQLExecutionResult
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.ValueOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLService extends js.Object {
  def executor[TContext](requestContext: GraphQLRequestContextExecutionDidStart[TContext]): ValueOrPromise[GraphQLExecutionResult]
  def load(options: AnonEngine): js.Promise[GraphQLServiceConfig]
  def onSchemaChange(callback: SchemaChangeCallback): Unsubscriber
}

object GraphQLService {
  @scala.inline
  def apply(
    executor: GraphQLRequestContextExecutionDidStart[js.Any] => ValueOrPromise[GraphQLExecutionResult],
    load: AnonEngine => js.Promise[GraphQLServiceConfig],
    onSchemaChange: SchemaChangeCallback => Unsubscriber
  ): GraphQLService = {
    val __obj = js.Dynamic.literal(executor = js.Any.fromFunction1(executor), load = js.Any.fromFunction1(load), onSchemaChange = js.Any.fromFunction1(onSchemaChange))
    __obj.asInstanceOf[GraphQLService]
  }
}

