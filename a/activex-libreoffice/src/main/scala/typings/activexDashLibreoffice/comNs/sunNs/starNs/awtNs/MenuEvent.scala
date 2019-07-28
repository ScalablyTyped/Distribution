package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a menu event. */
trait MenuEvent extends EventObject {
  /** contains the item ID. */
  var MenuId: Double
}

object MenuEvent {
  @scala.inline
  def apply(MenuId: Double, Source: XInterface): MenuEvent = {
    val __obj = js.Dynamic.literal(MenuId = MenuId, Source = Source)
  
    __obj.asInstanceOf[MenuEvent]
  }
}

