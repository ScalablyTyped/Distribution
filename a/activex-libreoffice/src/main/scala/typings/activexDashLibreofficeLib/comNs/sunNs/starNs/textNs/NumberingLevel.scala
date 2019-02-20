package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a numbering level as part of the Numbering Rules. */
trait NumberingLevel extends js.Object {
  /** adjusts the numbering (HoriOrientation_LEFT/RIGHT/CENTER) */
  var Adjust: scala.Double
  /** contains the symbol in the given font. This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} . */
  var BulletChar: java.lang.String
  /** contains the color for the symbol. This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} . */
  var BulletColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** the font used to paint the bullet. */
  var BulletFont: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** the name of the font for the symbol. This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} . */
  var BulletFontName: java.lang.String
  /**
    * the ID of the symbol in the given font. This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} .
    * @deprecated Deprecated
    */
  var BulletId: scala.Double
  /**
    * contains the size of the symbol relative to the high of the paragraph. This is only valid if the numbering type is {@link
    * com.sun.star.style.NumberingType.CHAR_SPECIAL} .
    */
  var BulletRelSize: scala.Double
  /** Name of the character style that is used for the numbering symbol. */
  var CharStyleName: java.lang.String
  /**
    * additional line indent for the first text line <p>
    *
    * Specifies the first line indent.
    *
    * Only of relevance, if PositionAndSpaceMode equals LABEL_ALIGNMENT.
    *
    * </p>
    * @@since OOo 3.0
    */
  var FirstLineIndent: scala.Double
  /** specifies the offset between the beginning of the first line and the beginning of the following lines of the paragraph. */
  var FirstLineOffset: scala.Double
  /** the bitmap containing the bullet. */
  var GraphicBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap
  /** size of the graphic that is used as bullet. */
  var GraphicSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * the URL of the graphic file that is used as the numbering symbol.
    *
    * This is only valid if the numbering type is {@link com.sun.star.style.NumberingType.BITMAP} .
    */
  var GraphicURL: java.lang.String
  /**
    * contains the name of the paragraph style that is interpreted as the header of this level. It is only contained in the levels of chapter numbering
    * rules.
    */
  var HeadingStyleName: java.lang.String
  /**
    * indentation of the text lines <p>
    *
    * Specifies the indent of the text lines
    *
    * Only of relevance, if PositionAndSpaceMode equals LABEL_ALIGNMENT.
    *
    * </p>
    * @@since OOo 3.0
    */
  var IndentAt: scala.Double
  /**
    * character following the list label <p>
    *
    * Specifies the character following the list label.
    *
    * For valid values see com::sun::star::text::LabelFollow.
    *
    * Only of relevance, if PositionAndSpaceMode equals LABEL_ALIGNMENT.
    *
    * </p>
    * @@since OOo 3.0
    */
  var LabelFollowedBy: scala.Double
  /** specifies the left margin of the numbering */
  var LeftMargin: scala.Double
  /**
    * list tab position <p>
    *
    * Specifies the position of the list tab stop - only non-negative
    *
    * values are allowed.
    *
    * Only of relevance, if PositionAndSpaceMode equals LABEL_ALIGNMENT
    *
    * and LabelFollowedBy equal LABELFOLLOW_LISTTAB
    *
    * </p>
    * @@since OOo 3.0
    */
  var ListtabStopPosition: scala.Double
  /** specifies the type of numbering. */
  var NumberingType: scala.Double
  /**
    * contains the name of the paragraph style that should use this numbering. This is ignored for chapter numbering rules, use HeadingStyleName.
    * @since LibreOffice 3.6
    */
  var ParagraphStyleName: java.lang.String
  /** number of upper levels that are included in the current numbering symbol. */
  var ParentNumbering: scala.Double
  /**
    * position and space mode <p>
    *
    * Specifies the position and space mode of the numbering level.
    *
    * For valid values see com::sun::star::text::PositionAndSpaceMode.
    *
    * If it equals LABEL_WIDTH_AND_POSITION, properties Adjust,
    *
    * LeftMargin, SymbolTextDistance and FirstLineOffset are used.
    *
    * If it equals LABEL_ALIGNMENT, properties Adjust, LabelFollowedBy,
    *
    * ListtabStopPosition, FirstLineIndent, IndentAt are used.
    *
    * </p>
    * @@since OOo 3.0
    */
  var PositionAndSpaceMode: scala.Double
  /** the prefix of the numbering symbol. */
  var Prefix: java.lang.String
  /**
    * specifies the start value for the numbering.
    *
    * This property is only valid if the numbering type is not {@link com.sun.star.style.NumberingType.BITMAP} or {@link
    * com.sun.star.style.NumberingType.CHAR_SPECIAL} .
    */
  var StartWith: scala.Double
  /** the suffix of the numbering symbol. */
  var Suffix: java.lang.String
  /** specifies the distance between the numbering symbol and the text of the paragraph. */
  var SymbolTextDistance: scala.Double
  /**
    * contains the vertical orientation of a graphic.
    *
    * It is set using {@link com.sun.star.text.VertOrientation} .
    */
  var VertOrient: scala.Double
}

