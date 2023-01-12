package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPositionService extends StObject {
  
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
  
  inline def apply(offset: JQuery => IPositionCoordinates, position: JQuery => IPositionCoordinates): IPositionService = {
    val __obj = js.Dynamic.literal(offset = js.Any.fromFunction1(offset), position = js.Any.fromFunction1(position))
    __obj.asInstanceOf[IPositionService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPositionService] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: JQuery => IPositionCoordinates): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    
    inline def setPosition(value: JQuery => IPositionCoordinates): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
  }
}
