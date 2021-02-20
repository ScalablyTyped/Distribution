package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositionService extends StObject {
  
  /**
    * Provides a read-only equivalent of jQuery's offset function.
    */
  def offset(element: JQuery): IPositionCoordinates = js.native
  
  /**
    * Provides a read-only equivalent of jQuery's position function.
    */
  def position(element: JQuery): IPositionCoordinates = js.native
}
object IPositionService {
  
  @scala.inline
  def apply(offset: JQuery => IPositionCoordinates, position: JQuery => IPositionCoordinates): IPositionService = {
    val __obj = js.Dynamic.literal(offset = js.Any.fromFunction1(offset), position = js.Any.fromFunction1(position))
    __obj.asInstanceOf[IPositionService]
  }
  
  @scala.inline
  implicit class IPositionServiceMutableBuilder[Self <: IPositionService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: JQuery => IPositionCoordinates): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPosition(value: JQuery => IPositionCoordinates): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
  }
}
