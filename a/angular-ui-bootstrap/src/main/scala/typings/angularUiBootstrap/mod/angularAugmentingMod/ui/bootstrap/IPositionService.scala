package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionService extends js.Object {
  /**
    * Provides a read-only equivalent of jQuery's offset function.
    */
  def offset(element: JQuery): IPositionCoordinates
  /**
    * Provides a read-only equivalent of jQuery's position function.
    */
  def position(element: JQuery): IPositionCoordinates
}

object IPositionService {
  @scala.inline
  def apply(offset: JQuery => IPositionCoordinates, position: JQuery => IPositionCoordinates): IPositionService = {
    val __obj = js.Dynamic.literal(offset = js.Any.fromFunction1(offset), position = js.Any.fromFunction1(position))
  
    __obj.asInstanceOf[IPositionService]
  }
}

