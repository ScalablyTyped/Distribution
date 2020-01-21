package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TableOfFigures")
@js.native
class TableOfFigures protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Caption: String = js.native
  val Creator: Double = js.native
  val HeadingStyles: typings.activexWord.Word.HeadingStyles = js.native
  var HidePageNumbersInWeb: Boolean = js.native
  var IncludeLabel: Boolean = js.native
  var IncludePageNumbers: Boolean = js.native
  var LowerHeadingLevel: Double = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  var RightAlignPageNumbers: Boolean = js.native
  var TabLeader: WdTabLeader = js.native
  var TableID: String = js.native
  var UpperHeadingLevel: Double = js.native
  var UseFields: Boolean = js.native
  var UseHeadingStyles: Boolean = js.native
  var UseHyperlinks: Boolean = js.native
  @JSName("Word.TableOfFigures_typekey")
  var WordDotTableOfFigures_typekey: TableOfFigures = js.native
  def Delete(): Unit = js.native
  def Update(): Unit = js.native
  def UpdatePageNumbers(): Unit = js.native
}

