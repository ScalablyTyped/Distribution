package typings.apolloServerPluginBase.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerTypes.mod.AnyFunctionMap
import typings.apolloServerTypes.mod.BaseContext
import typings.apolloServerTypes.mod.GraphQLFieldResolverParams
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequestExecutionListener[TContext /* <: BaseContext */] extends AnyFunctionMap {
  var executionDidEnd: js.UndefOr[GraphQLRequestListenerExecutionDidEnd] = js.native
  var willResolveField: js.UndefOr[
    js.Function1[
      /* fieldResolverParams */ GraphQLFieldResolverParams[_, TContext, StringDictionary[_]], 
      GraphQLRequestListenerDidResolveField | Unit
    ]
  ] = js.native
}

object GraphQLRequestExecutionListener {
  @scala.inline
  def apply[/* <: typings.apolloServerTypes.mod.BaseContext */ TContext](): GraphQLRequestExecutionListener[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLRequestExecutionListener[TContext]]
  }
  @scala.inline
  implicit class GraphQLRequestExecutionListenerOps[Self <: GraphQLRequestExecutionListener[_], /* <: typings.apolloServerTypes.mod.BaseContext */ TContext] (val x: Self with GraphQLRequestExecutionListener[TContext]) extends AnyVal {
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
    def setExecutionDidEnd(value: /* err */ js.UndefOr[Error] => Unit): Self = this.set("executionDidEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExecutionDidEnd: Self = this.set("executionDidEnd", js.undefined)
    @scala.inline
    def setWillResolveField(
      value: /* fieldResolverParams */ GraphQLFieldResolverParams[_, TContext, StringDictionary[_]] => GraphQLRequestListenerDidResolveField | Unit
    ): Self = this.set("willResolveField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWillResolveField: Self = this.set("willResolveField", js.undefined)
  }
  
}

