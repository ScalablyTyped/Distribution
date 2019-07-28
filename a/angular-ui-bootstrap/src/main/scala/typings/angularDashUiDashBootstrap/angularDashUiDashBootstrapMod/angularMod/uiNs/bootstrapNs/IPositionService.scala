package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionService extends js.Object {
  /**
    * Provides a read-only equivalent of jQuery's offset function.
    */
  def offset(element: JQuery): typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IPositionCoordinates
  /**
    * Provides a read-only equivalent of jQuery's position function.
    */
  def position(element: JQuery): typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IPositionCoordinates
}

object IPositionService {
  @scala.inline
  def apply(
    offset: JQuery => typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IPositionCoordinates,
    position: JQuery => typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IPositionCoordinates
  ): IPositionService = {
    val __obj = js.Dynamic.literal(offset = js.Any.fromFunction1(offset), position = js.Any.fromFunction1(position))
  
    __obj.asInstanceOf[IPositionService]
  }
}

