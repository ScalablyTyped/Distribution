package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a style sheet for characters within a {@link com.sun.star.text.Text} . */
trait CharacterStyle
  extends Style
     with CharacterProperties {
  /** This value contains the character height as difference in point to the height of the character in the parent style. */
  var CharDiffHeight: scala.Double
  /** This value contains the character height as difference in point to the height of the character in the parent style in Asian text. */
  var CharDiffHeightAsian: scala.Double
  /** This value contains the character height as difference in point to the height of the character in the parent style in complex text. */
  var CharDiffHeightComplex: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style. */
  var CharPropHeight: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style in Asian text. */
  var CharPropHeightAsian: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style in complex text. */
  var CharPropHeightComplex: scala.Double
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

object CharacterStyle {
  @scala.inline
  def apply(
    CharAutoKerning: scala.Boolean,
    CharBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharBackTransparent: scala.Boolean,
    CharBorderDistance: scala.Double,
    CharBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharBottomBorderDistance: scala.Double,
    CharCaseMap: scala.Double,
    CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharCombineIsOn: scala.Boolean,
    CharCombinePrefix: java.lang.String,
    CharCombineSuffix: java.lang.String,
    CharContoured: scala.Boolean,
    CharCrossedOut: scala.Boolean,
    CharDiffHeight: scala.Double,
    CharDiffHeightAsian: scala.Double,
    CharDiffHeightComplex: scala.Double,
    CharEmphasis: scala.Double,
    CharEscapement: scala.Double,
    CharEscapementHeight: scala.Double,
    CharFlash: scala.Boolean,
    CharFontCharSet: scala.Double,
    CharFontFamily: scala.Double,
    CharFontName: java.lang.String,
    CharFontPitch: scala.Double,
    CharFontStyleName: java.lang.String,
    CharFontType: scala.Double,
    CharHeight: scala.Double,
    CharHidden: scala.Boolean,
    CharHighlight: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CharKeepTogether: scala.Boolean,
    CharKerning: scala.Double,
    CharLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharLeftBorderDistance: scala.Double,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharNoHyphenation: scala.Boolean,
    CharNoLineBreak: scala.Boolean,
    CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPropHeight: scala.Double,
    CharPropHeightAsian: scala.Double,
    CharPropHeightComplex: scala.Double,
    CharRelief: scala.Double,
    CharRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharRightBorderDistance: scala.Double,
    CharRotation: scala.Double,
    CharRotationIsFitToLine: scala.Boolean,
    CharScaleWidth: scala.Double,
    CharShadingValue: scala.Double,
    CharShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    CharShadowed: scala.Boolean,
    CharStrikeout: scala.Double,
    CharStyleName: java.lang.String,
    CharStyleNames: activexDashInteropLib.SafeArray[java.lang.String],
    CharTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharTopBorderDistance: scala.Double,
    CharUnderline: scala.Double,
    CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharUnderlineHasColor: scala.Boolean,
    CharWeight: scala.Double,
    CharWordMode: scala.Boolean,
    DisplayName: java.lang.String,
    FollowStyle: java.lang.String,
    Hidden: scala.Boolean,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    IsAutoUpdate: java.lang.String,
    IsPhysical: scala.Boolean,
    Name: java.lang.String,
    ParaStyleConditions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ParentStyle: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RubyAdjust: scala.Double,
    RubyCharStyleName: java.lang.String,
    RubyIsAbove: scala.Boolean,
    RubyText: java.lang.String,
    StyleInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    TextUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    UnvisitedCharStyleName: java.lang.String,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    VisitedCharStyleName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
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
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getName: js.Function0[java.lang.String],
    getParentStyle: js.Function0[java.lang.String],
    getPropertyDefaults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    isInUse: js.Function0[scala.Boolean],
    isUserDefined: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
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
    setAllPropertiesToDefault: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParentStyle: js.Function1[java.lang.String, scala.Unit],
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ]
  ): CharacterStyle = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharDiffHeight = CharDiffHeight, CharDiffHeightAsian = CharDiffHeightAsian, CharDiffHeightComplex = CharDiffHeightComplex, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontFamily = CharFontFamily, CharFontName = CharFontName, CharFontPitch = CharFontPitch, CharFontStyleName = CharFontStyleName, CharFontType = CharFontType, CharHeight = CharHeight, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharPropHeight = CharPropHeight, CharPropHeightAsian = CharPropHeightAsian, CharPropHeightComplex = CharPropHeightComplex, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWordMode = CharWordMode, DisplayName = DisplayName, FollowStyle = FollowStyle, Hidden = Hidden, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, IsAutoUpdate = IsAutoUpdate, IsPhysical = IsPhysical, Name = Name, ParaStyleConditions = ParaStyleConditions, ParentStyle = ParentStyle, PropertySetInfo = PropertySetInfo, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, StyleInteropGrabBag = StyleInteropGrabBag, TextUserDefinedAttributes = TextUserDefinedAttributes, UnvisitedCharStyleName = UnvisitedCharStyleName, UserDefinedAttributes = UserDefinedAttributes, VisitedCharStyleName = VisitedCharStyleName, acquire = acquire, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, firePropertiesChangeEvent = firePropertiesChangeEvent, getName = getName, getParentStyle = getParentStyle, getPropertyDefaults = getPropertyDefaults, getPropertySetInfo = getPropertySetInfo, getPropertyStates = getPropertyStates, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, isInUse = isInUse, isUserDefined = isUserDefined, queryInterface = queryInterface, release = release, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setAllPropertiesToDefault = setAllPropertiesToDefault, setName = setName, setParentStyle = setParentStyle, setPropertiesToDefault = setPropertiesToDefault, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues)
  
    __obj.asInstanceOf[CharacterStyle]
  }
}

