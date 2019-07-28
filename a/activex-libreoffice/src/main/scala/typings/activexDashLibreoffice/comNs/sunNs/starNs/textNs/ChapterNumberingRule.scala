package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.HorizontalAlignment
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.NumberingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the rules for chapter numbering in a text document.
  *
  * Some of the properties that are available in the interface are ignored here.
  *
  * The type of numbering can only be: NUM_CHARS_UPPER_LETTER, NUM_CHARS_LOWER_LETTER, NUM_ROMAN_UPPER, NUM_ROMAN_LOWER, NUM_ARABIC, or NUM_NUMBER_NONE
  *
  * In the {@link com.sun.star.style.NumberingAlignment} only the field {@link com.sun.star.style.NumberingAlignment.Alignment} is applied.
  *
  * Depending on the numbering types, the parameters for bullets or bit maps may be ignored. The character style name for the numbering symbol is also
  * ignored.
  */
trait ChapterNumberingRule extends NumberingRule {
  /**
    * contains the name of the paragraph style that marks this heading level.
    *
    * It is necessary that each style name appears only once in the sequence of numbering rules.
    */
  var HeadingStyleName: String
}

object ChapterNumberingRule {
  @scala.inline
  def apply(
    Alignment: HorizontalAlignment,
    BulletFontName: String,
    BulletId: Double,
    CharStyleName: String,
    GraphicURL: String,
    HeadingStyleName: String,
    Insertion: Double,
    NumberingType: Double,
    ParentNumbering: Double,
    Prefix: String,
    StartWith: Double,
    Suffix: String,
    TextMarginDistance: Double,
    TextNumberingDistance: Double
  ): ChapterNumberingRule = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, BulletFontName = BulletFontName, BulletId = BulletId, CharStyleName = CharStyleName, GraphicURL = GraphicURL, HeadingStyleName = HeadingStyleName, Insertion = Insertion, NumberingType = NumberingType, ParentNumbering = ParentNumbering, Prefix = Prefix, StartWith = StartWith, Suffix = Suffix, TextMarginDistance = TextMarginDistance, TextNumberingDistance = TextNumberingDistance)
  
    __obj.asInstanceOf[ChapterNumberingRule]
  }
}

