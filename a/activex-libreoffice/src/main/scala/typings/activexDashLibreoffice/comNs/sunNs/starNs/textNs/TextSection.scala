package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import typings.std.SafeArray
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
     with UserDefinedAttributesSupplier
     with XTextSection
     with XNamed
     with XPropertySet
     with XPropertyState {
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation
  /** contains the URL for the background graphic. */
  var BackGraphicURL: String
  /**
    * This property contains a conditional expression.
    *
    * If the result of the conditional expression is `TRUE` and the property {@link TextSection.IsVisible} is `FALSE` , then the section is hidden.
    */
  var Condition: String
  /**
    * specifies the source element of the command string for a DDE operation.
    *
    * The element can be i.e. a name of a cell in a sheet or a bookmark.
    */
  var DDECommandElement: String
  /** specifies the source file name of the command string for a DDE operation. */
  var DDECommandFile: String
  /**
    * specifies the type of the command string for a DDE operation.
    *
    * The type can be the name of the application that provides a DDE source.
    */
  var DDECommandType: String
  /** determines whether endnotes inside the section are displayed at the end of the section text. */
  var EndnoteIsCollectAtTextEnd: Boolean
  /** determines whether the endnotes within the section use an own numbering format. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteIsOwnNumbering: Boolean
  /** determines whether the endnotes numbering restarts within the section. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteIsRestartNumbering: Boolean
  /** determines the prefix that is display before the endnote number. This is only valid if `EndnoteIsOwnNumbering` is set. */
  var EndnoteNumberingPrefix: String
  /** determines the suffix that is display after the endnote number. This is only valid if `EndnoteIsOwnNumbering` is set. */
  var EndnoteNumberingSuffix: String
  /**
    * determines the numbering type of the endnote numbering as a value of {@link com.sun.star.style.NumberingType} . This is only valid if
    * `EndoteIsOwnNumbering` is set.
    */
  var EndnoteNumberingType: Double
  /** determines at which number the endnote numbering inside of the section starts. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteRestartNumberingAt: Double
  /** If this property is set, then the content of the section is read from the specified document. */
  var FileLink: SectionFileLink
  /** determines whether footnotes inside the section are displayed at the end of the section text. */
  var FootnoteIsCollectAtTextEnd: Boolean
  /** determines whether the footnotes within the section use an own numbering format. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteIsOwnNumbering: Boolean
  /** determines whether the footnotes numbering restarts within the section. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteIsRestartNumbering: Boolean
  /** determines the prefix that is display before the footnote number. This is only valid if `FootnoteIsOwnNumbering` is set. */
  var FootnoteNumberingPrefix: String
  /** determines the suffix that is display after of the footnote number. This is only valid if `FootnoteIsOwnNumbering` is set. */
  var FootnoteNumberingSuffix: String
  /**
    * determines the numbering type of the footnote numbering as a value of {@link com.sun.star.style.NumberingType} . This is only valid if
    * `FootnoteIsOwnNumbering` is set.
    */
  var FootnoteNumberingType: Double
  /** determines at which number the footnote numbering inside of the section starts. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteRestartNumberingAt: Double
  /** determines if a DDE link is updated automatically. */
  var IsAutomaticUpdate: Boolean
  /** If this property is `TRUE` , the text section is protected and cannot be modified from the user interface. */
  var IsProtected: Boolean
  /** If this property is `FALSE` , the text section is hidden. */
  var IsVisible: Boolean
  /**
    * specifies the source of a file link in the document that is specified in {@link TextSection.FileLink} .
    *
    * The source may be a text section or a bookmark. If {@link TextSection.FileLink} is empty, then the current document is searched for the source. If
    * this property is empty and {@link TextSection.FileLink} is set, then the complete document content is linked into this section.
    */
  var LinkRegion: String
  /** determines the left margin of the section */
  var SectionLeftMargin: Double
  /** determines the left margin of the section */
  var SectionRightMargin: Double
  /** allows columns to be set into the text section */
  var TextColumns: XTextColumns
}

object TextSection {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    ChildSections: SafeArray[XTextSection],
    Condition: String,
    DDECommandElement: String,
    DDECommandFile: String,
    DDECommandType: String,
    EndnoteIsCollectAtTextEnd: Boolean,
    EndnoteIsOwnNumbering: Boolean,
    EndnoteIsRestartNumbering: Boolean,
    EndnoteNumberingPrefix: String,
    EndnoteNumberingSuffix: String,
    EndnoteNumberingType: Double,
    EndnoteRestartNumberingAt: Double,
    FileLink: SectionFileLink,
    FootnoteIsCollectAtTextEnd: Boolean,
    FootnoteIsOwnNumbering: Boolean,
    FootnoteIsRestartNumbering: Boolean,
    FootnoteNumberingPrefix: String,
    FootnoteNumberingSuffix: String,
    FootnoteNumberingType: Double,
    FootnoteRestartNumberingAt: Double,
    IsAutomaticUpdate: Boolean,
    IsProtected: Boolean,
    IsVisible: Boolean,
    LinkRegion: String,
    Name: String,
    ParentSection: XTextSection,
    PropertySetInfo: XPropertySetInfo,
    SectionLeftMargin: Double,
    SectionRightMargin: Double,
    TextColumns: XTextColumns,
    TextWrap: WrapTextMode,
    UserDefinedAttributes: XNameContainer,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getChildSections: () => SafeArray[XTextSection],
    getName: () => String,
    getParentSection: () => XTextSection,
    getPropertyDefault: String => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TextSection = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, ChildSections = ChildSections, Condition = Condition, DDECommandElement = DDECommandElement, DDECommandFile = DDECommandFile, DDECommandType = DDECommandType, EndnoteIsCollectAtTextEnd = EndnoteIsCollectAtTextEnd, EndnoteIsOwnNumbering = EndnoteIsOwnNumbering, EndnoteIsRestartNumbering = EndnoteIsRestartNumbering, EndnoteNumberingPrefix = EndnoteNumberingPrefix, EndnoteNumberingSuffix = EndnoteNumberingSuffix, EndnoteNumberingType = EndnoteNumberingType, EndnoteRestartNumberingAt = EndnoteRestartNumberingAt, FileLink = FileLink, FootnoteIsCollectAtTextEnd = FootnoteIsCollectAtTextEnd, FootnoteIsOwnNumbering = FootnoteIsOwnNumbering, FootnoteIsRestartNumbering = FootnoteIsRestartNumbering, FootnoteNumberingPrefix = FootnoteNumberingPrefix, FootnoteNumberingSuffix = FootnoteNumberingSuffix, FootnoteNumberingType = FootnoteNumberingType, FootnoteRestartNumberingAt = FootnoteRestartNumberingAt, IsAutomaticUpdate = IsAutomaticUpdate, IsProtected = IsProtected, IsVisible = IsVisible, LinkRegion = LinkRegion, Name = Name, ParentSection = ParentSection, PropertySetInfo = PropertySetInfo, SectionLeftMargin = SectionLeftMargin, SectionRightMargin = SectionRightMargin, TextColumns = TextColumns, TextWrap = TextWrap, UserDefinedAttributes = UserDefinedAttributes, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getChildSections = js.Any.fromFunction0(getChildSections), getName = js.Any.fromFunction0(getName), getParentSection = js.Any.fromFunction0(getParentSection), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[TextSection]
  }
}

