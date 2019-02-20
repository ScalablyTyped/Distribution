package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link TextSection} is a range of complete paragraphs within a text.
  *
  * The content of the section may be the content of a link into another document, a link from the same document, or the result of a DDE operation.
  *
  * {@link TextSection} instances can be linked from and to other texts.
  */
trait TextSection
  extends TextContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
     with XTextSection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyState {
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: java.lang.String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL for the background graphic. */
  var BackGraphicURL: java.lang.String
  /**
    * This property contains a conditional expression.
    *
    * If the result of the conditional expression is `TRUE` and the property {@link TextSection.IsVisible} is `FALSE` , then the section is hidden.
    */
  var Condition: java.lang.String
  /**
    * specifies the source element of the command string for a DDE operation.
    *
    * The element can be i.e. a name of a cell in a sheet or a bookmark.
    */
  var DDECommandElement: java.lang.String
  /** specifies the source file name of the command string for a DDE operation. */
  var DDECommandFile: java.lang.String
  /**
    * specifies the type of the command string for a DDE operation.
    *
    * The type can be the name of the application that provides a DDE source.
    */
  var DDECommandType: java.lang.String
  /** determines whether endnotes inside the section are displayed at the end of the section text. */
  var EndnoteIsCollectAtTextEnd: scala.Boolean
  /** determines whether the endnotes within the section use an own numbering format. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteIsOwnNumbering: scala.Boolean
  /** determines whether the endnotes numbering restarts within the section. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteIsRestartNumbering: scala.Boolean
  /** determines the prefix that is display before the endnote number. This is only valid if `EndnoteIsOwnNumbering` is set. */
  var EndnoteNumberingPrefix: java.lang.String
  /** determines the suffix that is display after the endnote number. This is only valid if `EndnoteIsOwnNumbering` is set. */
  var EndnoteNumberingSuffix: java.lang.String
  /**
    * determines the numbering type of the endnote numbering as a value of {@link com.sun.star.style.NumberingType} . This is only valid if
    * `EndoteIsOwnNumbering` is set.
    */
  var EndnoteNumberingType: scala.Double
  /** determines at which number the endnote numbering inside of the section starts. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteRestartNumberingAt: scala.Double
  /** If this property is set, then the content of the section is read from the specified document. */
  var FileLink: SectionFileLink
  /** determines whether footnotes inside the section are displayed at the end of the section text. */
  var FootnoteIsCollectAtTextEnd: scala.Boolean
  /** determines whether the footnotes within the section use an own numbering format. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteIsOwnNumbering: scala.Boolean
  /** determines whether the footnotes numbering restarts within the section. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteIsRestartNumbering: scala.Boolean
  /** determines the prefix that is display before the footnote number. This is only valid if `FootnoteIsOwnNumbering` is set. */
  var FootnoteNumberingPrefix: java.lang.String
  /** determines the suffix that is display after of the footnote number. This is only valid if `FootnoteIsOwnNumbering` is set. */
  var FootnoteNumberingSuffix: java.lang.String
  /**
    * determines the numbering type of the footnote numbering as a value of {@link com.sun.star.style.NumberingType} . This is only valid if
    * `FootnoteIsOwnNumbering` is set.
    */
  var FootnoteNumberingType: scala.Double
  /** determines at which number the footnote numbering inside of the section starts. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteRestartNumberingAt: scala.Double
  /** determines if a DDE link is updated automatically. */
  var IsAutomaticUpdate: scala.Boolean
  /** If this property is `TRUE` , the text section is protected and cannot be modified from the user interface. */
  var IsProtected: scala.Boolean
  /** If this property is `FALSE` , the text section is hidden. */
  var IsVisible: scala.Boolean
  /**
    * specifies the source of a file link in the document that is specified in {@link TextSection.FileLink} .
    *
    * The source may be a text section or a bookmark. If {@link TextSection.FileLink} is empty, then the current document is searched for the source. If
    * this property is empty and {@link TextSection.FileLink} is set, then the complete document content is linked into this section.
    */
  var LinkRegion: java.lang.String
  /** determines the left margin of the section */
  var SectionLeftMargin: scala.Double
  /** determines the left margin of the section */
  var SectionRightMargin: scala.Double
  /** allows columns to be set into the text section */
  var TextColumns: XTextColumns
}

