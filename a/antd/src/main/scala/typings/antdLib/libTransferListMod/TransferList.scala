package typings
package antdLib.libTransferListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferList
  extends reactLib.reactMod.Component[TransferListProps, js.Any, js.Any] {
  var notFoundNode: stdLib.HTMLDivElement = js.native
  var timer: scala.Double = js.native
  var triggerScrollTimer: scala.Double = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTransferList(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTransferList(): scala.Unit = js.native
  def getCheckStatus(filteredDataSource: js.Array[antdLib.libTransferMod.TransferItem]): antdLib.antdLibStrings.all | antdLib.antdLibStrings.none | antdLib.antdLibStrings.part = js.native
  def handleClear(): scala.Unit = js.native
  def handleFilter(e: reactLib.reactMod.ReactNs.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def handleSelect(selectedItem: antdLib.libTransferMod.TransferItem): scala.Unit = js.native
  def matchFilter(text: java.lang.String, item: antdLib.libTransferMod.TransferItem): scala.Boolean = js.native
  def renderItem(item: antdLib.libTransferMod.TransferItem): antdLib.Anon_RenderedEl = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTransferList(args: js.Any*): js.Any = js.native
}

