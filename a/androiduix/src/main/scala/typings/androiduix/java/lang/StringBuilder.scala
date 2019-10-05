package typings.androiduix.java.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.lang.StringBuilder")
@js.native
class StringBuilder () extends js.Object {
  def this(capacity: Double) = this()
  def this(str: String) = this()
  var array: js.Array[String] = js.native
  def append(a: js.Any): StringBuilder = js.native
  def deleteCharAt(index: Double): StringBuilder = js.native
  def length(): Double = js.native
  def replace(start: Double, end: Double, str: String): StringBuilder = js.native
  def setLength(length: Double): Unit = js.native
}

