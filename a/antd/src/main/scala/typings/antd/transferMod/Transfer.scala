package typings.antd.transferMod

import typings.antd.anon.ItemUnit
import typings.antd.anon.ItemsUnit
import typings.antd.anon.LeftDataSource
import typings.antd.anon.RightDataSource
import typings.antd.renderEmptyMod.RenderEmptyHandler
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transfer[RecordType /* <: TransferItem */]
  extends Component[TransferProps[RecordType], TransferState, js.Any] {
  
  def getLocale(transferLocale: TransferLocale, renderEmpty: RenderEmptyHandler): ItemUnit | ItemsUnit = js.native
  
  def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
  
  def handleClear(direction: TransferDirection): Unit = js.native
  
  def handleFilter(direction: TransferDirection, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleLeftClear(): Unit = js.native
  
  def handleLeftFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleLeftScroll(e: SyntheticEvent[HTMLUListElement, Event]): Unit = js.native
  
  def handleListStyle(listStyle: js.Function1[/* style */ ListStyle, CSSProperties], direction: TransferDirection): CSSProperties = js.native
  def handleListStyle(listStyle: CSSProperties, direction: TransferDirection): CSSProperties = js.native
  
  def handleRightClear(): Unit = js.native
  
  def handleRightFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleRightScroll(e: SyntheticEvent[HTMLUListElement, Event]): Unit = js.native
  
  def handleScroll(direction: TransferDirection, e: SyntheticEvent[HTMLUListElement, Event]): Unit = js.native
  
  def handleSelectChange(direction: TransferDirection, holder: js.Array[String]): Unit = js.native
  
  def moveTo(direction: TransferDirection): Unit = js.native
  
  def moveToLeft(): Unit = js.native
  
  def moveToRight(): Unit = js.native
  
  def onItemSelect(direction: TransferDirection, selectedKey: String, checked: Boolean): Unit = js.native
  
  def onItemSelectAll(direction: TransferDirection, selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  
  def onLeftItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  
  def onLeftItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  
  def onRightItemRemove(selectedKeys: js.Array[String]): Unit = js.native
  
  def onRightItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  
  def onRightItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  
  def renderTransfer(transferLocale: TransferLocale): Element = js.native
  
  def separateDataSource(): RightDataSource[RecordType] = js.native
  
  var separatedDataSource: LeftDataSource[RecordType] | Null = js.native
  
  def setStateKeys(direction: TransferDirection, keys: js.Array[String]): Unit = js.native
  def setStateKeys(
    direction: TransferDirection,
    keys: js.Function1[/* prevKeys */ js.Array[String], js.Array[String]]
  ): Unit = js.native
}
