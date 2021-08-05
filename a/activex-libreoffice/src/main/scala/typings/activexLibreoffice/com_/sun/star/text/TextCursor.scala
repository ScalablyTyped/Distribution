package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertyStates
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.document.XDocumentInsertable
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
import typings.activexLibreoffice.com_.sun.star.util.XSortable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link TextCursor} is a {@link TextRange} which can be moved within a {@link Text} object.
  * @see TextRange
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.text.XTextRange because Already inherited
- typings.activexLibreoffice.com_.sun.star.text.XTextCursor because var conflicts: String. Inlined collapseToEnd, collapseToStart, goLeft, goRight, gotoEnd, gotoRange, gotoStart, isCollapsed
- typings.activexLibreoffice.com_.sun.star.text.XParagraphCursor because var conflicts: String. Inlined gotoEndOfParagraph, gotoNextParagraph, gotoPreviousParagraph, gotoStartOfParagraph, isEndOfParagraph, isStartOfParagraph
- typings.activexLibreoffice.com_.sun.star.text.XSentenceCursor because var conflicts: String. Inlined gotoEndOfSentence, gotoNextSentence, gotoPreviousSentence, gotoStartOfSentence, isEndOfSentence, isStartOfSentence
- typings.activexLibreoffice.com_.sun.star.text.XWordCursor because var conflicts: String. Inlined gotoEndOfWord, gotoNextWord, gotoPreviousWord, gotoStartOfWord, isEndOfWord, isStartOfWord */ trait TextCursor
  extends StObject
     with TextRange
     with XMultiPropertyStates
     with XDocumentInsertable
     with XSortable {
  
  /** sets the start of the position to the end. */
  def collapseToEnd(): Unit
  
  /** sets the end of the position to the start. */
  def collapseToStart(): Unit
  
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
  
  /**
    * moves the cursor the specified number of characters to the left.
    * @param nCount the number of characters to move.
    * @param bExpand specifies if the current selection of the cursor should be expanded or not.
    * @returns `TRUE` if the command was successfully completed. `FALSE` otherwise.  Note: Even if the command was not completed successfully it may be complete
    */
  def goLeft(nCount: Double, bExpand: Boolean): Boolean
  
  /**
    * moves the cursor the specified number of characters to the right.
    * @param nCount the number of characters to move.
    * @param bExpand specifies if the current selection of the cursor should be expanded or not.
    * @returns `TRUE` if the command was successfully completed. `FALSE` otherwise.  Note: Even if the command was not completed successfully it may be complete
    */
  def goRight(nCount: Double, bExpand: Boolean): Boolean
  
  /** moves the cursor to the end of the text. */
  def gotoEnd(bExpand: Boolean): Unit
  
  /**
    * moves the cursor to the end of the current paragraph.
    * @returns `TRUE` if the cursor is now at the end of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfParagraph(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the end of the current sentence.
    * @returns `TRUE` if the cursor is now at the end of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfSentence(Expand: Boolean): Boolean
  
  /**
    * moves the cursor to the end of the current word.
    * @returns `TRUE` if the cursor is now at the end of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfWord(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the next paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextParagraph(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the next sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextSentence(Expand: Boolean): Boolean
  
  /**
    * moves the cursor to the next word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the next word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextWord(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the previous paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousParagraph(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the previous sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousSentence(Expand: Boolean): Boolean
  
  /**
    * moves the cursor to the previous word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the previous word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousWord(bExpand: Boolean): Boolean
  
  /** moves or expands the cursor to a specified {@link TextRange} . */
  def gotoRange(xRange: XTextRange, bExpand: Boolean): Unit
  
  /** moves the cursor to the start of the text. */
  def gotoStart(bExpand: Boolean): Unit
  
  /**
    * moves the cursor to the start of the current paragraph.
    * @returns `TRUE` if the cursor is now at the start of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfParagraph(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the current sentence.
    * @returns `TRUE` if the cursor is now at the start of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfSentence(Expand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the current word.
    * @returns `TRUE` if the cursor is now at the start of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfWord(bExpand: Boolean): Boolean
  
  /** determines if the start and end positions are the same. */
  def isCollapsed(): Boolean
  
  /** determines if the cursor is positioned at the end of a paragraph. */
  def isEndOfParagraph(): Boolean
  
  /** determines if the cursor is positioned at the end of a sentence. */
  def isEndOfSentence(): Boolean
  
  /** determines if the cursor is positioned at the end of a word. */
  def isEndOfWord(): Boolean
  
  /** determines if the cursor is positioned at the start of a paragraph. */
  def isStartOfParagraph(): Boolean
  
  /** determines if the cursor is positioned at the start of a sentence. */
  def isStartOfSentence(): Boolean
  
  /** determines if the cursor is positioned at the start of a word. */
  def isStartOfWord(): Boolean
}
object TextCursor {
  
  inline def apply(
    AvailableServiceNames: SafeArray[String],
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
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    End: XTextRange,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    ListId: String,
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
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    Start: XTextRange,
    String: String,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UnvisitedCharStyleName: String,
    VisitedCharStyleName: String,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    createContentEnumeration: String => XEnumeration,
    createSortDescriptor: () => SafeArray[PropertyValue],
    getAvailableServiceNames: () => SafeArray[String],
    getEnd: () => XTextRange,
    getPropertyDefault: String => js.Any,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[js.Any],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoEndOfParagraph: Boolean => Boolean,
    gotoEndOfSentence: Boolean => Boolean,
    gotoEndOfWord: Boolean => Boolean,
    gotoNextParagraph: Boolean => Boolean,
    gotoNextSentence: Boolean => Boolean,
    gotoNextWord: Boolean => Boolean,
    gotoPreviousParagraph: Boolean => Boolean,
    gotoPreviousSentence: Boolean => Boolean,
    gotoPreviousWord: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    gotoStartOfParagraph: Boolean => Boolean,
    gotoStartOfSentence: Boolean => Boolean,
    gotoStartOfWord: Boolean => Boolean,
    insertDocumentFromURL: (String, SeqEquiv[PropertyValue]) => Unit,
    isCollapsed: () => Boolean,
    isEndOfParagraph: () => Boolean,
    isEndOfSentence: () => Boolean,
    isEndOfWord: () => Boolean,
    isStartOfParagraph: () => Boolean,
    isStartOfSentence: () => Boolean,
    isStartOfWord: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setString: String => Unit,
    sort: SeqEquiv[PropertyValue] => Unit
  ): TextCursor = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsCharacterDistance = ParaIsCharacterDistance.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsForbiddenRules = ParaIsForbiddenRules.asInstanceOf[js.Any], ParaIsHangingPunctuation = ParaIsHangingPunctuation.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), createContentEnumeration = js.Any.fromFunction1(createContentEnumeration), createSortDescriptor = js.Any.fromFunction0(createSortDescriptor), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), getEnd = js.Any.fromFunction0(getEnd), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfParagraph = js.Any.fromFunction1(gotoEndOfParagraph), gotoEndOfSentence = js.Any.fromFunction1(gotoEndOfSentence), gotoEndOfWord = js.Any.fromFunction1(gotoEndOfWord), gotoNextParagraph = js.Any.fromFunction1(gotoNextParagraph), gotoNextSentence = js.Any.fromFunction1(gotoNextSentence), gotoNextWord = js.Any.fromFunction1(gotoNextWord), gotoPreviousParagraph = js.Any.fromFunction1(gotoPreviousParagraph), gotoPreviousSentence = js.Any.fromFunction1(gotoPreviousSentence), gotoPreviousWord = js.Any.fromFunction1(gotoPreviousWord), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfParagraph = js.Any.fromFunction1(gotoStartOfParagraph), gotoStartOfSentence = js.Any.fromFunction1(gotoStartOfSentence), gotoStartOfWord = js.Any.fromFunction1(gotoStartOfWord), insertDocumentFromURL = js.Any.fromFunction2(insertDocumentFromURL), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfParagraph = js.Any.fromFunction0(isEndOfParagraph), isEndOfSentence = js.Any.fromFunction0(isEndOfSentence), isEndOfWord = js.Any.fromFunction0(isEndOfWord), isStartOfParagraph = js.Any.fromFunction0(isStartOfParagraph), isStartOfSentence = js.Any.fromFunction0(isStartOfSentence), isStartOfWord = js.Any.fromFunction0(isStartOfWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[TextCursor]
  }
  
  extension [Self <: TextCursor](x: Self) {
    
    inline def setCollapseToEnd(value: () => Unit): Self = StObject.set(x, "collapseToEnd", js.Any.fromFunction0(value))
    
    inline def setCollapseToStart(value: () => Unit): Self = StObject.set(x, "collapseToStart", js.Any.fromFunction0(value))
    
    inline def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = StObject.set(x, "getPropertyStates", js.Any.fromFunction1(value))
    
    inline def setGoLeft(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goLeft", js.Any.fromFunction2(value))
    
    inline def setGoRight(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goRight", js.Any.fromFunction2(value))
    
    inline def setGotoEnd(value: Boolean => Unit): Self = StObject.set(x, "gotoEnd", js.Any.fromFunction1(value))
    
    inline def setGotoEndOfParagraph(value: Boolean => Boolean): Self = StObject.set(x, "gotoEndOfParagraph", js.Any.fromFunction1(value))
    
    inline def setGotoEndOfSentence(value: Boolean => Boolean): Self = StObject.set(x, "gotoEndOfSentence", js.Any.fromFunction1(value))
    
    inline def setGotoEndOfWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoEndOfWord", js.Any.fromFunction1(value))
    
    inline def setGotoNextParagraph(value: Boolean => Boolean): Self = StObject.set(x, "gotoNextParagraph", js.Any.fromFunction1(value))
    
    inline def setGotoNextSentence(value: Boolean => Boolean): Self = StObject.set(x, "gotoNextSentence", js.Any.fromFunction1(value))
    
    inline def setGotoNextWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoNextWord", js.Any.fromFunction1(value))
    
    inline def setGotoPreviousParagraph(value: Boolean => Boolean): Self = StObject.set(x, "gotoPreviousParagraph", js.Any.fromFunction1(value))
    
    inline def setGotoPreviousSentence(value: Boolean => Boolean): Self = StObject.set(x, "gotoPreviousSentence", js.Any.fromFunction1(value))
    
    inline def setGotoPreviousWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoPreviousWord", js.Any.fromFunction1(value))
    
    inline def setGotoRange(value: (XTextRange, Boolean) => Unit): Self = StObject.set(x, "gotoRange", js.Any.fromFunction2(value))
    
    inline def setGotoStart(value: Boolean => Unit): Self = StObject.set(x, "gotoStart", js.Any.fromFunction1(value))
    
    inline def setGotoStartOfParagraph(value: Boolean => Boolean): Self = StObject.set(x, "gotoStartOfParagraph", js.Any.fromFunction1(value))
    
    inline def setGotoStartOfSentence(value: Boolean => Boolean): Self = StObject.set(x, "gotoStartOfSentence", js.Any.fromFunction1(value))
    
    inline def setGotoStartOfWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoStartOfWord", js.Any.fromFunction1(value))
    
    inline def setIsCollapsed(value: () => Boolean): Self = StObject.set(x, "isCollapsed", js.Any.fromFunction0(value))
    
    inline def setIsEndOfParagraph(value: () => Boolean): Self = StObject.set(x, "isEndOfParagraph", js.Any.fromFunction0(value))
    
    inline def setIsEndOfSentence(value: () => Boolean): Self = StObject.set(x, "isEndOfSentence", js.Any.fromFunction0(value))
    
    inline def setIsEndOfWord(value: () => Boolean): Self = StObject.set(x, "isEndOfWord", js.Any.fromFunction0(value))
    
    inline def setIsStartOfParagraph(value: () => Boolean): Self = StObject.set(x, "isStartOfParagraph", js.Any.fromFunction0(value))
    
    inline def setIsStartOfSentence(value: () => Boolean): Self = StObject.set(x, "isStartOfSentence", js.Any.fromFunction0(value))
    
    inline def setIsStartOfWord(value: () => Boolean): Self = StObject.set(x, "isStartOfWord", js.Any.fromFunction0(value))
  }
}
