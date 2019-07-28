package typings.adone

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmemcpy extends js.Object {
  def atoa(
    target: ArrayBuffer,
    targetOffset: Double,
    source: ArrayBuffer,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def atou(target: Buffer, targetOffset: Double, source: ArrayBuffer, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(target: Buffer, targetOffset: Double, source: Buffer, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(target: Buffer, targetOffset: Double, source: ArrayBuffer, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(target: ArrayBuffer, targetOffset: Double, source: Buffer, sourceStart: Double, sourceEnd: Double): Double = js.native
  def copy(
    target: ArrayBuffer,
    targetOffset: Double,
    source: ArrayBuffer,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def utoa(target: ArrayBuffer, targetOffset: Double, source: Buffer, sourceStart: Double, sourceEnd: Double): Double = js.native
  def utou(target: Buffer, targetOffset: Double, source: Buffer, sourceStart: Double, sourceEnd: Double): Double = js.native
}

