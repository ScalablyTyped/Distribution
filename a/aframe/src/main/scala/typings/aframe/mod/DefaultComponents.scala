package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultComponents extends js.Object {
  
  var position: Component[Coordinate, System[_]] = js.native
  
  var rotation: Component[Coordinate, System[_]] = js.native
  
  var scale: Component[Coordinate, System[_]] = js.native
}
object DefaultComponents {
  
  @scala.inline
  def apply(
    position: Component[Coordinate, System[_]],
    rotation: Component[Coordinate, System[_]],
    scale: Component[Coordinate, System[_]]
  ): DefaultComponents = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponents]
  }
  
  @scala.inline
  implicit class DefaultComponentsOps[Self <: DefaultComponents] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: Component[Coordinate, System[_]]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Component[Coordinate, System[_]]): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Component[Coordinate, System[_]]): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
}
