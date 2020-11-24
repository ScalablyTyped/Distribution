package typings.antd.listBodyMod

import typings.antd.anon.Current
import typings.antd.transferListMod.RenderedItem
import typings.antd.transferMod.KeyWiseTransferItem
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBody[RecordType /* <: KeyWiseTransferItem */]
  extends Component[TransferListBodyProps[RecordType], TransferListBodyState, js.Any] {
  
  def getItems(): js.Array[RenderedItem[RecordType]] = js.native
  
  def onItemRemove(item: RecordType): Unit = js.native
  
  def onItemSelect(item: RecordType): Unit = js.native
  
  def onPageChange(current: Double): Unit = js.native
  
  @JSName("state")
  var state_ListBody: Current = js.native
}
