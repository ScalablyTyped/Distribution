package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponents extends StObject {
  
  var position: Component[Coordinate, System[js.Any]]
  
  var rotation: Component[Coordinate, System[js.Any]]
  
  var scale: Component[Coordinate, System[js.Any]]
}
object DefaultComponents {
  
  @scala.inline
  def apply(
    position: Component[Coordinate, System[js.Any]],
    rotation: Component[Coordinate, System[js.Any]],
    scale: Component[Coordinate, System[js.Any]]
  ): DefaultComponents = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponents]
  }
  
  @scala.inline
  implicit class DefaultComponentsMutableBuilder[Self <: DefaultComponents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Component[Coordinate, System[js.Any]]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Component[Coordinate, System[js.Any]]): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Component[Coordinate, System[js.Any]]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
