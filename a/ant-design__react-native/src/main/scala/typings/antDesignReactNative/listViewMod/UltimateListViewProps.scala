package typings.antDesignReactNative.listViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UltimateListViewProps extends js.Object {
  
  var allLoadedText: js.UndefOr[js.Any] = js.native
  
  var arrowImageSource: js.UndefOr[js.Any] = js.native
  
  var arrowImageStyle: js.UndefOr[js.Any] = js.native
  
  var autoPagination: js.UndefOr[js.Any] = js.native
  
  var customRefreshControl: js.UndefOr[js.Any] = js.native
  
  var customRefreshView: js.UndefOr[js.Any] = js.native
  
  var dateFormat: js.UndefOr[js.Any] = js.native
  
  var dateStyle: js.UndefOr[js.Any] = js.native
  
  var dateTitle: js.UndefOr[js.Any] = js.native
  
  var displayDate: js.UndefOr[js.Any] = js.native
  
  var emptyView: js.UndefOr[js.Any] = js.native
  
  var enableEmptySections: js.UndefOr[js.Any] = js.native
  
  var fetchingSpinnerSize: js.UndefOr[js.Any] = js.native
  
  var firstLoader: js.UndefOr[js.Any] = js.native
  
  var header: js.UndefOr[js.Any] = js.native
  
  var horizontal: js.UndefOr[js.Any] = js.native
  
  var initialNumToRender: js.UndefOr[js.Any] = js.native
  
  var numColumns: js.UndefOr[js.Any] = js.native
  
  var pagination: js.UndefOr[js.Any] = js.native
  
  var paginationAllLoadedView: js.UndefOr[js.Any] = js.native
  
  var paginationBtnText: js.UndefOr[js.Any] = js.native
  
  var paginationFetchingView: js.UndefOr[js.Any] = js.native
  
  var paginationWaitingView: js.UndefOr[js.Any] = js.native
  
  var refreshViewHeight: js.UndefOr[js.Any] = js.native
  
  var refreshViewStyle: js.UndefOr[js.Any] = js.native
  
  var refreshable: js.UndefOr[js.Any] = js.native
  
  var refreshableColors: js.UndefOr[js.Any] = js.native
  
  var refreshableMode: js.UndefOr[js.Any] = js.native
  
  var refreshableProgressBackgroundColor: js.UndefOr[js.Any] = js.native
  
  var refreshableSize: js.UndefOr[js.Any] = js.native
  
  var refreshableTintColor: js.UndefOr[js.Any] = js.native
  
  var refreshableTitle: js.UndefOr[js.Any] = js.native
  
  var refreshableTitlePull: js.UndefOr[js.Any] = js.native
  
  var refreshableTitleRefreshing: js.UndefOr[js.Any] = js.native
  
  var refreshableTitleRelease: js.UndefOr[js.Any] = js.native
  
  var scrollEnabled: js.UndefOr[js.Any] = js.native
  
  var separator: js.UndefOr[js.Any] = js.native
  
  var spinnerColor: js.UndefOr[js.Any] = js.native
  
  var waitingSpinnerSize: js.UndefOr[js.Any] = js.native
  
  var waitingSpinnerText: js.UndefOr[js.Any] = js.native
}
object UltimateListViewProps {
  
  @scala.inline
  def apply(): UltimateListViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UltimateListViewProps]
  }
  
  @scala.inline
  implicit class UltimateListViewPropsOps[Self <: UltimateListViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllLoadedText(value: js.Any): Self = this.set("allLoadedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllLoadedText: Self = this.set("allLoadedText", js.undefined)
    
    @scala.inline
    def setArrowImageSource(value: js.Any): Self = this.set("arrowImageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowImageSource: Self = this.set("arrowImageSource", js.undefined)
    
    @scala.inline
    def setArrowImageStyle(value: js.Any): Self = this.set("arrowImageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowImageStyle: Self = this.set("arrowImageStyle", js.undefined)
    
    @scala.inline
    def setAutoPagination(value: js.Any): Self = this.set("autoPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPagination: Self = this.set("autoPagination", js.undefined)
    
    @scala.inline
    def setCustomRefreshControl(value: js.Any): Self = this.set("customRefreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRefreshControl: Self = this.set("customRefreshControl", js.undefined)
    
    @scala.inline
    def setCustomRefreshView(value: js.Any): Self = this.set("customRefreshView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRefreshView: Self = this.set("customRefreshView", js.undefined)
    
    @scala.inline
    def setDateFormat(value: js.Any): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDateStyle(value: js.Any): Self = this.set("dateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStyle: Self = this.set("dateStyle", js.undefined)
    
    @scala.inline
    def setDateTitle(value: js.Any): Self = this.set("dateTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTitle: Self = this.set("dateTitle", js.undefined)
    
    @scala.inline
    def setDisplayDate(value: js.Any): Self = this.set("displayDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayDate: Self = this.set("displayDate", js.undefined)
    
    @scala.inline
    def setEmptyView(value: js.Any): Self = this.set("emptyView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyView: Self = this.set("emptyView", js.undefined)
    
    @scala.inline
    def setEnableEmptySections(value: js.Any): Self = this.set("enableEmptySections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEmptySections: Self = this.set("enableEmptySections", js.undefined)
    
    @scala.inline
    def setFetchingSpinnerSize(value: js.Any): Self = this.set("fetchingSpinnerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchingSpinnerSize: Self = this.set("fetchingSpinnerSize", js.undefined)
    
    @scala.inline
    def setFirstLoader(value: js.Any): Self = this.set("firstLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLoader: Self = this.set("firstLoader", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHorizontal(value: js.Any): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setInitialNumToRender(value: js.Any): Self = this.set("initialNumToRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialNumToRender: Self = this.set("initialNumToRender", js.undefined)
    
    @scala.inline
    def setNumColumns(value: js.Any): Self = this.set("numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumColumns: Self = this.set("numColumns", js.undefined)
    
    @scala.inline
    def setPagination(value: js.Any): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setPaginationAllLoadedView(value: js.Any): Self = this.set("paginationAllLoadedView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationAllLoadedView: Self = this.set("paginationAllLoadedView", js.undefined)
    
    @scala.inline
    def setPaginationBtnText(value: js.Any): Self = this.set("paginationBtnText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationBtnText: Self = this.set("paginationBtnText", js.undefined)
    
    @scala.inline
    def setPaginationFetchingView(value: js.Any): Self = this.set("paginationFetchingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationFetchingView: Self = this.set("paginationFetchingView", js.undefined)
    
    @scala.inline
    def setPaginationWaitingView(value: js.Any): Self = this.set("paginationWaitingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationWaitingView: Self = this.set("paginationWaitingView", js.undefined)
    
    @scala.inline
    def setRefreshViewHeight(value: js.Any): Self = this.set("refreshViewHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshViewHeight: Self = this.set("refreshViewHeight", js.undefined)
    
    @scala.inline
    def setRefreshViewStyle(value: js.Any): Self = this.set("refreshViewStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshViewStyle: Self = this.set("refreshViewStyle", js.undefined)
    
    @scala.inline
    def setRefreshable(value: js.Any): Self = this.set("refreshable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshable: Self = this.set("refreshable", js.undefined)
    
    @scala.inline
    def setRefreshableColors(value: js.Any): Self = this.set("refreshableColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableColors: Self = this.set("refreshableColors", js.undefined)
    
    @scala.inline
    def setRefreshableMode(value: js.Any): Self = this.set("refreshableMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableMode: Self = this.set("refreshableMode", js.undefined)
    
    @scala.inline
    def setRefreshableProgressBackgroundColor(value: js.Any): Self = this.set("refreshableProgressBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableProgressBackgroundColor: Self = this.set("refreshableProgressBackgroundColor", js.undefined)
    
    @scala.inline
    def setRefreshableSize(value: js.Any): Self = this.set("refreshableSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableSize: Self = this.set("refreshableSize", js.undefined)
    
    @scala.inline
    def setRefreshableTintColor(value: js.Any): Self = this.set("refreshableTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableTintColor: Self = this.set("refreshableTintColor", js.undefined)
    
    @scala.inline
    def setRefreshableTitle(value: js.Any): Self = this.set("refreshableTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableTitle: Self = this.set("refreshableTitle", js.undefined)
    
    @scala.inline
    def setRefreshableTitlePull(value: js.Any): Self = this.set("refreshableTitlePull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableTitlePull: Self = this.set("refreshableTitlePull", js.undefined)
    
    @scala.inline
    def setRefreshableTitleRefreshing(value: js.Any): Self = this.set("refreshableTitleRefreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableTitleRefreshing: Self = this.set("refreshableTitleRefreshing", js.undefined)
    
    @scala.inline
    def setRefreshableTitleRelease(value: js.Any): Self = this.set("refreshableTitleRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshableTitleRelease: Self = this.set("refreshableTitleRelease", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: js.Any): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setSeparator(value: js.Any): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSpinnerColor(value: js.Any): Self = this.set("spinnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerColor: Self = this.set("spinnerColor", js.undefined)
    
    @scala.inline
    def setWaitingSpinnerSize(value: js.Any): Self = this.set("waitingSpinnerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitingSpinnerSize: Self = this.set("waitingSpinnerSize", js.undefined)
    
    @scala.inline
    def setWaitingSpinnerText(value: js.Any): Self = this.set("waitingSpinnerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitingSpinnerText: Self = this.set("waitingSpinnerText", js.undefined)
  }
}
