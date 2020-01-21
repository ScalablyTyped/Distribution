package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry[T] extends js.Object {
  var data: T
  var geometry: typings.three.mod.Geometry
  var name: String
  var schema: Schema_[_]
  def init(data: js.Any): Unit
}

object Geometry {
  @scala.inline
  def apply[T](
    data: T,
    geometry: typings.three.mod.Geometry,
    init: js.Any => Unit,
    name: String,
    schema: Schema_[_]
  ): Geometry[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Geometry[T]]
  }
}

