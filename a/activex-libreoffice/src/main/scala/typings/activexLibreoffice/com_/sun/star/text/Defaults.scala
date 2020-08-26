package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.style.BreakType
import typings.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typings.activexLibreoffice.com_.sun.star.style.DropCapFormat
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.style.LineSpacing
import typings.activexLibreoffice.com_.sun.star.style.ParagraphAdjust
import typings.activexLibreoffice.com_.sun.star.style.ParagraphProperties
import typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesComplex
import typings.activexLibreoffice.com_.sun.star.style.TabStop
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.BorderLine2
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides default settings of a text component for paragraph and character properties. */
@js.native
trait Defaults
  extends XPropertySet
     with CharacterProperties
     with ParagraphProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with ParagraphPropertiesAsian
     with ParagraphPropertiesComplex {
  /** default tab-distance to be used. */
  var TabStopDistance: Double = js.native
}

object Defaults {
  @scala.inline
  def apply(
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
    TabStopDistance: Double,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UnvisitedCharStyleName: String,
    VisitedCharStyleName: String,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Defaults = {
    val __obj = js.Dynamic.literal(BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsCharacterDistance = ParaIsCharacterDistance.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsForbiddenRules = ParaIsForbiddenRules.asInstanceOf[js.Any], ParaIsHangingPunctuation = ParaIsHangingPunctuation.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], TabStopDistance = TabStopDistance.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Defaults]
  }
  @scala.inline
  implicit class DefaultsOps[Self <: Defaults] (val x: Self) extends AnyVal {
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
    def setTabStopDistance(value: Double): Self = this.set("TabStopDistance", value.asInstanceOf[js.Any])
  }
  
}

