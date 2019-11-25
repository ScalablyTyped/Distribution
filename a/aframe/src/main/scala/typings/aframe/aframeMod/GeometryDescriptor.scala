package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryDescriptor[T /* <: Geometry[_] */] extends js.Object {
  var Geometry: GeometryConstructor[T]
  var schema: Schema[js.Object]
}

object GeometryDescriptor {
  @scala.inline
  def apply[T /* <: Geometry[_] */](Geometry: GeometryConstructor[T], schema: Schema[js.Object]): GeometryDescriptor[T] = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeometryDescriptor[T]]
  }
}

