package typings.antdDashMobile

import typings.antdDashMobile.libListDashViewIndexedMod.MIndexedList
import typings.antdDashMobile.libListDashViewIndexedMod.MIndexedListProps
import typings.antdDashMobile.libListDashViewPropsTypeMod.ListViewPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/list-view/Indexed", JSImport.Namespace)
@js.native
object libListDashViewIndexedMod extends js.Object {
  @js.native
  trait MIndexedList
    extends Component[MIndexedListProps, js.Any, js.Any] {
    var indexedListRef: js.Any = js.native
  }
  
  @js.native
  trait MIndexedListProps extends ListViewPropsType {
    var delayActivityIndicator: js.UndefOr[ReactNode] = js.native
    var delayTime: js.UndefOr[Double] = js.native
    var onQuickSearch: js.UndefOr[js.Function2[/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any], Unit]] = js.native
    var quickSearchBarStyle: js.UndefOr[CSSProperties] = js.native
    var quickSearchBarTop: js.UndefOr[Anon_Label] = js.native
  }
  
  @js.native
  class default () extends MIndexedList
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_ListPrefixClsListViewPrefixCls = js.native
  }
  
}

