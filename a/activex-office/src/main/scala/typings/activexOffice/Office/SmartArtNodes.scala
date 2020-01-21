package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartArtNodes extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): SmartArtNode = js.native
  def apply(Index: Double): SmartArtNode = js.native
  def Add(): SmartArtNode = js.native
  def Item(Index: String): SmartArtNode = js.native
  def Item(Index: Double): SmartArtNode = js.native
}

