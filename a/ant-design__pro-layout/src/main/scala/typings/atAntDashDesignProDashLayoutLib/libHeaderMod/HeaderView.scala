package typings
package atAntDashDesignProDashLayoutLib.libHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderView
  extends reactLib.reactMod.Component[HeaderViewProps, HeaderViewState, js.Any] {
  var oldScrollTop: scala.Double = js.native
  @JSName("state")
  var state_HeaderView: atAntDashDesignProDashLayoutLib.Anon_Visible = js.native
  var ticking: scala.Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MHeaderView(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHeaderView(): scala.Unit = js.native
  def getHeadWidth(): java.lang.String = js.native
  def handScroll(): scala.Unit = js.native
  def renderContent(): js.UndefOr[js.Object | scala.Null] = js.native
}

