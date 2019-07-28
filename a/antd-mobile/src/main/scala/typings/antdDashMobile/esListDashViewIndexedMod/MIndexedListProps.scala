package typings.antdDashMobile.esListDashViewIndexedMod

import typings.antdDashMobile.Anon_Label
import typings.antdDashMobile.esListDashViewPropsTypeMod.ListViewPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIndexedListProps extends ListViewPropsType {
  var delayActivityIndicator: js.UndefOr[ReactNode] = js.native
  var delayTime: js.UndefOr[Double] = js.native
  var onQuickSearch: js.UndefOr[js.Function2[/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any], Unit]] = js.native
  var quickSearchBarStyle: js.UndefOr[CSSProperties] = js.native
  var quickSearchBarTop: js.UndefOr[Anon_Label] = js.native
}

