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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CharAutoKerning")(CharAutoKerning)
    __obj.updateDynamic("CharBackColor")(CharBackColor)
    __obj.updateDynamic("CharBackTransparent")(CharBackTransparent)
    __obj.updateDynamic("CharBorderDistance")(CharBorderDistance)
    __obj.updateDynamic("CharBottomBorder")(CharBottomBorder)
    __obj.updateDynamic("CharBottomBorderDistance")(CharBottomBorderDistance)
    __obj.updateDynamic("CharCaseMap")(CharCaseMap)
    __obj.updateDynamic("CharColor")(CharColor)
    __obj.updateDynamic("CharCombineIsOn")(CharCombineIsOn)
    __obj.updateDynamic("CharCombinePrefix")(CharCombinePrefix)
    __obj.updateDynamic("CharCombineSuffix")(CharCombineSuffix)
    __obj.updateDynamic("CharContoured")(CharContoured)
    __obj.updateDynamic("CharCrossedOut")(CharCrossedOut)
    __obj.updateDynamic("CharDiffHeight")(CharDiffHeight)
    __obj.updateDynamic("CharDiffHeightAsian")(CharDiffHeightAsian)
    __obj.updateDynamic("CharDiffHeightComplex")(CharDiffHeightComplex)
    __obj.updateDynamic("CharEmphasis")(CharEmphasis)
    __obj.updateDynamic("CharEscapement")(CharEscapement)
    __obj.updateDynamic("CharEscapementHeight")(CharEscapementHeight)
    __obj.updateDynamic("CharFlash")(CharFlash)
    __obj.updateDynamic("CharFontCharSet")(CharFontCharSet)
    __obj.updateDynamic("CharFontFamily")(CharFontFamily)
    __obj.updateDynamic("CharFontName")(CharFontName)
    __obj.updateDynamic("CharFontPitch")(CharFontPitch)
    __obj.updateDynamic("CharFontStyleName")(CharFontStyleName)
    __obj.updateDynamic("CharFontType")(CharFontType)
    __obj.updateDynamic("CharHeight")(CharHeight)
    __obj.updateDynamic("CharHidden")(CharHidden)
    __obj.updateDynamic("CharHighlight")(CharHighlight)
    __obj.updateDynamic("CharInteropGrabBag")(CharInteropGrabBag)
    __obj.updateDynamic("CharKeepTogether")(CharKeepTogether)
    __obj.updateDynamic("CharKerning")(CharKerning)
    __obj.updateDynamic("CharLeftBorder")(CharLeftBorder)
    __obj.updateDynamic("CharLeftBorderDistance")(CharLeftBorderDistance)
    __obj.updateDynamic("CharLocale")(CharLocale)
    __obj.updateDynamic("CharNoHyphenation")(CharNoHyphenation)
    __obj.updateDynamic("CharNoLineBreak")(CharNoLineBreak)
    __obj.updateDynamic("CharPosture")(CharPosture)
    __obj.updateDynamic("CharPropHeight")(CharPropHeight)
    __obj.updateDynamic("CharPropHeightAsian")(CharPropHeightAsian)
    __obj.updateDynamic("CharPropHeightComplex")(CharPropHeightComplex)
    __obj.updateDynamic("CharRelief")(CharRelief)
    __obj.updateDynamic("CharRightBorder")(CharRightBorder)
    __obj.updateDynamic("CharRightBorderDistance")(CharRightBorderDistance)
    __obj.updateDynamic("CharRotation")(CharRotation)
    __obj.updateDynamic("CharRotationIsFitToLine")(CharRotationIsFitToLine)
    __obj.updateDynamic("CharScaleWidth")(CharScaleWidth)
    __obj.updateDynamic("CharShadingValue")(CharShadingValue)
    __obj.updateDynamic("CharShadowFormat")(CharShadowFormat)
    __obj.updateDynamic("CharShadowed")(CharShadowed)
    __obj.updateDynamic("CharStrikeout")(CharStrikeout)
    __obj.updateDynamic("CharStyleName")(CharStyleName)
    __obj.updateDynamic("CharStyleNames")(CharStyleNames)
    __obj.updateDynamic("CharTopBorder")(CharTopBorder)
    __obj.updateDynamic("CharTopBorderDistance")(CharTopBorderDistance)
    __obj.updateDynamic("CharUnderline")(CharUnderline)
    __obj.updateDynamic("CharUnderlineColor")(CharUnderlineColor)
    __obj.updateDynamic("CharUnderlineHasColor")(CharUnderlineHasColor)
    __obj.updateDynamic("CharWeight")(CharWeight)
    __obj.updateDynamic("CharWordMode")(CharWordMode)
    __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.updateDynamic("FollowStyle")(FollowStyle)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("HyperLinkName")(HyperLinkName)
    __obj.updateDynamic("HyperLinkTarget")(HyperLinkTarget)
    __obj.updateDynamic("HyperLinkURL")(HyperLinkURL)
    __obj.updateDynamic("IsAutoUpdate")(IsAutoUpdate)
    __obj.updateDynamic("IsPhysical")(IsPhysical)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ParaStyleConditions")(ParaStyleConditions)
    __obj.updateDynamic("ParentStyle")(ParentStyle)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RubyAdjust")(RubyAdjust)
    __obj.updateDynamic("RubyCharStyleName")(RubyCharStyleName)
    __obj.updateDynamic("RubyIsAbove")(RubyIsAbove)
    __obj.updateDynamic("RubyText")(RubyText)
    __obj.updateDynamic("StyleInteropGrabBag")(StyleInteropGrabBag)
    __obj.updateDynamic("TextUserDefinedAttributes")(TextUserDefinedAttributes)
    __obj.updateDynamic("UnvisitedCharStyleName")(UnvisitedCharStyleName)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("VisitedCharStyleName")(VisitedCharStyleName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertiesChangeListener")(addPropertiesChangeListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("firePropertiesChangeEvent")(firePropertiesChangeEvent)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParentStyle")(getParentStyle)
    __obj.updateDynamic("getPropertyDefaults")(getPropertyDefaults)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyStates")(getPropertyStates)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValues")(getPropertyValues)
    __obj.updateDynamic("isInUse")(isInUse)
    __obj.updateDynamic("isUserDefined")(isUserDefined)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertiesChangeListener")(removePropertiesChangeListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setAllPropertiesToDefault")(setAllPropertiesToDefault)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParentStyle")(setParentStyle)
    __obj.updateDynamic("setPropertiesToDefault")(setPropertiesToDefault)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValues")(setPropertyValues)
    __obj.asInstanceOf[CharacterStyle]
  }
}

