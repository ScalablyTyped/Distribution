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
      /* parameter */ Anon_EventID, 
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

