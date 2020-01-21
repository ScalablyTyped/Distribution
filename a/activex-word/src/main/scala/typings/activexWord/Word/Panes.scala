package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Panes")
@js.native
class Panes protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Panes_typekey")
  var WordDotPanes_typekey: Panes = js.native
  def Add(): Pane = js.native
  def Add(SplitVertical: js.Any): Pane = js.native
  def Item(Index: Double): Pane = js.native
}

