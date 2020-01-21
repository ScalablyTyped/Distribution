package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  val Count: Double = js.native
  def apply(Index: String): Parameter = js.native
  def apply(Index: Double): Parameter = js.native
  def Append(Object: js.Any): Unit = js.native
  def Delete(Index: String): Unit = js.native
  def Delete(Index: Double): Unit = js.native
  def Item(Index: String): Parameter = js.native
  def Item(Index: Double): Parameter = js.native
  def Refresh(): Unit = js.native
}

