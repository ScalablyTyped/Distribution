package typings.antDesignReactNative.listViewMod

import typings.antDesignReactNative.anon.Highlight
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewProps[T] extends UltimateListViewProps {
  var children: js.UndefOr[ReactNode] = js.undefined
  var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, String]] = js.undefined
  @JSName("numColumns")
  var numColumns_ListViewProps: js.UndefOr[Double] = js.undefined
  def onFetch(currentPage: Double, startFetch: js.Function0[_], abortFetch: js.Function0[Unit]): Unit
  def renderItem(item: T, index: Double, separators: Highlight): ReactElement | Null
}

object ListViewProps {
  @scala.inline
  def apply[T](
    onFetch: (Double, js.Function0[_], js.Function0[Unit]) => Unit,
    renderItem: (T, Double, Highlight) => ReactElement | Null,
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
    numColumns: js.UndefOr[Double] = js.undefined,
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
    if (allLoadedText != null) __obj.updateDynamic("allLoadedText")(allLoadedText.asInstanceOf[js.Any])
    if (arrowImageSource != null) __obj.updateDynamic("arrowImageSource")(arrowImageSource.asInstanceOf[js.Any])
    if (arrowImageStyle != null) __obj.updateDynamic("arrowImageStyle")(arrowImageStyle.asInstanceOf[js.Any])
    if (autoPagination != null) __obj.updateDynamic("autoPagination")(autoPagination.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (customRefreshControl != null) __obj.updateDynamic("customRefreshControl")(customRefreshControl.asInstanceOf[js.Any])
    if (customRefreshView != null) __obj.updateDynamic("customRefreshView")(customRefreshView.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateStyle != null) __obj.updateDynamic("dateStyle")(dateStyle.asInstanceOf[js.Any])
    if (dateTitle != null) __obj.updateDynamic("dateTitle")(dateTitle.asInstanceOf[js.Any])
    if (displayDate != null) __obj.updateDynamic("displayDate")(displayDate.asInstanceOf[js.Any])
    if (emptyView != null) __obj.updateDynamic("emptyView")(emptyView.asInstanceOf[js.Any])
    if (enableEmptySections != null) __obj.updateDynamic("enableEmptySections")(enableEmptySections.asInstanceOf[js.Any])
    if (fetchingSpinnerSize != null) __obj.updateDynamic("fetchingSpinnerSize")(fetchingSpinnerSize.asInstanceOf[js.Any])
    if (firstLoader != null) __obj.updateDynamic("firstLoader")(firstLoader.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (initialNumToRender != null) __obj.updateDynamic("initialNumToRender")(initialNumToRender.asInstanceOf[js.Any])
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2(keyExtractor))
    if (!js.isUndefined(numColumns)) __obj.updateDynamic("numColumns")(numColumns.get.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (paginationAllLoadedView != null) __obj.updateDynamic("paginationAllLoadedView")(paginationAllLoadedView.asInstanceOf[js.Any])
    if (paginationBtnText != null) __obj.updateDynamic("paginationBtnText")(paginationBtnText.asInstanceOf[js.Any])
    if (paginationFetchingView != null) __obj.updateDynamic("paginationFetchingView")(paginationFetchingView.asInstanceOf[js.Any])
    if (paginationWaitingView != null) __obj.updateDynamic("paginationWaitingView")(paginationWaitingView.asInstanceOf[js.Any])
    if (refreshViewHeight != null) __obj.updateDynamic("refreshViewHeight")(refreshViewHeight.asInstanceOf[js.Any])
    if (refreshViewStyle != null) __obj.updateDynamic("refreshViewStyle")(refreshViewStyle.asInstanceOf[js.Any])
    if (refreshable != null) __obj.updateDynamic("refreshable")(refreshable.asInstanceOf[js.Any])
    if (refreshableColors != null) __obj.updateDynamic("refreshableColors")(refreshableColors.asInstanceOf[js.Any])
    if (refreshableMode != null) __obj.updateDynamic("refreshableMode")(refreshableMode.asInstanceOf[js.Any])
    if (refreshableProgressBackgroundColor != null) __obj.updateDynamic("refreshableProgressBackgroundColor")(refreshableProgressBackgroundColor.asInstanceOf[js.Any])
    if (refreshableSize != null) __obj.updateDynamic("refreshableSize")(refreshableSize.asInstanceOf[js.Any])
    if (refreshableTintColor != null) __obj.updateDynamic("refreshableTintColor")(refreshableTintColor.asInstanceOf[js.Any])
    if (refreshableTitle != null) __obj.updateDynamic("refreshableTitle")(refreshableTitle.asInstanceOf[js.Any])
    if (refreshableTitlePull != null) __obj.updateDynamic("refreshableTitlePull")(refreshableTitlePull.asInstanceOf[js.Any])
    if (refreshableTitleRefreshing != null) __obj.updateDynamic("refreshableTitleRefreshing")(refreshableTitleRefreshing.asInstanceOf[js.Any])
    if (refreshableTitleRelease != null) __obj.updateDynamic("refreshableTitleRelease")(refreshableTitleRelease.asInstanceOf[js.Any])
    if (scrollEnabled != null) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (spinnerColor != null) __obj.updateDynamic("spinnerColor")(spinnerColor.asInstanceOf[js.Any])
    if (waitingSpinnerSize != null) __obj.updateDynamic("waitingSpinnerSize")(waitingSpinnerSize.asInstanceOf[js.Any])
    if (waitingSpinnerText != null) __obj.updateDynamic("waitingSpinnerText")(waitingSpinnerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewProps[T]]
  }
}

