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

