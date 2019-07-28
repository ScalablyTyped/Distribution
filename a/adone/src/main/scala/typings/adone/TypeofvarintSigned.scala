package typings.adone

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofvarintSigned extends js.Object {
  def decode(buf: Buffer): Double = js.native
  def decode(buf: Buffer, offset: Double): Double = js.native
  def encode[T](num: Double): js.Array[T] = js.native
  def encode[T](num: Double, out: js.Array[T]): js.Array[T] = js.native
  def encode[T](num: Double, out: js.Array[T], offset: Double): js.Array[T] = js.native
  def encodingLength(value: Double): Double = js.native
}

