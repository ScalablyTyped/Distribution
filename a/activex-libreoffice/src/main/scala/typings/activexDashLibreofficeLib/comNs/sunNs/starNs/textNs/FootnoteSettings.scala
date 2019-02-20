package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of footnotes or endnotes in a (text) document. */
trait FootnoteSettings extends js.Object {
  /**
    * contains the name of the character style that is used for footnote/endnote anchor in the text.
    * @since OOo 2.0
    */
  var AnchorCharStyleName: java.lang.String
  /**
    * contains the string at the restart of the footnote text after a break.
    *
    * For footnotes only.
    */
  var BeginNotice: java.lang.String
  /** contains the name of the character style that is used for the label in front of the footnote/endnote text. */
  var CharStyleName: java.lang.String
  /**
    * contains the string at the end of a footnote part in front of a break.
    *
    * For footnotes only.
    */
  var EndNotice: java.lang.String
  /**
    * contains the type of the counting of the footnote numbers.
    *
    * For footnotes only.
    * @see FootnoteNumbering
    */
  var FootnoteCounting: scala.Double
  /** contains the numbering type for the numbering of the footnotes/endnotes. */
  var NumberingType: scala.Double
  /** contains the page style that is used for the page that contains the footnote/endnote texts */
  var PageStyleName: java.lang.String
  /** contains the paragraph style that is used for the footnote/endnote text. */
  var ParaStyleName: java.lang.String
  /**
    * If `TRUE` , the footnote text is shown at the end of the document.
    *
    * For footnotes only.
    */
  var PositionEndOfDoc: scala.Boolean
  /** contains the prefix for the footnote/endnote symbol. */
  var Prefix: java.lang.String
  /** contains the first number of the automatic numbering of footnotes/endnotes. */
  var StartAt: scala.Double
  /** contains the suffix for the footnote/endnote symbol. */
  var Suffix: java.lang.String
}

