package typings.apolloServerPluginBase.mod

import typings.apolloServerTypes.mod.BaseContext
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.GraphQLServiceContext
import typings.apolloServerTypes.mod.ValueOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloServerPlugin[TContext /* <: BaseContext */] extends js.Object {
  var requestDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContext[TContext], 
      GraphQLRequestListener[TContext] | Unit
    ]
  ] = js.native
  var serverWillStart: js.UndefOr[js.Function1[/* service */ GraphQLServiceContext, ValueOrPromise[Unit]]] = js.native
}

object ApolloServerPlugin {
  @scala.inline
  def apply[/* <: typings.apolloServerTypes.mod.BaseContext */ TContext](): ApolloServerPlugin[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloServerPlugin[TContext]]
  }
  @scala.inline
  implicit class ApolloServerPluginOps[Self <: ApolloServerPlugin[_], /* <: typings.apolloServerTypes.mod.BaseContext */ TContext] (val x: Self with ApolloServerPlugin[TContext]) extends AnyVal {
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
    def setRequestDidStart(
      value: /* requestContext */ GraphQLRequestContext[TContext] => GraphQLRequestListener[TContext] | Unit
    ): Self = this.set("requestDidStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestDidStart: Self = this.set("requestDidStart", js.undefined)
    @scala.inline
    def setServerWillStart(value: /* service */ GraphQLServiceContext => ValueOrPromise[Unit]): Self = this.set("serverWillStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteServerWillStart: Self = this.set("serverWillStart", js.undefined)
  }
  
}

