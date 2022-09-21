package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponents extends StObject {
  
  var position: Component[Coordinate, System[Any]]
  
  var rotation: Component[Coordinate, System[Any]]
  
  var scale: Component[Coordinate, System[Any]]
}
object DefaultComponents {
  
  inline def apply(
    position: Component[Coordinate, System[Any]],
    rotation: Component[Coordinate, System[Any]],
    scale: Component[Coordinate, System[Any]]
  ): DefaultComponents = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponents]
  }
  
  extension [Self <: DefaultComponents](x: Self) {
    
    inline def setPosition(value: Component[Coordinate, System[Any]]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Component[Coordinate, System[Any]]): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Component[Coordinate, System[Any]]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
