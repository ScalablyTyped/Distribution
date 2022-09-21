package typings.ahooks

import typings.ahooks.anon.ChangeCurrent
import typings.ahooks.anon.PageSize
import typings.ahooks.srcTypesMod.Options
import typings.ahooks.srcTypesMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePaginationTypesMod {
  
  trait Data extends StObject {
    
    var list: js.Array[Any]
    
    var total: Double
  }
  object Data {
    
    inline def apply(list: js.Array[Any], total: Double): Data = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationOptions[TData /* <: Data */, TParams /* <: Params */]
    extends StObject
       with Options[TData, TParams] {
    
    var defaultCurrent: js.UndefOr[Double] = js.undefined
    
    var defaultPageSize: js.UndefOr[Double] = js.undefined
  }
  object PaginationOptions {
    
    inline def apply[TData /* <: Data */, TParams /* <: Params */](): PaginationOptions[TData, TParams] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationOptions[TData, TParams]]
    }
    
    extension [Self <: PaginationOptions[?, ?], TData /* <: Data */, TParams /* <: Params */](x: Self & (PaginationOptions[TData, TParams])) {
      
      inline def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      inline def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
      
      inline def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
    }
  }
  
  trait PaginationResult[TData /* <: Data */, TParams /* <: Params */]
    extends StObject
       with Result[TData, TParams] {
    
    var pagination: ChangeCurrent
  }
  object PaginationResult {
    
    inline def apply[TData /* <: Data */, TParams /* <: Params */](
      cancel: () => Unit,
      loading: Boolean,
      mutate: /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])] => Unit,
      pagination: ChangeCurrent,
      params: TParams | js.Array[Any],
      refresh: () => Unit,
      refreshAsync: () => js.Promise[TData],
      run: TParams => Unit,
      runAsync: TParams => js.Promise[TData]
    ): PaginationResult[TData, TParams] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), loading = loading.asInstanceOf[js.Any], mutate = js.Any.fromFunction1(mutate), pagination = pagination.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), refreshAsync = js.Any.fromFunction0(refreshAsync), run = js.Any.fromFunction1(run), runAsync = js.Any.fromFunction1(runAsync))
      __obj.asInstanceOf[PaginationResult[TData, TParams]]
    }
    
    extension [Self <: PaginationResult[?, ?], TData /* <: Data */, TParams /* <: Params */](x: Self & (PaginationResult[TData, TParams])) {
      
      inline def setPagination(value: ChangeCurrent): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
  
  type Params = Array[PageSize | Any]
  
  type Service[TData /* <: Data */, TParams /* <: Params */] = js.Function1[/* args */ TParams, js.Promise[TData]]
}
