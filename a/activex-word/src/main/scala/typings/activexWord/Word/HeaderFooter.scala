package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFooter extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Exists: Boolean
  val Index: WdHeaderFooterIndex
  val IsHeader: Boolean
  var LinkToPrevious: Boolean
  val PageNumbers: typings.activexWord.Word.PageNumbers
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  val Shapes: typings.activexWord.Word.Shapes
  @JSName("Word.HeaderFooter_typekey")
  var WordDotHeaderFooter_typekey: HeaderFooter
}

object HeaderFooter {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Exists: Boolean,
    Index: WdHeaderFooterIndex,
    IsHeader: Boolean,
    LinkToPrevious: Boolean,
    PageNumbers: PageNumbers,
    Parent: js.Any,
    Range: Range,
    Shapes: Shapes,
    WordDotHeaderFooter_typekey: HeaderFooter
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = Exists.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsHeader = IsHeader.asInstanceOf[js.Any], LinkToPrevious = LinkToPrevious.asInstanceOf[js.Any], PageNumbers = PageNumbers.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeaderFooter_typekey")(WordDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
}

