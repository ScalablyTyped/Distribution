package typings
package antdDashMobileLib.esMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends reactLib.reactMod.Component[antdDashMobileLib.esMenuPropsTypeMod.MenuProps, StateType, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMenu(nextProps: antdDashMobileLib.esMenuPropsTypeMod.MenuProps): scala.Unit = js.native
  def getNewFsv(props: antdDashMobileLib.esMenuPropsTypeMod.MenuProps): java.lang.String = js.native
  def getSelectValue(dataItem: antdDashMobileLib.esMenuPropsTypeMod.DataItem): js.Array[_] = js.native
  def onClickFirstLevelItem(dataItem: antdDashMobileLib.esMenuPropsTypeMod.DataItem): scala.Unit = js.native
  def onClickSubMenuItem(dataItem: antdDashMobileLib.esMenuPropsTypeMod.DataItem): scala.Unit = js.native
  def onMenuCancel(): scala.Unit = js.native
  def onMenuOk(): scala.Unit = js.native
}

