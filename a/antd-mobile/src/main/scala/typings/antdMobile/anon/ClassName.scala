package typings.antdMobile.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var contentContainerStyle: js.UndefOr[CSSProperties] = js.native
  
  var dataSource: js.Any = js.native
  
  var delayActivityIndicator: js.UndefOr[js.Any] = js.native
  
  var delayTime: js.UndefOr[Double] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var initialListSize: js.UndefOr[Double] = js.native
  
  var listPrefixCls: js.UndefOr[String] = js.native
  
  var listViewPrefixCls: js.UndefOr[String] = js.native
  
  var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.native
  
  var onEndReached: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  var onEndReachedThreshold: js.UndefOr[Double] = js.native
  
  var onLayout: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onQuickSearch: js.UndefOr[js.Function2[/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any], Unit]] = js.native
  
  var onScroll: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var pullToRefresh: js.UndefOr[ReactNode] = js.native
  
  var quickSearchBarStyle: js.UndefOr[CSSProperties] = js.native
  
  var quickSearchBarTop: js.UndefOr[Label] = js.native
  
  def renderRow(rowData: js.Any, sectionID: String, rowID: String): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: String, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: Double): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: Double, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: String): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: String, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: Double): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: Double, highlightRow: Boolean): ReactElement = js.native
  
  var renderScrollComponent: js.UndefOr[js.Function1[/* p */ js.Any, ReactElement]] = js.native
  
  var renderSectionBodyWrapper: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var renderSectionWrapper: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var renderSeparator: js.UndefOr[
    js.Function3[
      /* sectionID */ String | Double, 
      /* rowID */ String | Double, 
      /* adjacentRowHighlighted */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  
  var scrollEventThrottle: js.UndefOr[Double] = js.native
  
  var scrollRenderAheadDistance: js.UndefOr[Double] = js.native
  
  var sectionBodyClassName: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var useBodyScroll: js.UndefOr[Boolean] = js.native
}
