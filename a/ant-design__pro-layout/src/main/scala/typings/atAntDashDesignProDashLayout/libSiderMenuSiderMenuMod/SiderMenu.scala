package typings.atAntDashDesignProDashLayout.libSiderMenuSiderMenuMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiderMenu
  extends Component[SiderMenuProps, SiderMenuState, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MSiderMenu(): Unit = js.native
  def handleOpenChange(openKeys: js.Array[String]): Unit = js.native
  def isMainMenu(key: String): Boolean = js.native
}

