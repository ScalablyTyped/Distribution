package typings.ahooks

import org.scalablytyped.runtime.StringDictionary
import typings.ahooks.libUtilsDomTargetMod.BasicTarget
import typings.ahooks.libUtilsDomTargetMod.TargetValue
import typings.react.mod.DependencyList
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseInfiniteScrollTypesMod {
  
  trait Data
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var list: js.Array[Any]
  }
  object Data {
    
    inline def apply(list: js.Array[Any]): Data = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
    }
  }
  
  trait InfiniteScrollOptions[TData /* <: Data */] extends StObject {
    
    var isNoMore: js.UndefOr[js.Function1[/* data */ js.UndefOr[TData], Boolean]] = js.undefined
    
    var manual: js.UndefOr[Boolean] = js.undefined
    
    var onBefore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    var onFinally: js.UndefOr[js.Function2[/* data */ js.UndefOr[TData], /* e */ js.UndefOr[js.Error], Unit]] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.undefined
    
    var reloadDeps: js.UndefOr[DependencyList] = js.undefined
    
    var target: js.UndefOr[BasicTarget[Element | Document]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object InfiniteScrollOptions {
    
    inline def apply[TData /* <: Data */](): InfiniteScrollOptions[TData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfiniteScrollOptions[TData]]
    }
    
    extension [Self <: InfiniteScrollOptions[?], TData /* <: Data */](x: Self & InfiniteScrollOptions[TData]) {
      
      inline def setIsNoMore(value: /* data */ js.UndefOr[TData] => Boolean): Self = StObject.set(x, "isNoMore", js.Any.fromFunction1(value))
      
      inline def setIsNoMoreUndefined: Self = StObject.set(x, "isNoMore", js.undefined)
      
      inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      inline def setOnBefore(value: () => Unit): Self = StObject.set(x, "onBefore", js.Any.fromFunction0(value))
      
      inline def setOnBeforeUndefined: Self = StObject.set(x, "onBefore", js.undefined)
      
      inline def setOnError(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFinally(value: (/* data */ js.UndefOr[TData], /* e */ js.UndefOr[js.Error]) => Unit): Self = StObject.set(x, "onFinally", js.Any.fromFunction2(value))
      
      inline def setOnFinallyUndefined: Self = StObject.set(x, "onFinally", js.undefined)
      
      inline def setOnSuccess(value: /* data */ TData => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setReloadDeps(value: DependencyList): Self = StObject.set(x, "reloadDeps", value.asInstanceOf[js.Any])
      
      inline def setReloadDepsUndefined: Self = StObject.set(x, "reloadDeps", js.undefined)
      
      inline def setReloadDepsVarargs(value: Any*): Self = StObject.set(x, "reloadDeps", js.Array(value*))
      
      inline def setTarget(value: BasicTarget[Element | Document]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction0(value: () => TargetValue[Element | Document]): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  @js.native
  trait InfiniteScrollResult[TData /* <: Data */] extends StObject {
    
    def cancel(): Unit = js.native
    
    var data: TData = js.native
    
    def loadMore(): Unit = js.native
    
    def loadMoreAsync(): js.Promise[TData] = js.native
    
    var loading: Boolean = js.native
    
    var loadingMore: Boolean = js.native
    
    def mutate(): Unit = js.native
    def mutate(data: TData): Unit = js.native
    
    var noMore: Boolean = js.native
    
    def reload(): Unit = js.native
    
    def reloadAsync(): js.Promise[TData] = js.native
  }
  
  type Service[TData /* <: Data */] = js.Function1[/* currentData */ js.UndefOr[Data], js.Promise[TData]]
}
