package typings.antdMobile.menuMod

import typings.antdMobile.menuPropsTypeMod.DataItem
import typings.antdMobile.menuPropsTypeMod.MenuProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu
  extends Component[MenuProps, StateType, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMenu(nextProps: MenuProps): Unit = js.native
  
  def getNewFsv(props: MenuProps): String = js.native
  
  def getSelectValue(dataItem: DataItem): js.Array[_] = js.native
  
  def onClickFirstLevelItem(dataItem: DataItem): Unit = js.native
  
  def onClickSubMenuItem(dataItem: DataItem): Unit = js.native
  
  def onMenuCancel(): Unit = js.native
  
  def onMenuOk(): Unit = js.native
}
