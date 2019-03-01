package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a menu event. */
trait MenuEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** contains the item ID. */
  var MenuId: scala.Double
}

object MenuEvent {
  @scala.inline
  def apply(MenuId: scala.Double, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): MenuEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MenuId")(MenuId)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[MenuEvent]
  }
}

