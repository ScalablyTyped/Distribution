package typings.antd.listBodyMod

import typings.antd.anon.Current
import typings.antd.transferListMod.RenderedItem
import typings.antd.transferMod.TransferItem
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBody
  extends Component[TransferListBodyProps, TransferListBodyState, js.Any] {
  @JSName("state")
  var state_ListBody: Current = js.native
  def getItems(): js.Array[RenderedItem] = js.native
  def onItemRemove(item: TransferItem): Unit = js.native
  def onItemSelect(item: TransferItem): Unit = js.native
  def onPageChange(current: Double): Unit = js.native
}

