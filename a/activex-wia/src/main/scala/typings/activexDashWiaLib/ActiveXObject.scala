package typings
package activexDashWiaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashWiaLib.WIANs.DeviceManager,
    event: activexDashWiaLib.activexDashWiaLibStrings.OnEvent,
    argNames: js.Tuple3[
      activexDashWiaLib.activexDashWiaLibStrings.EventID, 
      activexDashWiaLib.activexDashWiaLibStrings.DeviceID, 
      activexDashWiaLib.activexDashWiaLibStrings.ItemID
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWiaLib.WIANs.DeviceManager, 
      /* parameter */ Anon_DeviceID, 
      scala.Unit
    ]
  ): scala.Unit
  @JSName("set")
  def set_Item[TItem](
    obj: activexDashWiaLib.WIANs.Vector[TItem],
    propertyName: activexDashWiaLib.activexDashWiaLibStrings.Item,
    parameterTypes: js.Array[scala.Double],
    newValue: TItem
  ): scala.Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: js.Function4[
      activexDashWiaLib.WIANs.DeviceManager, 
      activexDashWiaLib.activexDashWiaLibStrings.OnEvent, 
      js.Tuple3[
        activexDashWiaLib.activexDashWiaLibStrings.EventID, 
        activexDashWiaLib.activexDashWiaLibStrings.DeviceID, 
        activexDashWiaLib.activexDashWiaLibStrings.ItemID
      ], 
      js.ThisFunction1[
        /* this */ activexDashWiaLib.WIANs.DeviceManager, 
        /* parameter */ Anon_DeviceID, 
        scala.Unit
      ], 
      scala.Unit
    ],
    set_Item: js.Function4[
      activexDashWiaLib.WIANs.Vector[js.Any], 
      activexDashWiaLib.activexDashWiaLibStrings.Item, 
      js.Array[scala.Double], 
      js.Any, 
      scala.Unit
    ]
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("set")(set_Item)
    __obj.asInstanceOf[ActiveXObject]
  }
}

