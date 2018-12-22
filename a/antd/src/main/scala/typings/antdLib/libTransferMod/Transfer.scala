package typings
package antdLib.libTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends reactLib.reactMod.Component[TransferProps, js.Any, js.Any] {
  var separatedDataSource: antdLib.Anon_RightDataSource | scala.Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTransfer(nextProps: TransferProps): scala.Unit = js.native
  def getLocale(transferLocale: TransferLocale): antdLib.Anon_ItemsUnit = js.native
  def getSelectedKeysName(direction: TransferDirection): antdLib.antdLibStrings.sourceSelectedKeys | antdLib.antdLibStrings.targetSelectedKeys = js.native
  def getTitles(transferLocale: TransferLocale): js.Array[java.lang.String] = js.native
  @JSName("handleClear")
  def handleClear_left(direction: antdLib.antdLibStrings.left): scala.Unit = js.native
  @JSName("handleClear")
  def handleClear_right(direction: antdLib.antdLibStrings.right): scala.Unit = js.native
  @JSName("handleFilter")
  def handleFilter_left(
    direction: antdLib.antdLibStrings.left,
    e: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement]
  ): scala.Unit = js.native
  @JSName("handleFilter")
  def handleFilter_right(
    direction: antdLib.antdLibStrings.right,
    e: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement]
  ): scala.Unit = js.native
  def handleLeftClear(): scala.Unit = js.native
  def handleLeftFilter(e: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def handleLeftScroll(e: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLDivElement, reactLib.Event]): scala.Unit = js.native
  def handleLeftSelect(selectedItem: TransferItem, checked: scala.Boolean): scala.Unit = js.native
  def handleLeftSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: scala.Boolean): scala.Unit = js.native
  def handleRightClear(): scala.Unit = js.native
  def handleRightFilter(e: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def handleRightScroll(e: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLDivElement, reactLib.Event]): scala.Unit = js.native
  def handleRightSelect(selectedItem: TransferItem, checked: scala.Boolean): scala.Unit = js.native
  def handleRightSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: scala.Boolean): scala.Unit = js.native
  @JSName("handleScroll")
  def handleScroll_left(
    direction: antdLib.antdLibStrings.left,
    e: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLDivElement, reactLib.Event]
  ): scala.Unit = js.native
  @JSName("handleScroll")
  def handleScroll_right(
    direction: antdLib.antdLibStrings.right,
    e: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLDivElement, reactLib.Event]
  ): scala.Unit = js.native
  @JSName("handleSelectAll")
  def handleSelectAll_left(
    direction: antdLib.antdLibStrings.left,
    filteredDataSource: js.Array[TransferItem],
    checkAll: scala.Boolean
  ): scala.Unit = js.native
  @JSName("handleSelectAll")
  def handleSelectAll_right(
    direction: antdLib.antdLibStrings.right,
    filteredDataSource: js.Array[TransferItem],
    checkAll: scala.Boolean
  ): scala.Unit = js.native
  def handleSelectChange(direction: TransferDirection, holder: js.Array[java.lang.String]): scala.Unit = js.native
  @JSName("handleSelect")
  def handleSelect_left(direction: antdLib.antdLibStrings.left, selectedItem: TransferItem, checked: scala.Boolean): scala.Unit = js.native
  @JSName("handleSelect")
  def handleSelect_right(direction: antdLib.antdLibStrings.right, selectedItem: TransferItem, checked: scala.Boolean): scala.Unit = js.native
  def moveToLeft(): scala.Unit = js.native
  def moveToRight(): scala.Unit = js.native
  @JSName("moveTo")
  def moveTo_left(direction: antdLib.antdLibStrings.left): scala.Unit = js.native
  @JSName("moveTo")
  def moveTo_right(direction: antdLib.antdLibStrings.right): scala.Unit = js.native
  def renderTransfer(transferLocale: TransferLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def separateDataSource(props: TransferProps): antdLib.Anon_RightDataSource = js.native
}

