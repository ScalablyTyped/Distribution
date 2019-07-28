package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry[T] extends js.Object {
  var data: T
  var geometry: typings.three.threeMod.Geometry
  var name: String
  var schema: Schema[_]
  def init(data: js.Any): Unit
}

object Geometry {
  @scala.inline
  def apply[T](
    data: T,
    geometry: typings.three.threeMod.Geometry,
    init: js.Any => Unit,
    name: String,
    schema: Schema[_]
  ): Geometry[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geometry = geometry, init = js.Any.fromFunction1(init), name = name, schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Geometry[T]]
  }
}

