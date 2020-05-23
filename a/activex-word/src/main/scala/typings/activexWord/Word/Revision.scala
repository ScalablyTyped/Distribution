package typings.activexWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revision extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Author: String
  val Cells: typings.activexWord.Word.Cells
  val Creator: Double
  val Date: VarDate
  val FormatDescription: String
  val Index: Double
  val MovedRange: typings.activexWord.Word.Range
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  val Style: typings.activexWord.Word.Style
  val Type: WdRevisionType
  @JSName("Word.Revision_typekey")
  var WordDotRevision_typekey: Revision
  def Accept(): Unit
  def Reject(): Unit
}

object Revision {
  @scala.inline
  def apply(
    Accept: () => Unit,
    Application: Application,
    Author: String,
    Cells: Cells,
    Creator: Double,
    Date: VarDate,
    FormatDescription: String,
    Index: Double,
    MovedRange: Range,
    Parent: js.Any,
    Range: Range,
    Reject: () => Unit,
    Style: Style,
    Type: WdRevisionType,
    WordDotRevision_typekey: Revision
  ): Revision = {
    val __obj = js.Dynamic.literal(Accept = js.Any.fromFunction0(Accept), Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], FormatDescription = FormatDescription.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MovedRange = MovedRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = js.Any.fromFunction0(Reject), Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Revision_typekey")(WordDotRevision_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
}

