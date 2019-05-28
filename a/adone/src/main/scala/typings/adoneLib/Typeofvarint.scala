package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofvarint extends js.Object {
  def decode(buf: nodeLib.Buffer): scala.Double = js.native
  def decode(buf: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
  def encode[T](num: scala.Double): js.Array[T] = js.native
  def encode[T](num: scala.Double, out: js.Array[T]): js.Array[T] = js.native
  def encode[T](num: scala.Double, out: js.Array[T], offset: scala.Double): js.Array[T] = js.native
  def encodingLength(value: scala.Double): scala.Double = js.native
}

