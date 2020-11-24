package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositionService extends js.Object {
  
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
  implicit class IPositionServiceOps[Self <: IPositionService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOffset(value: JQuery => IPositionCoordinates): Self = this.set("offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPosition(value: JQuery => IPositionCoordinates): Self = this.set("position", js.Any.fromFunction1(value))
  }
}
