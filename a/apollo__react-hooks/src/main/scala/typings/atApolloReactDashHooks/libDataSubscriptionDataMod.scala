package typings.atApolloReactDashHooks

import typings.atApolloReactDashCommon.libTypesTypesMod.SubscriptionResult
import typings.atApolloReactDashHooks.libDataOperationDataMod.OperationData
import typings.atApolloReactDashHooks.libTypesMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/data/SubscriptionData", JSImport.Namespace)
@js.native
object libDataSubscriptionDataMod extends js.Object {
  @js.native
  class SubscriptionData[TData, TVariables] protected () extends OperationData[SubscriptionOptions[TData, TVariables]] {
    def this(hasOptionsContextSetResult: Anon_ContextOptions[TData, TVariables]) = this()
    var completeSubscription: js.Any = js.native
    var currentObservable: js.Any = js.native
    var endSubscription: js.Any = js.native
    var getLoadingResult: js.Any = js.native
    var initialize: js.Any = js.native
    var setResult: js.Any = js.native
    var startSubscription: js.Any = js.native
    var updateCurrentData: js.Any = js.native
    var updateError: js.Any = js.native
    var updateResult: js.Any = js.native
    def afterExecute(): Unit = js.native
    def execute(result: SubscriptionResult[TData]): Anon_Data[TVariables, TData] = js.native
  }
  
}

