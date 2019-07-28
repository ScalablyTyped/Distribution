package typings.atAntDashDesignProDashLayout.esHeaderMod

import typings.atAntDashDesignProDashLayout.Anon_Visible
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderView
  extends Component[HeaderViewProps, HeaderViewState, js.Any] {
  var oldScrollTop: Double = js.native
  @JSName("state")
  var state_HeaderView: Anon_Visible = js.native
  var ticking: Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MHeaderView(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHeaderView(): Unit = js.native
  def getHeadWidth(): String = js.native
  def handScroll(): Unit = js.native
  def renderContent(): js.UndefOr[js.Object | Null] = js.native
}

