package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathMatRows extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathMatRows_typekey")
  var WordDotOMathMatRows_typekey: OMathMatRows = js.native
  def Add(): OMathMatRow = js.native
  def Add(BeforeRow: js.Any): OMathMatRow = js.native
  def Item(Index: Double): OMathMatRow = js.native
}

