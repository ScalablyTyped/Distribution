package typings
package antdDashMobileLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends reactLib.reactMod.Component[antdDashMobileLib.libMenuPropsTypeMod.MenuProps, StateType, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMenu(nextProps: antdDashMobileLib.libMenuPropsTypeMod.MenuProps): scala.Unit = js.native
  def getNewFsv(props: antdDashMobileLib.libMenuPropsTypeMod.MenuProps): java.lang.String = js.native
  def getSelectValue(dataItem: antdDashMobileLib.libMenuPropsTypeMod.DataItem): js.Array[_] = js.native
  def onClickFirstLevelItem(dataItem: antdDashMobileLib.libMenuPropsTypeMod.DataItem): scala.Unit = js.native
  def onClickSubMenuItem(dataItem: antdDashMobileLib.libMenuPropsTypeMod.DataItem): scala.Unit = js.native
  def onMenuCancel(): scala.Unit = js.native
  def onMenuOk(): scala.Unit = js.native
}

