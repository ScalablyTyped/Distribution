package typings.ahooks

import org.scalablytyped.runtime.StringDictionary
import typings.ahooks.ahooksStrings.advance
import typings.ahooks.ahooksStrings.simple
import typings.ahooks.anon.ChangeCurrent
import typings.ahooks.anon.ChangeType
import typings.ahooks.anon.DataSource
import typings.ahooks.anon.OnPageSizeChange
import typings.ahooks.libUseAntdTableTypesMod.Data
import typings.ahooks.libUseAntdTableTypesMod.Params
import typings.ahooks.libUseRequestSrcUtilsCacheMod.CachedData
import typings.react.mod.DependencyList
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseFusionTableTypesMod {
  
  trait Field
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var getFieldInstance: js.UndefOr[js.Function1[/* name */ String, js.Object]] = js.undefined
    
    def getValues(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Record[String, Any]
    
    def reset(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit
    
    def setValues(value: Record[String, Any]): Unit
    
    def validate(fields: Any, callback: js.Function2[/* errors */ Any, /* values */ Any, Unit]): Unit
  }
  object Field {
    
    inline def apply(
      getValues: Any => Record[String, Any],
      reset: Any => Unit,
      setValues: Record[String, Any] => Unit,
      validate: (Any, js.Function2[/* errors */ Any, /* values */ Any, Unit]) => Unit
    ): Field = {
      val __obj = js.Dynamic.literal(getValues = js.Any.fromFunction1(getValues), reset = js.Any.fromFunction1(reset), setValues = js.Any.fromFunction1(setValues), validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setGetFieldInstance(value: /* name */ String => js.Object): Self = StObject.set(x, "getFieldInstance", js.Any.fromFunction1(value))
      
      inline def setGetFieldInstanceUndefined: Self = StObject.set(x, "getFieldInstance", js.undefined)
      
      inline def setGetValues(value: Any => Record[String, Any]): Self = StObject.set(x, "getValues", js.Any.fromFunction1(value))
      
      inline def setReset(value: Any => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setSetValues(value: Record[String, Any] => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
      
      inline def setValidate(value: (Any, js.Function2[/* errors */ Any, /* values */ Any, Unit]) => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined parent std.Omit<ahooks.ahooks/lib/useAntdTable/types.AntdTableOptions<TData, TParams>, 'form'> */
  trait FusionTableOptions[TData /* <: Data */, TParams /* <: Params */] extends StObject {
    
    var cacheKey: js.UndefOr[String] = js.undefined
    
    var cacheTime: js.UndefOr[Double] = js.undefined
    
    var debounceLeading: js.UndefOr[Boolean] = js.undefined
    
    var debounceMaxWait: js.UndefOr[Double] = js.undefined
    
    var debounceTrailing: js.UndefOr[Boolean] = js.undefined
    
    var debounceWait: js.UndefOr[Double] = js.undefined
    
    var defaultCurrent: js.UndefOr[Double] = js.undefined
    
    var defaultPageSize: js.UndefOr[Double] = js.undefined
    
    var defaultParams: js.UndefOr[TParams] = js.undefined
    
    var defaultType: js.UndefOr[simple | advance] = js.undefined
    
    var field: js.UndefOr[Field] = js.undefined
    
    var focusTimespan: js.UndefOr[Double] = js.undefined
    
    var getCache: js.UndefOr[js.Function1[/* params */ TParams, js.UndefOr[CachedData[TData, TParams]]]] = js.undefined
    
    var loadingDelay: js.UndefOr[Double] = js.undefined
    
    var manual: js.UndefOr[Boolean] = js.undefined
    
    var onBefore: js.UndefOr[js.Function1[/* params */ TParams, Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* e */ js.Error, /* params */ TParams, Unit]] = js.undefined
    
    var onFinally: js.UndefOr[
        js.Function3[/* params */ TParams, /* data */ js.UndefOr[TData], /* e */ js.UndefOr[js.Error], Unit]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function2[/* data */ TData, /* params */ TParams, Unit]] = js.undefined
    
    var pollingErrorRetryCount: js.UndefOr[Double] = js.undefined
    
    var pollingInterval: js.UndefOr[Double] = js.undefined
    
    var pollingWhenHidden: js.UndefOr[Boolean] = js.undefined
    
    var ready: js.UndefOr[Boolean] = js.undefined
    
    var refreshDeps: js.UndefOr[DependencyList] = js.undefined
    
    var refreshDepsAction: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
    
    var retryCount: js.UndefOr[Double] = js.undefined
    
    var retryInterval: js.UndefOr[Double] = js.undefined
    
    var setCache: js.UndefOr[js.Function1[/* data */ CachedData[TData, TParams], Unit]] = js.undefined
    
    var staleTime: js.UndefOr[Double] = js.undefined
    
    var throttleLeading: js.UndefOr[Boolean] = js.undefined
    
    var throttleTrailing: js.UndefOr[Boolean] = js.undefined
    
    var throttleWait: js.UndefOr[Double] = js.undefined
  }
  object FusionTableOptions {
    
    inline def apply[TData /* <: Data */, TParams /* <: Params */](): FusionTableOptions[TData, TParams] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FusionTableOptions[TData, TParams]]
    }
    
    extension [Self <: FusionTableOptions[?, ?], TData /* <: Data */, TParams /* <: Params */](x: Self & (FusionTableOptions[TData, TParams])) {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setCacheTime(value: Double): Self = StObject.set(x, "cacheTime", value.asInstanceOf[js.Any])
      
      inline def setCacheTimeUndefined: Self = StObject.set(x, "cacheTime", js.undefined)
      
      inline def setDebounceLeading(value: Boolean): Self = StObject.set(x, "debounceLeading", value.asInstanceOf[js.Any])
      
      inline def setDebounceLeadingUndefined: Self = StObject.set(x, "debounceLeading", js.undefined)
      
      inline def setDebounceMaxWait(value: Double): Self = StObject.set(x, "debounceMaxWait", value.asInstanceOf[js.Any])
      
      inline def setDebounceMaxWaitUndefined: Self = StObject.set(x, "debounceMaxWait", js.undefined)
      
      inline def setDebounceTrailing(value: Boolean): Self = StObject.set(x, "debounceTrailing", value.asInstanceOf[js.Any])
      
      inline def setDebounceTrailingUndefined: Self = StObject.set(x, "debounceTrailing", js.undefined)
      
      inline def setDebounceWait(value: Double): Self = StObject.set(x, "debounceWait", value.asInstanceOf[js.Any])
      
      inline def setDebounceWaitUndefined: Self = StObject.set(x, "debounceWait", js.undefined)
      
      inline def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      inline def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
      
      inline def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
      
      inline def setDefaultParams(value: TParams): Self = StObject.set(x, "defaultParams", value.asInstanceOf[js.Any])
      
      inline def setDefaultParamsUndefined: Self = StObject.set(x, "defaultParams", js.undefined)
      
      inline def setDefaultType(value: simple | advance): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
      
      inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFocusTimespan(value: Double): Self = StObject.set(x, "focusTimespan", value.asInstanceOf[js.Any])
      
      inline def setFocusTimespanUndefined: Self = StObject.set(x, "focusTimespan", js.undefined)
      
      inline def setGetCache(value: /* params */ TParams => js.UndefOr[CachedData[TData, TParams]]): Self = StObject.set(x, "getCache", js.Any.fromFunction1(value))
      
      inline def setGetCacheUndefined: Self = StObject.set(x, "getCache", js.undefined)
      
      inline def setLoadingDelay(value: Double): Self = StObject.set(x, "loadingDelay", value.asInstanceOf[js.Any])
      
      inline def setLoadingDelayUndefined: Self = StObject.set(x, "loadingDelay", js.undefined)
      
      inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      inline def setOnBefore(value: /* params */ TParams => Unit): Self = StObject.set(x, "onBefore", js.Any.fromFunction1(value))
      
      inline def setOnBeforeUndefined: Self = StObject.set(x, "onBefore", js.undefined)
      
      inline def setOnError(value: (/* e */ js.Error, /* params */ TParams) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFinally(value: (/* params */ TParams, /* data */ js.UndefOr[TData], /* e */ js.UndefOr[js.Error]) => Unit): Self = StObject.set(x, "onFinally", js.Any.fromFunction3(value))
      
      inline def setOnFinallyUndefined: Self = StObject.set(x, "onFinally", js.undefined)
      
      inline def setOnSuccess(value: (/* data */ TData, /* params */ TParams) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setPollingErrorRetryCount(value: Double): Self = StObject.set(x, "pollingErrorRetryCount", value.asInstanceOf[js.Any])
      
      inline def setPollingErrorRetryCountUndefined: Self = StObject.set(x, "pollingErrorRetryCount", js.undefined)
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      inline def setPollingWhenHidden(value: Boolean): Self = StObject.set(x, "pollingWhenHidden", value.asInstanceOf[js.Any])
      
      inline def setPollingWhenHiddenUndefined: Self = StObject.set(x, "pollingWhenHidden", js.undefined)
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setRefreshDeps(value: DependencyList): Self = StObject.set(x, "refreshDeps", value.asInstanceOf[js.Any])
      
      inline def setRefreshDepsAction(value: () => Unit): Self = StObject.set(x, "refreshDepsAction", js.Any.fromFunction0(value))
      
      inline def setRefreshDepsActionUndefined: Self = StObject.set(x, "refreshDepsAction", js.undefined)
      
      inline def setRefreshDepsUndefined: Self = StObject.set(x, "refreshDeps", js.undefined)
      
      inline def setRefreshDepsVarargs(value: Any*): Self = StObject.set(x, "refreshDeps", js.Array(value*))
      
      inline def setRefreshOnWindowFocus(value: Boolean): Self = StObject.set(x, "refreshOnWindowFocus", value.asInstanceOf[js.Any])
      
      inline def setRefreshOnWindowFocusUndefined: Self = StObject.set(x, "refreshOnWindowFocus", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
      
      inline def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
      
      inline def setRetryIntervalUndefined: Self = StObject.set(x, "retryInterval", js.undefined)
      
      inline def setSetCache(value: /* data */ CachedData[TData, TParams] => Unit): Self = StObject.set(x, "setCache", js.Any.fromFunction1(value))
      
      inline def setSetCacheUndefined: Self = StObject.set(x, "setCache", js.undefined)
      
      inline def setStaleTime(value: Double): Self = StObject.set(x, "staleTime", value.asInstanceOf[js.Any])
      
      inline def setStaleTimeUndefined: Self = StObject.set(x, "staleTime", js.undefined)
      
      inline def setThrottleLeading(value: Boolean): Self = StObject.set(x, "throttleLeading", value.asInstanceOf[js.Any])
      
      inline def setThrottleLeadingUndefined: Self = StObject.set(x, "throttleLeading", js.undefined)
      
      inline def setThrottleTrailing(value: Boolean): Self = StObject.set(x, "throttleTrailing", value.asInstanceOf[js.Any])
      
      inline def setThrottleTrailingUndefined: Self = StObject.set(x, "throttleTrailing", js.undefined)
      
      inline def setThrottleWait(value: Double): Self = StObject.set(x, "throttleWait", value.asInstanceOf[js.Any])
      
      inline def setThrottleWaitUndefined: Self = StObject.set(x, "throttleWait", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<ahooks.ahooks/lib/useAntdTable/types.AntdTableResult<TData, TParams>, 'tableProps'> */
  trait FusionTableResult[TData /* <: Data */, TParams /* <: Params */] extends StObject {
    
    var cancel: js.Function0[Unit]
    
    var data: js.UndefOr[TData] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var loading: Boolean
    
    var mutate: js.Function1[
        /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])], 
        Unit
      ]
    
    var pagination: ChangeCurrent
    
    var paginationProps: OnPageSizeChange
    
    var params: TParams | js.Array[Any]
    
    var refresh: js.Function0[Unit]
    
    var refreshAsync: js.Function0[js.Promise[TData]]
    
    var run: js.Function1[/* params */ TParams, Unit]
    
    var runAsync: js.Function1[/* params */ TParams, js.Promise[TData]]
    
    var search: ChangeType
    
    var tableProps: DataSource[TData]
  }
  object FusionTableResult {
    
    inline def apply[TData /* <: Data */, TParams /* <: Params */](
      cancel: () => Unit,
      loading: Boolean,
      mutate: /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])] => Unit,
      pagination: ChangeCurrent,
      paginationProps: OnPageSizeChange,
      params: TParams | js.Array[Any],
      refresh: () => Unit,
      refreshAsync: () => js.Promise[TData],
      run: /* params */ TParams => Unit,
      runAsync: /* params */ TParams => js.Promise[TData],
      search: ChangeType,
      tableProps: DataSource[TData]
    ): FusionTableResult[TData, TParams] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), loading = loading.asInstanceOf[js.Any], mutate = js.Any.fromFunction1(mutate), pagination = pagination.asInstanceOf[js.Any], paginationProps = paginationProps.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), refreshAsync = js.Any.fromFunction0(refreshAsync), run = js.Any.fromFunction1(run), runAsync = js.Any.fromFunction1(runAsync), search = search.asInstanceOf[js.Any], tableProps = tableProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[FusionTableResult[TData, TParams]]
    }
    
    extension [Self <: FusionTableResult[?, ?], TData /* <: Data */, TParams /* <: Params */](x: Self & (FusionTableResult[TData, TParams])) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setMutate(
        value: /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])] => Unit
      ): Self = StObject.set(x, "mutate", js.Any.fromFunction1(value))
      
      inline def setPagination(value: ChangeCurrent): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationProps(value: OnPageSizeChange): Self = StObject.set(x, "paginationProps", value.asInstanceOf[js.Any])
      
      inline def setParams(value: TParams | js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      inline def setRefreshAsync(value: () => js.Promise[TData]): Self = StObject.set(x, "refreshAsync", js.Any.fromFunction0(value))
      
      inline def setRun(value: /* params */ TParams => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
      
      inline def setRunAsync(value: /* params */ TParams => js.Promise[TData]): Self = StObject.set(x, "runAsync", js.Any.fromFunction1(value))
      
      inline def setSearch(value: ChangeType): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTableProps(value: DataSource[TData]): Self = StObject.set(x, "tableProps", value.asInstanceOf[js.Any])
    }
  }
}
