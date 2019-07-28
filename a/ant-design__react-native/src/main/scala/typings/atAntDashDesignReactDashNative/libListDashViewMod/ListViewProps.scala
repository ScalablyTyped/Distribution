package typings.atAntDashDesignReactDashNative.libListDashViewMod

import typings.atAntDashDesignReactDashNative.Anon_Highlight
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewProps[T] extends UltimateListViewProps {
  var children: js.UndefOr[ReactNode] = js.undefined
  var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, String]] = js.undefined
  @JSName("numColumns")
  var numColumns_ListViewProps: js.UndefOr[Double] = js.undefined
  def onFetch(currentPage: Double, startFetch: js.Function0[_], abortFetch: js.Function0[Unit]): Unit
  def renderItem(item: T, index: Double, separators: Anon_Highlight): ReactElement | Null
}

object ListViewProps {
  @scala.inline
  def apply[T](
    onFetch: (Double, js.Function0[_], js.Function0[Unit]) => Unit,
    renderItem: (T, Double, Anon_Highlight) => ReactElement | Null,
    allLoadedText: js.Any = null,
    arrowImageSource: js.Any = null,
    arrowImageStyle: js.Any = null,
    autoPagination: js.Any = null,
    children: ReactNode = null,
    customRefreshControl: js.Any = null,
    customRefreshView: js.Any = null,
    dateFormat: js.Any = null,
    dateStyle: js.Any = null,
    dateTitle: js.Any = null,
    displayDate: js.Any = null,
    emptyView: js.Any = null,
    enableEmptySections: js.Any = null,
    fetchingSpinnerSize: js.Any = null,
    firstLoader: js.Any = null,
    header: js.Any = null,
    horizontal: js.Any = null,
    initialNumToRender: js.Any = null,
    keyExtractor: (/* item */ T, /* index */ Double) => String = null,
    numColumns: Int | Double = null,
    pagination: js.Any = null,
    paginationAllLoadedView: js.Any = null,
    paginationBtnText: js.Any = null,
    paginationFetchingView: js.Any = null,
    paginationWaitingView: js.Any = null,
    refreshViewHeight: js.Any = null,
    refreshViewStyle: js.Any = null,
    refreshable: js.Any = null,
    refreshableColors: js.Any = null,
    refreshableMode: js.Any = null,
    refreshableProgressBackgroundColor: js.Any = null,
    refreshableSize: js.Any = null,
    refreshableTintColor: js.Any = null,
    refreshableTitle: js.Any = null,
    refreshableTitlePull: js.Any = null,
    refreshableTitleRefreshing: js.Any = null,
    refreshableTitleRelease: js.Any = null,
    scrollEnabled: js.Any = null,
    separator: js.Any = null,
    spinnerColor: js.Any = null,
    waitingSpinnerSize: js.Any = null,
    waitingSpinnerText: js.Any = null
  ): ListViewProps[T] = {
    val __obj = js.Dynamic.literal(onFetch = js.Any.fromFunction3(onFetch), renderItem = js.Any.fromFunction3(renderItem))
    if (allLoadedText != null) __obj.updateDynamic("allLoadedText")(allLoadedText)
    if (arrowImageSource != null) __obj.updateDynamic("arrowImageSource")(arrowImageSource)
    if (arrowImageStyle != null) __obj.updateDynamic("arrowImageStyle")(arrowImageStyle)
    if (autoPagination != null) __obj.updateDynamic("autoPagination")(autoPagination)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (customRefreshControl != null) __obj.updateDynamic("customRefreshControl")(customRefreshControl)
    if (customRefreshView != null) __obj.updateDynamic("customRefreshView")(customRefreshView)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (dateStyle != null) __obj.updateDynamic("dateStyle")(dateStyle)
    if (dateTitle != null) __obj.updateDynamic("dateTitle")(dateTitle)
    if (displayDate != null) __obj.updateDynamic("displayDate")(displayDate)
    if (emptyView != null) __obj.updateDynamic("emptyView")(emptyView)
    if (enableEmptySections != null) __obj.updateDynamic("enableEmptySections")(enableEmptySections)
    if (fetchingSpinnerSize != null) __obj.updateDynamic("fetchingSpinnerSize")(fetchingSpinnerSize)
    if (firstLoader != null) __obj.updateDynamic("firstLoader")(firstLoader)
    if (header != null) __obj.updateDynamic("header")(header)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (initialNumToRender != null) __obj.updateDynamic("initialNumToRender")(initialNumToRender)
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2(keyExtractor))
    if (numColumns != null) __obj.updateDynamic("numColumns")(numColumns.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination)
    if (paginationAllLoadedView != null) __obj.updateDynamic("paginationAllLoadedView")(paginationAllLoadedView)
    if (paginationBtnText != null) __obj.updateDynamic("paginationBtnText")(paginationBtnText)
    if (paginationFetchingView != null) __obj.updateDynamic("paginationFetchingView")(paginationFetchingView)
    if (paginationWaitingView != null) __obj.updateDynamic("paginationWaitingView")(paginationWaitingView)
    if (refreshViewHeight != null) __obj.updateDynamic("refreshViewHeight")(refreshViewHeight)
    if (refreshViewStyle != null) __obj.updateDynamic("refreshViewStyle")(refreshViewStyle)
    if (refreshable != null) __obj.updateDynamic("refreshable")(refreshable)
    if (refreshableColors != null) __obj.updateDynamic("refreshableColors")(refreshableColors)
    if (refreshableMode != null) __obj.updateDynamic("refreshableMode")(refreshableMode)
    if (refreshableProgressBackgroundColor != null) __obj.updateDynamic("refreshableProgressBackgroundColor")(refreshableProgressBackgroundColor)
    if (refreshableSize != null) __obj.updateDynamic("refreshableSize")(refreshableSize)
    if (refreshableTintColor != null) __obj.updateDynamic("refreshableTintColor")(refreshableTintColor)
    if (refreshableTitle != null) __obj.updateDynamic("refreshableTitle")(refreshableTitle)
    if (refreshableTitlePull != null) __obj.updateDynamic("refreshableTitlePull")(refreshableTitlePull)
    if (refreshableTitleRefreshing != null) __obj.updateDynamic("refreshableTitleRefreshing")(refreshableTitleRefreshing)
    if (refreshableTitleRelease != null) __obj.updateDynamic("refreshableTitleRelease")(refreshableTitleRelease)
    if (scrollEnabled != null) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (spinnerColor != null) __obj.updateDynamic("spinnerColor")(spinnerColor)
    if (waitingSpinnerSize != null) __obj.updateDynamic("waitingSpinnerSize")(waitingSpinnerSize)
    if (waitingSpinnerText != null) __obj.updateDynamic("waitingSpinnerText")(waitingSpinnerText)
    __obj.asInstanceOf[ListViewProps[T]]
  }
}

