package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerPolicy extends js.Object {
  val Application: js.Any = js.native
  val BlockPreview: Boolean = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  val Id: String = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Statement: String = js.native
  def apply(Index: String): PolicyItem = js.native
  def apply(Index: Double): PolicyItem = js.native
  def Item(Index: String): PolicyItem = js.native
  def Item(Index: Double): PolicyItem = js.native
}

