package typings.apolloReactHooks

import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactHooks.typesMod.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnNewData[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var options: QueryOptions[TData, TVariables]
  def onNewData(): Unit
}

object AnonOnNewData {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, onNewData: () => Unit, options: QueryOptions[TData, TVariables]): AnonOnNewData[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], onNewData = js.Any.fromFunction0(onNewData), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnNewData[TData, TVariables]]
  }
}

