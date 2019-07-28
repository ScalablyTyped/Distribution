package typings.activexDashWia

import typings.activexDashWia.WIANs.DeviceManager
import typings.activexDashWia.WIANs.Vector
import typings.activexDashWia.activexDashWiaStrings.DeviceID
import typings.activexDashWia.activexDashWiaStrings.EventID
import typings.activexDashWia.activexDashWiaStrings.Item
import typings.activexDashWia.activexDashWiaStrings.ItemID
import typings.activexDashWia.activexDashWiaStrings.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: DeviceManager,
    event: OnEvent,
    argNames: js.Tuple3[EventID, DeviceID, ItemID],
    handler: js.ThisFunction1[/* this */ DeviceManager, /* parameter */ Anon_DeviceID, Unit]
  ): Unit
  @JSName("set")
  def set_Item[TItem](obj: Vector[TItem], propertyName: Item, parameterTypes: js.Array[Double], newValue: TItem): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[/* this */ DeviceManager, /* parameter */ Anon_DeviceID, Unit]) => Unit,
    set_Item: (Vector[js.Any], Item, js.Array[Double], js.Any) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
    __obj.updateDynamic("set")(js.Any.fromFunction4(set_Item))
    __obj.asInstanceOf[ActiveXObject]
  }
}

