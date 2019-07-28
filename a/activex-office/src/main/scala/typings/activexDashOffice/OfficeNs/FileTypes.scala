package typings.activexDashOffice.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypes extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  def apply(Index: Double): MsoFileType = js.native
  def Add(FileType: MsoFileType): Unit = js.native
  def Item(Index: Double): MsoFileType = js.native
  def Remove(Index: Double): Unit = js.native
}

