package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry[T] extends js.Object {
  var data: T = js.native
  var geometry: typings.three.mod.Geometry = js.native
  var name: String = js.native
  var schema: Schema_[_] = js.native
  def init(data: js.Any): Unit = js.native
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
  @scala.inline
  implicit class GeometryOps[Self <: Geometry[_], T] (val x: Self with Geometry[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: typings.three.mod.Geometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: js.Any => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: Schema_[_]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
  
}

