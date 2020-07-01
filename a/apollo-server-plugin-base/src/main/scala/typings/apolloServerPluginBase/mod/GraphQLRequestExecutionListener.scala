package typings.apolloServerPluginBase.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerTypes.mod.AnyFunction
import typings.apolloServerTypes.mod.AnyFunctionMap
import typings.apolloServerTypes.mod.BaseContext
import typings.apolloServerTypes.mod.GraphQLFieldResolverParams
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestExecutionListener[TContext /* <: BaseContext */] extends AnyFunctionMap {
  var executionDidEnd: js.UndefOr[GraphQLRequestListenerExecutionDidEnd] = js.undefined
  var willResolveField: js.UndefOr[
    js.Function1[
      /* fieldResolverParams */ GraphQLFieldResolverParams[_, TContext, StringDictionary[_]], 
      GraphQLRequestListenerDidResolveField | Unit
    ]
  ] = js.undefined
}

object GraphQLRequestExecutionListener {
  @scala.inline
  def apply[/* <: typings.apolloServerTypes.mod.BaseContext */ TContext](
    StringDictionary: StringDictionary[js.UndefOr[AnyFunction]] = null,
    executionDidEnd: /* err */ js.UndefOr[Error] => Unit = null,
    willResolveField: /* fieldResolverParams */ GraphQLFieldResolverParams[_, TContext, StringDictionary[_]] => GraphQLRequestListenerDidResolveField | Unit = null
  ): GraphQLRequestExecutionListener[TContext] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (executionDidEnd != null) __obj.updateDynamic("executionDidEnd")(js.Any.fromFunction1(executionDidEnd))
    if (willResolveField != null) __obj.updateDynamic("willResolveField")(js.Any.fromFunction1(willResolveField))
    __obj.asInstanceOf[GraphQLRequestExecutionListener[TContext]]
  }
}

