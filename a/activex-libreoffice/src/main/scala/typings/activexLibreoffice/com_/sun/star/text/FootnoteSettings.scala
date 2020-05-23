package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of footnotes or endnotes in a (text) document. */
trait FootnoteSettings extends js.Object {
  /**
    * contains the name of the character style that is used for footnote/endnote anchor in the text.
    * @since OOo 2.0
    */
  var AnchorCharStyleName: String
  /**
    * contains the string at the restart of the footnote text after a break.
    *
    * For footnotes only.
    */
  var BeginNotice: String
  /** contains the name of the character style that is used for the label in front of the footnote/endnote text. */
  var CharStyleName: String
  /**
    * contains the string at the end of a footnote part in front of a break.
    *
    * For footnotes only.
    */
  var EndNotice: String
  /**
    * contains the type of the counting of the footnote numbers.
    *
    * For footnotes only.
    * @see FootnoteNumbering
    */
  var FootnoteCounting: Double
  /** contains the numbering type for the numbering of the footnotes/endnotes. */
  var NumberingType: Double
  /** contains the page style that is used for the page that contains the footnote/endnote texts */
  var PageStyleName: String
  /** contains the paragraph style that is used for the footnote/endnote text. */
  var ParaStyleName: String
  /**
    * If `TRUE` , the footnote text is shown at the end of the document.
    *
    * For footnotes only.
    */
  var PositionEndOfDoc: Boolean
  /** contains the prefix for the footnote/endnote symbol. */
  var Prefix: String
  /** contains the first number of the automatic numbering of footnotes/endnotes. */
  var StartAt: Double
  /** contains the suffix for the footnote/endnote symbol. */
  var Suffix: String
}

object FootnoteSettings {
  @scala.inline
  def apply(
    AnchorCharStyleName: String,
    BeginNotice: String,
    CharStyleName: String,
    EndNotice: String,
    FootnoteCounting: Double,
    NumberingType: Double,
    PageStyleName: String,
    ParaStyleName: String,
    PositionEndOfDoc: Boolean,
    Prefix: String,
    StartAt: Double,
    Suffix: String
  ): FootnoteSettings = {
    val __obj = js.Dynamic.literal(AnchorCharStyleName = AnchorCharStyleName.asInstanceOf[js.Any], BeginNotice = BeginNotice.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], EndNotice = EndNotice.asInstanceOf[js.Any], FootnoteCounting = FootnoteCounting.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], PositionEndOfDoc = PositionEndOfDoc.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], StartAt = StartAt.asInstanceOf[js.Any], Suffix = Suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteSettings]
  }
}

