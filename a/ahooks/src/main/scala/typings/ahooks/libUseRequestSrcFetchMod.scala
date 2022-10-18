package typings.ahooks

import typings.ahooks.ahooksStrings.onBefore
import typings.ahooks.ahooksStrings.onCancel
import typings.ahooks.ahooksStrings.onError
import typings.ahooks.ahooksStrings.onFinally
import typings.ahooks.ahooksStrings.onMutate
import typings.ahooks.ahooksStrings.onRequest
import typings.ahooks.ahooksStrings.onSuccess
import typings.ahooks.libUseRequestSrcTypesMod.FetchState
import typings.ahooks.libUseRequestSrcTypesMod.Options
import typings.ahooks.libUseRequestSrcTypesMod.PluginReturn
import typings.ahooks.libUseRequestSrcTypesMod.Service
import typings.ahooks.libUseRequestSrcTypesMod.Subscribe
import typings.react.mod.MutableRefObject
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseRequestSrcFetchMod {
  
  @JSImport("ahooks/lib/useRequest/src/Fetch", JSImport.Default)
  @js.native
  open class default[TData, TParams /* <: js.Array[Any] */] protected ()
    extends StObject
       with Fetch[TData, TParams] {
    def this(
      serviceRef: MutableRefObject[Service[TData, TParams]],
      options: Options[TData, TParams],
      subscribe: Subscribe
    ) = this()
    def this(
      serviceRef: MutableRefObject[Service[TData, TParams]],
      options: Options[TData, TParams],
      subscribe: Subscribe,
      initState: Partial[FetchState[TData, TParams]]
    ) = this()
  }
  
  @js.native
  trait Fetch[TData, TParams /* <: js.Array[Any] */] extends StObject {
    
    def cancel(): Unit = js.native
    
    var count: Double = js.native
    
    var initState: Partial[FetchState[TData, TParams]] = js.native
    
    def mutate(): Unit = js.native
    def mutate(data: TData): Unit = js.native
    def mutate(data: js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]]): Unit = js.native
    
    var options: Options[TData, TParams] = js.native
    
    var pluginImpls: js.Array[PluginReturn[TData, TParams]] = js.native
    
    def refresh(): Unit = js.native
    
    def refreshAsync(): js.Promise[TData] = js.native
    
    def run(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type TParams is not an array type */ params: TParams
    ): Unit = js.native
    
    def runAsync(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type TParams is not an array type */ params: TParams
    ): js.Promise[TData] = js.native
    
    def runPluginHandler(
      event: /* keyof ahooks.ahooks/lib/useRequest/src/types.PluginReturn<TData, TParams> */ onBefore | onRequest | onSuccess | onError | onFinally | onCancel | onMutate,
      rest: Any*
    ): Any = js.native
    
    var serviceRef: MutableRefObject[Service[TData, TParams]] = js.native
    
    def setState(): Unit = js.native
    def setState(s: Partial[FetchState[TData, TParams]]): Unit = js.native
    
    var state: FetchState[TData, TParams] = js.native
    
    var subscribe: Subscribe = js.native
  }
}
