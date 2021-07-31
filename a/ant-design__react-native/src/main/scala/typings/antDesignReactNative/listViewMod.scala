package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Highlight
import typings.antDesignReactNative.anon.Refresh
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listViewMod {
  
  @JSImport("@ant-design/react-native/lib/list-view", JSImport.Default)
  @js.native
  class default[T] () extends ListView[T]
  object default {
    
    /* static member */
    object contextTypes {
      
      @JSImport("@ant-design/react-native/lib/list-view", "default.contextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/list-view", "default.contextTypes.antLocale")
      @js.native
      def antLocale: Requireable[js.Object] = js.native
      @scala.inline
      def antLocale_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListView[T]
    extends PureComponent[ListViewProps[T], ListViewState, js.Any] {
    
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
    
    def onFetch(currentPage: Double, startFetch: js.Function0[js.Any], abortFetch: js.Function0[Unit]): Unit
    
    def renderItem(item: T, index: Double, separators: Highlight): ReactElement | Null
  }
  object ListViewProps {
    
    @scala.inline
    def apply[T](
      onFetch: (Double, js.Function0[js.Any], js.Function0[Unit]) => Unit,
      renderItem: (T, Double, Highlight) => ReactElement | Null
    ): ListViewProps[T] = {
      val __obj = js.Dynamic.literal(onFetch = js.Any.fromFunction3(onFetch), renderItem = js.Any.fromFunction3(renderItem))
      __obj.asInstanceOf[ListViewProps[T]]
    }
    
    @scala.inline
    implicit class ListViewPropsMutableBuilder[Self <: ListViewProps[?], T] (val x: Self & ListViewProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setKeyExtractor(value: (/* item */ T, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
      
      @scala.inline
      def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
      
      @scala.inline
      def setOnFetch(value: (Double, js.Function0[js.Any], js.Function0[Unit]) => Unit): Self = StObject.set(x, "onFetch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderItem(value: (T, Double, Highlight) => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction3(value))
    }
  }
  
  trait ListViewState extends StObject
  
  trait UltimateListViewProps extends StObject {
    
    var allLoadedText: js.UndefOr[js.Any] = js.undefined
    
    var arrowImageSource: js.UndefOr[js.Any] = js.undefined
    
    var arrowImageStyle: js.UndefOr[js.Any] = js.undefined
    
    var autoPagination: js.UndefOr[js.Any] = js.undefined
    
    var customRefreshControl: js.UndefOr[js.Any] = js.undefined
    
    var customRefreshView: js.UndefOr[js.Any] = js.undefined
    
    var dateFormat: js.UndefOr[js.Any] = js.undefined
    
    var dateStyle: js.UndefOr[js.Any] = js.undefined
    
    var dateTitle: js.UndefOr[js.Any] = js.undefined
    
    var displayDate: js.UndefOr[js.Any] = js.undefined
    
    var emptyView: js.UndefOr[js.Any] = js.undefined
    
    var enableEmptySections: js.UndefOr[js.Any] = js.undefined
    
    var fetchingSpinnerSize: js.UndefOr[js.Any] = js.undefined
    
    var firstLoader: js.UndefOr[js.Any] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var horizontal: js.UndefOr[js.Any] = js.undefined
    
    var initialNumToRender: js.UndefOr[js.Any] = js.undefined
    
    var numColumns: js.UndefOr[js.Any] = js.undefined
    
    var pagination: js.UndefOr[js.Any] = js.undefined
    
    var paginationAllLoadedView: js.UndefOr[js.Any] = js.undefined
    
    var paginationBtnText: js.UndefOr[js.Any] = js.undefined
    
    var paginationFetchingView: js.UndefOr[js.Any] = js.undefined
    
    var paginationWaitingView: js.UndefOr[js.Any] = js.undefined
    
    var refreshViewHeight: js.UndefOr[js.Any] = js.undefined
    
    var refreshViewStyle: js.UndefOr[js.Any] = js.undefined
    
    var refreshable: js.UndefOr[js.Any] = js.undefined
    
    var refreshableColors: js.UndefOr[js.Any] = js.undefined
    
    var refreshableMode: js.UndefOr[js.Any] = js.undefined
    
    var refreshableProgressBackgroundColor: js.UndefOr[js.Any] = js.undefined
    
    var refreshableSize: js.UndefOr[js.Any] = js.undefined
    
    var refreshableTintColor: js.UndefOr[js.Any] = js.undefined
    
    var refreshableTitle: js.UndefOr[js.Any] = js.undefined
    
    var refreshableTitlePull: js.UndefOr[js.Any] = js.undefined
    
    var refreshableTitleRefreshing: js.UndefOr[js.Any] = js.undefined
    
    var refreshableTitleRelease: js.UndefOr[js.Any] = js.undefined
    
    var scrollEnabled: js.UndefOr[js.Any] = js.undefined
    
    var separator: js.UndefOr[js.Any] = js.undefined
    
    var spinnerColor: js.UndefOr[js.Any] = js.undefined
    
    var waitingSpinnerSize: js.UndefOr[js.Any] = js.undefined
    
    var waitingSpinnerText: js.UndefOr[js.Any] = js.undefined
  }
  object UltimateListViewProps {
    
    @scala.inline
    def apply(): UltimateListViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UltimateListViewProps]
    }
    
    @scala.inline
    implicit class UltimateListViewPropsMutableBuilder[Self <: UltimateListViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllLoadedText(value: js.Any): Self = StObject.set(x, "allLoadedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllLoadedTextUndefined: Self = StObject.set(x, "allLoadedText", js.undefined)
      
      @scala.inline
      def setArrowImageSource(value: js.Any): Self = StObject.set(x, "arrowImageSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowImageSourceUndefined: Self = StObject.set(x, "arrowImageSource", js.undefined)
      
      @scala.inline
      def setArrowImageStyle(value: js.Any): Self = StObject.set(x, "arrowImageStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowImageStyleUndefined: Self = StObject.set(x, "arrowImageStyle", js.undefined)
      
      @scala.inline
      def setAutoPagination(value: js.Any): Self = StObject.set(x, "autoPagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPaginationUndefined: Self = StObject.set(x, "autoPagination", js.undefined)
      
      @scala.inline
      def setCustomRefreshControl(value: js.Any): Self = StObject.set(x, "customRefreshControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRefreshControlUndefined: Self = StObject.set(x, "customRefreshControl", js.undefined)
      
      @scala.inline
      def setCustomRefreshView(value: js.Any): Self = StObject.set(x, "customRefreshView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRefreshViewUndefined: Self = StObject.set(x, "customRefreshView", js.undefined)
      
      @scala.inline
      def setDateFormat(value: js.Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setDateStyle(value: js.Any): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      @scala.inline
      def setDateTitle(value: js.Any): Self = StObject.set(x, "dateTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTitleUndefined: Self = StObject.set(x, "dateTitle", js.undefined)
      
      @scala.inline
      def setDisplayDate(value: js.Any): Self = StObject.set(x, "displayDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayDateUndefined: Self = StObject.set(x, "displayDate", js.undefined)
      
      @scala.inline
      def setEmptyView(value: js.Any): Self = StObject.set(x, "emptyView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyViewUndefined: Self = StObject.set(x, "emptyView", js.undefined)
      
      @scala.inline
      def setEnableEmptySections(value: js.Any): Self = StObject.set(x, "enableEmptySections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableEmptySectionsUndefined: Self = StObject.set(x, "enableEmptySections", js.undefined)
      
      @scala.inline
      def setFetchingSpinnerSize(value: js.Any): Self = StObject.set(x, "fetchingSpinnerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchingSpinnerSizeUndefined: Self = StObject.set(x, "fetchingSpinnerSize", js.undefined)
      
      @scala.inline
      def setFirstLoader(value: js.Any): Self = StObject.set(x, "firstLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstLoaderUndefined: Self = StObject.set(x, "firstLoader", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHorizontal(value: js.Any): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInitialNumToRender(value: js.Any): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
      
      @scala.inline
      def setNumColumns(value: js.Any): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
      
      @scala.inline
      def setPagination(value: js.Any): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationAllLoadedView(value: js.Any): Self = StObject.set(x, "paginationAllLoadedView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationAllLoadedViewUndefined: Self = StObject.set(x, "paginationAllLoadedView", js.undefined)
      
      @scala.inline
      def setPaginationBtnText(value: js.Any): Self = StObject.set(x, "paginationBtnText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationBtnTextUndefined: Self = StObject.set(x, "paginationBtnText", js.undefined)
      
      @scala.inline
      def setPaginationFetchingView(value: js.Any): Self = StObject.set(x, "paginationFetchingView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationFetchingViewUndefined: Self = StObject.set(x, "paginationFetchingView", js.undefined)
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPaginationWaitingView(value: js.Any): Self = StObject.set(x, "paginationWaitingView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationWaitingViewUndefined: Self = StObject.set(x, "paginationWaitingView", js.undefined)
      
      @scala.inline
      def setRefreshViewHeight(value: js.Any): Self = StObject.set(x, "refreshViewHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshViewHeightUndefined: Self = StObject.set(x, "refreshViewHeight", js.undefined)
      
      @scala.inline
      def setRefreshViewStyle(value: js.Any): Self = StObject.set(x, "refreshViewStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshViewStyleUndefined: Self = StObject.set(x, "refreshViewStyle", js.undefined)
      
      @scala.inline
      def setRefreshable(value: js.Any): Self = StObject.set(x, "refreshable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableColors(value: js.Any): Self = StObject.set(x, "refreshableColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableColorsUndefined: Self = StObject.set(x, "refreshableColors", js.undefined)
      
      @scala.inline
      def setRefreshableMode(value: js.Any): Self = StObject.set(x, "refreshableMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableModeUndefined: Self = StObject.set(x, "refreshableMode", js.undefined)
      
      @scala.inline
      def setRefreshableProgressBackgroundColor(value: js.Any): Self = StObject.set(x, "refreshableProgressBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableProgressBackgroundColorUndefined: Self = StObject.set(x, "refreshableProgressBackgroundColor", js.undefined)
      
      @scala.inline
      def setRefreshableSize(value: js.Any): Self = StObject.set(x, "refreshableSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableSizeUndefined: Self = StObject.set(x, "refreshableSize", js.undefined)
      
      @scala.inline
      def setRefreshableTintColor(value: js.Any): Self = StObject.set(x, "refreshableTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableTintColorUndefined: Self = StObject.set(x, "refreshableTintColor", js.undefined)
      
      @scala.inline
      def setRefreshableTitle(value: js.Any): Self = StObject.set(x, "refreshableTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableTitlePull(value: js.Any): Self = StObject.set(x, "refreshableTitlePull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableTitlePullUndefined: Self = StObject.set(x, "refreshableTitlePull", js.undefined)
      
      @scala.inline
      def setRefreshableTitleRefreshing(value: js.Any): Self = StObject.set(x, "refreshableTitleRefreshing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableTitleRefreshingUndefined: Self = StObject.set(x, "refreshableTitleRefreshing", js.undefined)
      
      @scala.inline
      def setRefreshableTitleRelease(value: js.Any): Self = StObject.set(x, "refreshableTitleRelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshableTitleReleaseUndefined: Self = StObject.set(x, "refreshableTitleRelease", js.undefined)
      
      @scala.inline
      def setRefreshableTitleUndefined: Self = StObject.set(x, "refreshableTitle", js.undefined)
      
      @scala.inline
      def setRefreshableUndefined: Self = StObject.set(x, "refreshable", js.undefined)
      
      @scala.inline
      def setScrollEnabled(value: js.Any): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      @scala.inline
      def setSeparator(value: js.Any): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSpinnerColor(value: js.Any): Self = StObject.set(x, "spinnerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerColorUndefined: Self = StObject.set(x, "spinnerColor", js.undefined)
      
      @scala.inline
      def setWaitingSpinnerSize(value: js.Any): Self = StObject.set(x, "waitingSpinnerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitingSpinnerSizeUndefined: Self = StObject.set(x, "waitingSpinnerSize", js.undefined)
      
      @scala.inline
      def setWaitingSpinnerText(value: js.Any): Self = StObject.set(x, "waitingSpinnerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitingSpinnerTextUndefined: Self = StObject.set(x, "waitingSpinnerText", js.undefined)
    }
  }
}
