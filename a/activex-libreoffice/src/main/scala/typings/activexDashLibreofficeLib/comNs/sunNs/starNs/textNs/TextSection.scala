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

object TextSection {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    ChildSections: activexDashInteropLib.SafeArray[XTextSection],
    Condition: java.lang.String,
    DDECommandElement: java.lang.String,
    DDECommandFile: java.lang.String,
    DDECommandType: java.lang.String,
    EndnoteIsCollectAtTextEnd: scala.Boolean,
    EndnoteIsOwnNumbering: scala.Boolean,
    EndnoteIsRestartNumbering: scala.Boolean,
    EndnoteNumberingPrefix: java.lang.String,
    EndnoteNumberingSuffix: java.lang.String,
    EndnoteNumberingType: scala.Double,
    EndnoteRestartNumberingAt: scala.Double,
    FileLink: SectionFileLink,
    FootnoteIsCollectAtTextEnd: scala.Boolean,
    FootnoteIsOwnNumbering: scala.Boolean,
    FootnoteIsRestartNumbering: scala.Boolean,
    FootnoteNumberingPrefix: java.lang.String,
    FootnoteNumberingSuffix: java.lang.String,
    FootnoteNumberingType: scala.Double,
    FootnoteRestartNumberingAt: scala.Double,
    IsAutomaticUpdate: scala.Boolean,
    IsProtected: scala.Boolean,
    IsVisible: scala.Boolean,
    LinkRegion: java.lang.String,
    Name: java.lang.String,
    ParentSection: XTextSection,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SectionLeftMargin: scala.Double,
    SectionRightMargin: scala.Double,
    TextColumns: XTextColumns,
    TextWrap: WrapTextMode,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getChildSections: js.Function0[activexDashInteropLib.SafeArray[XTextSection]],
    getName: js.Function0[java.lang.String],
    getParentSection: js.Function0[XTextSection],
    getPropertyDefault: js.Function1[java.lang.String, js.Any],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyState: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState
    ],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyToDefault: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TextSection = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, ChildSections = ChildSections, Condition = Condition, DDECommandElement = DDECommandElement, DDECommandFile = DDECommandFile, DDECommandType = DDECommandType, EndnoteIsCollectAtTextEnd = EndnoteIsCollectAtTextEnd, EndnoteIsOwnNumbering = EndnoteIsOwnNumbering, EndnoteIsRestartNumbering = EndnoteIsRestartNumbering, EndnoteNumberingPrefix = EndnoteNumberingPrefix, EndnoteNumberingSuffix = EndnoteNumberingSuffix, EndnoteNumberingType = EndnoteNumberingType, EndnoteRestartNumberingAt = EndnoteRestartNumberingAt, FileLink = FileLink, FootnoteIsCollectAtTextEnd = FootnoteIsCollectAtTextEnd, FootnoteIsOwnNumbering = FootnoteIsOwnNumbering, FootnoteIsRestartNumbering = FootnoteIsRestartNumbering, FootnoteNumberingPrefix = FootnoteNumberingPrefix, FootnoteNumberingSuffix = FootnoteNumberingSuffix, FootnoteNumberingType = FootnoteNumberingType, FootnoteRestartNumberingAt = FootnoteRestartNumberingAt, IsAutomaticUpdate = IsAutomaticUpdate, IsProtected = IsProtected, IsVisible = IsVisible, LinkRegion = LinkRegion, Name = Name, ParentSection = ParentSection, PropertySetInfo = PropertySetInfo, SectionLeftMargin = SectionLeftMargin, SectionRightMargin = SectionRightMargin, TextColumns = TextColumns, TextWrap = TextWrap, UserDefinedAttributes = UserDefinedAttributes, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getChildSections = getChildSections, getName = getName, getParentSection = getParentSection, getPropertyDefault = getPropertyDefault, getPropertySetInfo = getPropertySetInfo, getPropertyState = getPropertyState, getPropertyStates = getPropertyStates, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPropertyToDefault = setPropertyToDefault, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[TextSection]
  }
}

