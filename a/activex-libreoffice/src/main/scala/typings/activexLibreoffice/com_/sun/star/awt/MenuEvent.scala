package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(MenuId = MenuId.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuEvent]
  }
}

