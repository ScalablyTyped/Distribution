package typings.ahooks.anon

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[TData /* <: typings.ahooks.libUseInfiniteScrollTypesMod.Data */] extends StObject {
  
  def cancel(): Unit
  
  var data: js.UndefOr[TData] = js.undefined
  
  def loadMore(): Unit
  
  def loadMoreAsync(): js.Promise[TData]
  
  var loading: Boolean
  
  var loadingMore: Boolean
  
  var mutate: Dispatch[SetStateAction[js.UndefOr[TData]]]
  
  var noMore: Boolean
  
  def reload(): Unit
  
  def reloadAsync(): js.Promise[TData]
}
object Data {
  
  inline def apply[TData /* <: typings.ahooks.libUseInfiniteScrollTypesMod.Data */](
    cancel: () => Unit,
    loadMore: () => Unit,
    loadMoreAsync: () => js.Promise[TData],
    loading: Boolean,
    loadingMore: Boolean,
    mutate: SetStateAction[js.UndefOr[TData]] => Unit,
    noMore: Boolean,
    reload: () => Unit,
    reloadAsync: () => js.Promise[TData]
  ): Data[TData] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), loadMore = js.Any.fromFunction0(loadMore), loadMoreAsync = js.Any.fromFunction0(loadMoreAsync), loading = loading.asInstanceOf[js.Any], loadingMore = loadingMore.asInstanceOf[js.Any], mutate = js.Any.fromFunction1(mutate), noMore = noMore.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), reloadAsync = js.Any.fromFunction0(reloadAsync))
    __obj.asInstanceOf[Data[TData]]
  }
  
  extension [Self <: Data[?], TData /* <: typings.ahooks.libUseInfiniteScrollTypesMod.Data */](x: Self & Data[TData]) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLoadMore(value: () => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction0(value))
    
    inline def setLoadMoreAsync(value: () => js.Promise[TData]): Self = StObject.set(x, "loadMoreAsync", js.Any.fromFunction0(value))
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingMore(value: Boolean): Self = StObject.set(x, "loadingMore", value.asInstanceOf[js.Any])
    
    inline def setMutate(value: SetStateAction[js.UndefOr[TData]] => Unit): Self = StObject.set(x, "mutate", js.Any.fromFunction1(value))
    
    inline def setNoMore(value: Boolean): Self = StObject.set(x, "noMore", value.asInstanceOf[js.Any])
    
    inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
    
    inline def setReloadAsync(value: () => js.Promise[TData]): Self = StObject.set(x, "reloadAsync", js.Any.fromFunction0(value))
  }
}
