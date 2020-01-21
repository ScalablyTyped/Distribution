package typings.apolloReactHooks

import typings.apolloClient.mod.ObservableQuery
import typings.apolloReactHooks.queryDataMod.QueryData
import typings.apolloReactHooks.typesMod.QueryOptions
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/ssr/RenderPromises", JSImport.Namespace)
@js.native
object renderPromisesMod extends js.Object {
  @js.native
  class RenderPromises () extends js.Object {
    var lookupQueryInfo: js.Any = js.native
    var queryInfoTrie: js.Any = js.native
    var queryPromises: js.Any = js.native
    def addQueryPromise[TData, TVariables](queryInstance: QueryData[TData, TVariables], finish: js.Function0[ReactNode]): ReactNode = js.native
    def consumeAndAwaitPromises(): js.Promise[js.Array[_]] = js.native
    def getSSRObservable[TData, TVariables](props: QueryOptions[TData, TVariables]): (ObservableQuery[_, _]) | Null = js.native
    def hasPromises(): Boolean = js.native
    def registerSSRObservable[TData, TVariables](observable: ObservableQuery[_, TVariables], props: QueryOptions[TData, TVariables]): Unit = js.native
  }
  
}

