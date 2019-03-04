package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry[T] extends js.Object {
  var data: T
  var geometry: threeLib.threeMod.Geometry
  var name: java.lang.String
  var schema: Schema[_]
  def init(data: js.Any): scala.Unit
}

object Geometry {
  @scala.inline
  def apply[T](
    data: T,
    geometry: threeLib.threeMod.Geometry,
    init: js.Function1[js.Any, scala.Unit],
    name: java.lang.String,
    schema: Schema[_]
  ): Geometry[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geometry = geometry, init = init, name = name, schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Geometry[T]]
  }
}

