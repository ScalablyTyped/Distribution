package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Section extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Borders: typings.activexWord.Word.Borders
  val Creator: Double
  val Footers: HeadersFooters
  val Headers: HeadersFooters
  val Index: Double
  var PageSetup: typings.activexWord.Word.PageSetup
  val Parent: js.Any
  var ProtectedForForms: Boolean
  val Range: typings.activexWord.Word.Range
  @JSName("Word.Section_typekey")
  var WordDotSection_typekey: Section
}

object Section {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Creator: Double,
    Footers: HeadersFooters,
    Headers: HeadersFooters,
    Index: Double,
    PageSetup: PageSetup,
    Parent: js.Any,
    ProtectedForForms: Boolean,
    Range: Range,
    WordDotSection_typekey: Section
  ): Section = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Footers = Footers.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], PageSetup = PageSetup.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProtectedForForms = ProtectedForForms.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Section_typekey")(WordDotSection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
}

