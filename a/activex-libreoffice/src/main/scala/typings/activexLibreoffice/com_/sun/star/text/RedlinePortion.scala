package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.beans.GetDirectPropertyTolerantResult
import typings.activexLibreoffice.com_.sun.star.beans.GetPropertyTolerantResult
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.beans.SetPropertyTolerantFailed
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.style.BreakType
import typings.activexLibreoffice.com_.sun.star.style.DropCapFormat
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.style.LineSpacing
import typings.activexLibreoffice.com_.sun.star.style.ParagraphAdjust
import typings.activexLibreoffice.com_.sun.star.style.TabStop
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.BorderLine2
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link RedlinePortion} is a {@link TextPortion} that marks a change that has been recorded by the change tracking. */
@js.native
trait RedlinePortion extends TextPortion {
  /** determines whether the portion is member of a header or footer text. */
  var IsInHeaderFooter: Boolean = js.native
  /** determines whether the last paragraph of a redline text has to be merged with a possible following text content (i.e. a text table) */
  var MergeLastPara: Boolean = js.native
  /** contains the name of the author of the change. */
  var RedlineAuthor: String = js.native
  /** contains a comment for the change. */
  var RedlineComment: String = js.native
  /** contains the date and time of the change. */
  var RedlineDateTime: DateTime = js.native
  /**
    * contains a unique identifier for the redline. This is necessary for file export filters to able to recognize redline portions that point to the same
    * redline.
    */
  var RedlineIdentifier: String = js.native
  /**
    * contains the data of a second level redline data
    *
    * The elements of the sequence are:
    *
    *
    *
    * string RedlineAuthor;
    *
    *
    *
    * {@link com.sun.star.util.DateTime} RedlineDateTime;
    *
    *
    *
    * string RedlineComment;
    *
    *
    *
    * string RedlineType;
    */
  var RedlineSuccessorData: PropertyValues = js.native
  /**
    * provides access to the text of the redline. This interface is only provided if the change is not visible. The visibility depends on the redline
    * display options that are set at the documents property set (RedlineDisplayType).
    */
  var RedlineText: XText = js.native
  /**
    * contains the type of the change
    *
    * Valid type names are:
    *
    *
    *
    * Insert - marks an insertion
    *
    *
    *
    * Delete - marks an deletion
    *
    *
    *
    * Format - marks an attribute change
    *
    *
    *
    * {@link TextTable} - marks a text table
    *
    *
    *
    * Style - marks an applied style
    */
  var RedlineType: String = js.native
}

object RedlinePortion {
  @scala.inline
  def apply(
    AvailableServiceNames: SafeArray[String],
    Bookmark: XTextContent,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BreakType: BreakType,
    CharAutoKerning: Boolean,
    CharBackColor: Color,
    CharBackTransparent: Boolean,
    CharBorderDistance: Double,
    CharBottomBorder: BorderLine2,
    CharBottomBorderDistance: Double,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharEmphasis: Double,
    CharEscapement: Double,
    CharEscapementHeight: Double,
    CharFlash: Boolean,
    CharFontCharSet: Double,
    CharFontCharSetAsian: Double,
    CharFontCharSetComplex: Double,
    CharFontFamily: Double,
    CharFontFamilyAsian: Double,
    CharFontFamilyComplex: Double,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: Double,
    CharFontPitchAsian: Double,
    CharFontPitchComplex: Double,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRightBorder: BorderLine2,
    CharRightBorderDistance: Double,
    CharRotation: Double,
    CharRotationIsFitToLine: Boolean,
    CharScaleWidth: Double,
    CharShadingValue: Double,
    CharShadowFormat: ShadowFormat,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharStyleName: String,
    CharStyleNames: SafeArray[String],
    CharTopBorder: BorderLine2,
    CharTopBorderDistance: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharUnderlineHasColor: Boolean,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    ControlCharacter: Double,
    DocumentIndexMark: XTextContent,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    End: XTextRange,
    Footnote: XFootnote,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    InContentMetadata: XTextContent,
    IsCollapsed: Boolean,
    IsInHeaderFooter: Boolean,
    IsStart: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    ListId: String,
    MergeLastPara: Boolean,
    NumberingIsNumber: Boolean,
    NumberingLevel: Double,
    NumberingRules: XIndexReplace,
    NumberingStartValue: Double,
    NumberingStyleName: String,
    OutlineLevel: Double,
    PageDescName: String,
    PageNumberOffset: Double,
    PageStyleName: String,
    ParaAdjust: ParagraphAdjust,
    ParaBackColor: Color,
    ParaBackGraphicFilter: String,
    ParaBackGraphicLocation: GraphicLocation,
    ParaBackGraphicURL: String,
    ParaBackTransparent: Boolean,
    ParaBottomMargin: Double,
    ParaContextMargin: Boolean,
    ParaExpandSingleWord: Boolean,
    ParaFirstLineIndent: Double,
    ParaHyphenationMaxHyphens: Double,
    ParaHyphenationMaxLeadingChars: Double,
    ParaHyphenationMaxTrailingChars: Double,
    ParaInteropGrabBag: SafeArray[PropertyValue],
    ParaIsAutoFirstLineIndent: Boolean,
    ParaIsCharacterDistance: Boolean,
    ParaIsConnectBorder: Boolean,
    ParaIsForbiddenRules: Boolean,
    ParaIsHangingPunctuation: Boolean,
    ParaIsHyphenation: Boolean,
    ParaIsNumberingRestart: Boolean,
    ParaKeepTogether: Boolean,
    ParaLastLineAdjust: Double,
    ParaLeftMargin: Double,
    ParaLineNumberCount: Boolean,
    ParaLineNumberStartValue: Double,
    ParaLineSpacing: LineSpacing,
    ParaOrphans: Double,
    ParaRegisterModeActive: Boolean,
    ParaRightMargin: Double,
    ParaShadowFormat: ShadowFormat,
    ParaSplit: Boolean,
    ParaStyleName: String,
    ParaTabStops: SafeArray[TabStop],
    ParaTopMargin: Double,
    ParaUserDefinedAttributes: XNameContainer,
    ParaVertAlignment: Double,
    ParaWidows: Double,
    PropertySetInfo: XPropertySetInfo,
    RedlineAuthor: String,
    RedlineComment: String,
    RedlineDateTime: DateTime,
    RedlineIdentifier: String,
    RedlineSuccessorData: PropertyValues,
    RedlineText: XText,
    RedlineType: String,
    ReferenceMark: XTextContent,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    Start: XTextRange,
    String: String,
    TextField: XTextField,
    TextPortionType: String,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UnvisitedCharStyleName: String,
    VisitedCharStyleName: String,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createContentEnumeration: String => XEnumeration,
    getAvailableServiceNames: () => SafeArray[String],
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getEnd: () => XTextRange,
    getPropertyDefault: String => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed],
    setString: String => Unit
  ): RedlinePortion = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], Bookmark = Bookmark.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], ControlCharacter = ControlCharacter.asInstanceOf[js.Any], DocumentIndexMark = DocumentIndexMark.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Footnote = Footnote.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], InContentMetadata = InContentMetadata.asInstanceOf[js.Any], IsCollapsed = IsCollapsed.asInstanceOf[js.Any], IsInHeaderFooter = IsInHeaderFooter.asInstanceOf[js.Any], IsStart = IsStart.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], MergeLastPara = MergeLastPara.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsCharacterDistance = ParaIsCharacterDistance.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsForbiddenRules = ParaIsForbiddenRules.asInstanceOf[js.Any], ParaIsHangingPunctuation = ParaIsHangingPunctuation.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RedlineAuthor = RedlineAuthor.asInstanceOf[js.Any], RedlineComment = RedlineComment.asInstanceOf[js.Any], RedlineDateTime = RedlineDateTime.asInstanceOf[js.Any], RedlineIdentifier = RedlineIdentifier.asInstanceOf[js.Any], RedlineSuccessorData = RedlineSuccessorData.asInstanceOf[js.Any], RedlineText = RedlineText.asInstanceOf[js.Any], RedlineType = RedlineType.asInstanceOf[js.Any], ReferenceMark = ReferenceMark.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], TextField = TextField.asInstanceOf[js.Any], TextPortionType = TextPortionType.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createContentEnumeration = js.Any.fromFunction1(createContentEnumeration), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getEnd = js.Any.fromFunction0(getEnd), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[RedlinePortion]
  }
  @scala.inline
  implicit class RedlinePortionOps[Self <: RedlinePortion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsInHeaderFooter(value: Boolean): Self = this.set("IsInHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeLastPara(value: Boolean): Self = this.set("MergeLastPara", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedlineAuthor(value: String): Self = this.set("RedlineAuthor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedlineComment(value: String): Self = this.set("RedlineComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedlineDateTime(value: DateTime): Self = this.set("RedlineDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedlineIdentifier(value: String): Self = this.set("RedlineIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedlineSuccessorDataVarargs(value: PropertyValue*): Self = this.set("RedlineSuccessorData", js.Array(value :_*))
    @scala.inline
    def setRedlineSuccessorData(value: PropertyValues): Self = this.set("RedlineSuccessorData", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedlineText(value: XText): Self = this.set("RedlineText", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedlineType(value: String): Self = this.set("RedlineType", value.asInstanceOf[js.Any])
  }
  
}

