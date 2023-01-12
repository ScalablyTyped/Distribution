package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Highlight
import typings.antDesignReactNative.anon.Refresh
import typings.react.mod.Context
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListViewMod {
  
  @JSImport("@ant-design/react-native/lib/list-view", JSImport.Default)
  @js.native
  open class default[T] () extends ListView[T]
  object default {
    
    @JSImport("@ant-design/react-native/lib/list-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/list-view", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ListView[T] extends PureComponent[ListViewProps[T], ListViewState, Any] {
    
    def refresh(): Unit = js.native
    
    var ulv: Refresh = js.native
  }
  
  trait ListViewProps[T]
    extends StObject
       with UltimateListViewProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, String]] = js.undefined
    
    @JSName("numColumns")
    var numColumns_ListViewProps: js.UndefOr[Double] = js.undefined
    
    def onFetch(
      currentPage: Double,
      startFetch: js.Function2[/* rows */ js.Array[T], /* limit */ Double, Any],
      abortFetch: js.Function0[Unit]
    ): Unit
    
    def renderItem(item: T, index: Double, separators: Highlight): ReactElement | Null
  }
  object ListViewProps {
    
    inline def apply[T](
      onFetch: (Double, js.Function2[/* rows */ js.Array[T], /* limit */ Double, Any], js.Function0[Unit]) => Unit,
      renderItem: (T, Double, Highlight) => ReactElement | Null
    ): ListViewProps[T] = {
      val __obj = js.Dynamic.literal(onFetch = js.Any.fromFunction3(onFetch), renderItem = js.Any.fromFunction3(renderItem))
      __obj.asInstanceOf[ListViewProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListViewProps[?], T] (val x: Self & ListViewProps[T]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKeyExtractor(value: (/* item */ T, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
      
      inline def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
      
      inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
      
      inline def setOnFetch(
        value: (Double, js.Function2[/* rows */ js.Array[T], /* limit */ Double, Any], js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "onFetch", js.Any.fromFunction3(value))
      
      inline def setRenderItem(value: (T, Double, Highlight) => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction3(value))
    }
  }
  
  trait ListViewState extends StObject
  
  trait UltimateListViewProps extends StObject {
    
    var allLoadedText: js.UndefOr[Any] = js.undefined
    
    var arrowImageSource: js.UndefOr[Any] = js.undefined
    
    var arrowImageStyle: js.UndefOr[Any] = js.undefined
    
    var autoPagination: js.UndefOr[Any] = js.undefined
    
    var customRefreshControl: js.UndefOr[Any] = js.undefined
    
    var customRefreshView: js.UndefOr[Any] = js.undefined
    
    var dateFormat: js.UndefOr[Any] = js.undefined
    
    var dateStyle: js.UndefOr[Any] = js.undefined
    
    var dateTitle: js.UndefOr[Any] = js.undefined
    
    var displayDate: js.UndefOr[Any] = js.undefined
    
    var emptyView: js.UndefOr[Any] = js.undefined
    
    var enableEmptySections: js.UndefOr[Any] = js.undefined
    
    var fetchingSpinnerSize: js.UndefOr[Any] = js.undefined
    
    var firstLoader: js.UndefOr[Any] = js.undefined
    
    var header: js.UndefOr[Any] = js.undefined
    
    var horizontal: js.UndefOr[Any] = js.undefined
    
    var initialNumToRender: js.UndefOr[Any] = js.undefined
    
    var numColumns: js.UndefOr[Any] = js.undefined
    
    var pagination: js.UndefOr[Any] = js.undefined
    
    var paginationAllLoadedView: js.UndefOr[Any] = js.undefined
    
    var paginationBtnText: js.UndefOr[Any] = js.undefined
    
    var paginationFetchingView: js.UndefOr[Any] = js.undefined
    
    var paginationWaitingView: js.UndefOr[Any] = js.undefined
    
    var refreshViewHeight: js.UndefOr[Any] = js.undefined
    
    var refreshViewStyle: js.UndefOr[Any] = js.undefined
    
    var refreshable: js.UndefOr[Any] = js.undefined
    
    var refreshableColors: js.UndefOr[Any] = js.undefined
    
    var refreshableMode: js.UndefOr[Any] = js.undefined
    
    var refreshableProgressBackgroundColor: js.UndefOr[Any] = js.undefined
    
    var refreshableSize: js.UndefOr[Any] = js.undefined
    
    var refreshableTintColor: js.UndefOr[Any] = js.undefined
    
    var refreshableTitle: js.UndefOr[Any] = js.undefined
    
    var refreshableTitlePull: js.UndefOr[Any] = js.undefined
    
    var refreshableTitleRefreshing: js.UndefOr[Any] = js.undefined
    
    var refreshableTitleRelease: js.UndefOr[Any] = js.undefined
    
    var scrollEnabled: js.UndefOr[Any] = js.undefined
    
    var separator: js.UndefOr[Any] = js.undefined
    
    var spinnerColor: js.UndefOr[Any] = js.undefined
    
    var waitingSpinnerSize: js.UndefOr[Any] = js.undefined
    
    var waitingSpinnerText: js.UndefOr[Any] = js.undefined
  }
  object UltimateListViewProps {
    
    inline def apply(): UltimateListViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UltimateListViewProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UltimateListViewProps] (val x: Self) extends AnyVal {
      
      inline def setAllLoadedText(value: Any): Self = StObject.set(x, "allLoadedText", value.asInstanceOf[js.Any])
      
      inline def setAllLoadedTextUndefined: Self = StObject.set(x, "allLoadedText", js.undefined)
      
      inline def setArrowImageSource(value: Any): Self = StObject.set(x, "arrowImageSource", value.asInstanceOf[js.Any])
      
      inline def setArrowImageSourceUndefined: Self = StObject.set(x, "arrowImageSource", js.undefined)
      
      inline def setArrowImageStyle(value: Any): Self = StObject.set(x, "arrowImageStyle", value.asInstanceOf[js.Any])
      
      inline def setArrowImageStyleUndefined: Self = StObject.set(x, "arrowImageStyle", js.undefined)
      
      inline def setAutoPagination(value: Any): Self = StObject.set(x, "autoPagination", value.asInstanceOf[js.Any])
      
      inline def setAutoPaginationUndefined: Self = StObject.set(x, "autoPagination", js.undefined)
      
      inline def setCustomRefreshControl(value: Any): Self = StObject.set(x, "customRefreshControl", value.asInstanceOf[js.Any])
      
      inline def setCustomRefreshControlUndefined: Self = StObject.set(x, "customRefreshControl", js.undefined)
      
      inline def setCustomRefreshView(value: Any): Self = StObject.set(x, "customRefreshView", value.asInstanceOf[js.Any])
      
      inline def setCustomRefreshViewUndefined: Self = StObject.set(x, "customRefreshView", js.undefined)
      
      inline def setDateFormat(value: Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDateStyle(value: Any): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      inline def setDateTitle(value: Any): Self = StObject.set(x, "dateTitle", value.asInstanceOf[js.Any])
      
      inline def setDateTitleUndefined: Self = StObject.set(x, "dateTitle", js.undefined)
      
      inline def setDisplayDate(value: Any): Self = StObject.set(x, "displayDate", value.asInstanceOf[js.Any])
      
      inline def setDisplayDateUndefined: Self = StObject.set(x, "displayDate", js.undefined)
      
      inline def setEmptyView(value: Any): Self = StObject.set(x, "emptyView", value.asInstanceOf[js.Any])
      
      inline def setEmptyViewUndefined: Self = StObject.set(x, "emptyView", js.undefined)
      
      inline def setEnableEmptySections(value: Any): Self = StObject.set(x, "enableEmptySections", value.asInstanceOf[js.Any])
      
      inline def setEnableEmptySectionsUndefined: Self = StObject.set(x, "enableEmptySections", js.undefined)
      
      inline def setFetchingSpinnerSize(value: Any): Self = StObject.set(x, "fetchingSpinnerSize", value.asInstanceOf[js.Any])
      
      inline def setFetchingSpinnerSizeUndefined: Self = StObject.set(x, "fetchingSpinnerSize", js.undefined)
      
      inline def setFirstLoader(value: Any): Self = StObject.set(x, "firstLoader", value.asInstanceOf[js.Any])
      
      inline def setFirstLoaderUndefined: Self = StObject.set(x, "firstLoader", js.undefined)
      
      inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHorizontal(value: Any): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInitialNumToRender(value: Any): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
      
      inline def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
      
      inline def setNumColumns(value: Any): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
      
      inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
      
      inline def setPagination(value: Any): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationAllLoadedView(value: Any): Self = StObject.set(x, "paginationAllLoadedView", value.asInstanceOf[js.Any])
      
      inline def setPaginationAllLoadedViewUndefined: Self = StObject.set(x, "paginationAllLoadedView", js.undefined)
      
      inline def setPaginationBtnText(value: Any): Self = StObject.set(x, "paginationBtnText", value.asInstanceOf[js.Any])
      
      inline def setPaginationBtnTextUndefined: Self = StObject.set(x, "paginationBtnText", js.undefined)
      
      inline def setPaginationFetchingView(value: Any): Self = StObject.set(x, "paginationFetchingView", value.asInstanceOf[js.Any])
      
      inline def setPaginationFetchingViewUndefined: Self = StObject.set(x, "paginationFetchingView", js.undefined)
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPaginationWaitingView(value: Any): Self = StObject.set(x, "paginationWaitingView", value.asInstanceOf[js.Any])
      
      inline def setPaginationWaitingViewUndefined: Self = StObject.set(x, "paginationWaitingView", js.undefined)
      
      inline def setRefreshViewHeight(value: Any): Self = StObject.set(x, "refreshViewHeight", value.asInstanceOf[js.Any])
      
      inline def setRefreshViewHeightUndefined: Self = StObject.set(x, "refreshViewHeight", js.undefined)
      
      inline def setRefreshViewStyle(value: Any): Self = StObject.set(x, "refreshViewStyle", value.asInstanceOf[js.Any])
      
      inline def setRefreshViewStyleUndefined: Self = StObject.set(x, "refreshViewStyle", js.undefined)
      
      inline def setRefreshable(value: Any): Self = StObject.set(x, "refreshable", value.asInstanceOf[js.Any])
      
      inline def setRefreshableColors(value: Any): Self = StObject.set(x, "refreshableColors", value.asInstanceOf[js.Any])
      
      inline def setRefreshableColorsUndefined: Self = StObject.set(x, "refreshableColors", js.undefined)
      
      inline def setRefreshableMode(value: Any): Self = StObject.set(x, "refreshableMode", value.asInstanceOf[js.Any])
      
      inline def setRefreshableModeUndefined: Self = StObject.set(x, "refreshableMode", js.undefined)
      
      inline def setRefreshableProgressBackgroundColor(value: Any): Self = StObject.set(x, "refreshableProgressBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setRefreshableProgressBackgroundColorUndefined: Self = StObject.set(x, "refreshableProgressBackgroundColor", js.undefined)
      
      inline def setRefreshableSize(value: Any): Self = StObject.set(x, "refreshableSize", value.asInstanceOf[js.Any])
      
      inline def setRefreshableSizeUndefined: Self = StObject.set(x, "refreshableSize", js.undefined)
      
      inline def setRefreshableTintColor(value: Any): Self = StObject.set(x, "refreshableTintColor", value.asInstanceOf[js.Any])
      
      inline def setRefreshableTintColorUndefined: Self = StObject.set(x, "refreshableTintColor", js.undefined)
      
      inline def setRefreshableTitle(value: Any): Self = StObject.set(x, "refreshableTitle", value.asInstanceOf[js.Any])
      
      inline def setRefreshableTitlePull(value: Any): Self = StObject.set(x, "refreshableTitlePull", value.asInstanceOf[js.Any])
      
      inline def setRefreshableTitlePullUndefined: Self = StObject.set(x, "refreshableTitlePull", js.undefined)
      
      inline def setRefreshableTitleRefreshing(value: Any): Self = StObject.set(x, "refreshableTitleRefreshing", value.asInstanceOf[js.Any])
      
      inline def setRefreshableTitleRefreshingUndefined: Self = StObject.set(x, "refreshableTitleRefreshing", js.undefined)
      
      inline def setRefreshableTitleRelease(value: Any): Self = StObject.set(x, "refreshableTitleRelease", value.asInstanceOf[js.Any])
      
      inline def setRefreshableTitleReleaseUndefined: Self = StObject.set(x, "refreshableTitleRelease", js.undefined)
      
      inline def setRefreshableTitleUndefined: Self = StObject.set(x, "refreshableTitle", js.undefined)
      
      inline def setRefreshableUndefined: Self = StObject.set(x, "refreshable", js.undefined)
      
      inline def setScrollEnabled(value: Any): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setSeparator(value: Any): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSpinnerColor(value: Any): Self = StObject.set(x, "spinnerColor", value.asInstanceOf[js.Any])
      
      inline def setSpinnerColorUndefined: Self = StObject.set(x, "spinnerColor", js.undefined)
      
      inline def setWaitingSpinnerSize(value: Any): Self = StObject.set(x, "waitingSpinnerSize", value.asInstanceOf[js.Any])
      
      inline def setWaitingSpinnerSizeUndefined: Self = StObject.set(x, "waitingSpinnerSize", js.undefined)
      
      inline def setWaitingSpinnerText(value: Any): Self = StObject.set(x, "waitingSpinnerText", value.asInstanceOf[js.Any])
      
      inline def setWaitingSpinnerTextUndefined: Self = StObject.set(x, "waitingSpinnerText", js.undefined)
    }
  }
}
