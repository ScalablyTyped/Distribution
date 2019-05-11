package typings
package antdDashMobileLib.esListDashViewPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewPropsType extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.native
  /** The following is new added and does not exist in react-native */
  var contentContainerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.native
  var dataSource: js.Any = js.native
  var horizontal: js.UndefOr[scala.Boolean] = js.native
  var initialListSize: js.UndefOr[scala.Double] = js.native
  var listPrefixCls: js.UndefOr[java.lang.String] = js.native
  var listViewPrefixCls: js.UndefOr[java.lang.String] = js.native
  var onContentSizeChange: js.UndefOr[js.Function2[/* w */ scala.Double, /* h */ scala.Double, scala.Unit]] = js.native
  var onEndReached: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.native
  var onEndReachedThreshold: js.UndefOr[scala.Double] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.native
  var pageSize: js.UndefOr[scala.Double] = js.native
  var prefixCls: js.UndefOr[java.lang.String] = js.native
  var pullToRefresh: js.UndefOr[reactLib.reactMod.ReactNode] = js.native
  var renderBodyComponent: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement[_]]] = js.native
  var renderFooter: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement[_]]] = js.native
  var renderHeader: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement[_]]] = js.native
  var renderScrollComponent: js.UndefOr[js.Function1[/* p */ js.Any, reactLib.reactMod.ReactElement[_]]] = js.native
  var renderSectionBodyWrapper: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement[_]]] = js.native
  var renderSectionHeader: js.UndefOr[
    js.Function2[
      /* sectionData */ js.Any, 
      /* sectionId */ java.lang.String | scala.Double, 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.native
  var renderSectionWrapper: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement[_]]] = js.native
  var renderSeparator: js.UndefOr[
    js.Function3[
      /* sectionID */ java.lang.String | scala.Double, 
      /* rowID */ java.lang.String | scala.Double, 
      /* adjacentRowHighlighted */ js.UndefOr[scala.Boolean], 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.native
  var scrollEventThrottle: js.UndefOr[scala.Double] = js.native
  var scrollRenderAheadDistance: js.UndefOr[scala.Double] = js.native
  var sectionBodyClassName: js.UndefOr[java.lang.String] = js.native
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.native
  var useBodyScroll: js.UndefOr[scala.Boolean] = js.native
  def renderRow(rowData: js.Any, sectionID: java.lang.String, rowID: java.lang.String): reactLib.reactMod.ReactElement[_] = js.native
  def renderRow(rowData: js.Any, sectionID: java.lang.String, rowID: java.lang.String, highlightRow: scala.Boolean): reactLib.reactMod.ReactElement[_] = js.native
  def renderRow(rowData: js.Any, sectionID: java.lang.String, rowID: scala.Double): reactLib.reactMod.ReactElement[_] = js.native
  def renderRow(rowData: js.Any, sectionID: java.lang.String, rowID: scala.Double, highlightRow: scala.Boolean): reactLib.reactMod.ReactElement[_] = js.native
  def renderRow(rowData: js.Any, sectionID: scala.Double, rowID: java.lang.String): reactLib.reactMod.ReactElement[_] = js.native
  def renderRow(rowData: js.Any, sectionID: scala.Double, rowID: java.lang.String, highlightRow: scala.Boolean): reactLib.reactMod.ReactElement[_] = js.native
  def renderRow(rowData: js.Any, sectionID: scala.Double, rowID: scala.Double): reactLib.reactMod.ReactElement[_] = js.native
  def renderRow(rowData: js.Any, sectionID: scala.Double, rowID: scala.Double, highlightRow: scala.Boolean): reactLib.reactMod.ReactElement[_] = js.native
}

