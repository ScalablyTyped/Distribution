package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionService extends js.Object {
  /**
    * Provides a read-only equivalent of jQuery's offset function.
    */
  def offset(element: angularLib.JQuery): IPositionCoordinates
  /**
    * Provides a read-only equivalent of jQuery's position function.
    */
  def position(element: angularLib.JQuery): IPositionCoordinates
}

object IPositionService {
  @scala.inline
  def apply(
    offset: js.Function1[angularLib.JQuery, IPositionCoordinates],
    position: js.Function1[angularLib.JQuery, IPositionCoordinates]
  ): IPositionService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IPositionService]
  }
}

