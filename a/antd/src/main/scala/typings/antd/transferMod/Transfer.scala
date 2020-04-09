package typings.antd.transferMod

import typings.antd.AnonItemsUnit
import typings.antd.AnonLeftDataSource
import typings.antd.AnonNotFoundContent
import typings.antd.antdStrings.sourceSelectedKeys
import typings.antd.antdStrings.targetSelectedKeys
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.Event_
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends Component[TransferProps, js.Any, js.Any] {
  var separatedDataSource: AnonLeftDataSource | Null = js.native
  def getLocale(
    transferLocale: TransferLocale,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], ReactNode]
  ): AnonItemsUnit | AnonNotFoundContent = js.native
  def getSelectedKeysName(direction: TransferDirection): sourceSelectedKeys | targetSelectedKeys = js.native
  def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
  def handleClear(direction: TransferDirection): Unit = js.native
  def handleFilter(direction: TransferDirection, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleLeftClear(): Unit = js.native
  def handleLeftFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleLeftScroll(e: SyntheticEvent[HTMLUListElement, Event_]): Unit = js.native
  def handleListStyle(listStyle: js.Function1[/* style */ ListStyle, CSSProperties], direction: TransferDirection): CSSProperties = js.native
  def handleListStyle(listStyle: CSSProperties, direction: TransferDirection): CSSProperties = js.native
  def handleRightClear(): Unit = js.native
  def handleRightFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleRightScroll(e: SyntheticEvent[HTMLUListElement, Event_]): Unit = js.native
  def handleScroll(direction: TransferDirection, e: SyntheticEvent[HTMLUListElement, Event_]): Unit = js.native
  def handleSelectChange(direction: TransferDirection, holder: js.Array[String]): Unit = js.native
  def moveTo(direction: TransferDirection): Unit = js.native
  def moveToLeft(): Unit = js.native
  def moveToRight(): Unit = js.native
  def onItemSelect(direction: TransferDirection, selectedKey: String, checked: Boolean): Unit = js.native
  def onItemSelectAll(direction: TransferDirection, selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def onLeftItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  def onLeftItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def onRightItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  def onRightItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def renderTransfer(transferLocale: TransferLocale): Element = js.native
  def separateDataSource(): AnonLeftDataSource = js.native
}

