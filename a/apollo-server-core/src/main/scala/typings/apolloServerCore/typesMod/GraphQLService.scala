package typings.apolloServerCore.typesMod

import typings.apolloServerCore.anon.Engine
import typings.apolloServerTypes.mod.GraphQLExecutionResult
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.ValueOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLService extends js.Object {
  def executor[TContext](requestContext: GraphQLRequestContextExecutionDidStart[TContext]): ValueOrPromise[GraphQLExecutionResult] = js.native
  def load(options: Engine): js.Promise[GraphQLServiceConfig] = js.native
  def onSchemaChange(callback: SchemaChangeCallback): Unsubscriber = js.native
}

object GraphQLService {
  @scala.inline
  def apply(
    executor: GraphQLRequestContextExecutionDidStart[js.Any] => ValueOrPromise[GraphQLExecutionResult],
    load: Engine => js.Promise[GraphQLServiceConfig],
    onSchemaChange: SchemaChangeCallback => Unsubscriber
  ): GraphQLService = {
    val __obj = js.Dynamic.literal(executor = js.Any.fromFunction1(executor), load = js.Any.fromFunction1(load), onSchemaChange = js.Any.fromFunction1(onSchemaChange))
    __obj.asInstanceOf[GraphQLService]
  }
  @scala.inline
  implicit class GraphQLServiceOps[Self <: GraphQLService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecutor(value: GraphQLRequestContextExecutionDidStart[js.Any] => ValueOrPromise[GraphQLExecutionResult]): Self = this.set("executor", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: Engine => js.Promise[GraphQLServiceConfig]): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSchemaChange(value: SchemaChangeCallback => Unsubscriber): Self = this.set("onSchemaChange", js.Any.fromFunction1(value))
  }
  
}

