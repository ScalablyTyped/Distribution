package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a format condition for a control. */
trait XFormatCondition
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XReportControlFormat {
  /** specifies if the condition is enabled or not. */
  var Enabled: scala.Boolean
  /** defines the formula of the format condition. If the formula evaluates to `TRUE` then the format will be applied. */
  var Formula: java.lang.String
}

object XFormatCondition {
  @scala.inline
  def apply(
    CharAutoKerning: scala.Boolean,
    CharCaseMap: scala.Double,
    CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharCombineIsOn: scala.Boolean,
    CharCombinePrefix: java.lang.String,
    CharCombineSuffix: java.lang.String,
    CharContoured: scala.Boolean,
    CharEmphasis: scala.Double,
    CharEscapement: scala.Double,
    CharEscapementHeight: scala.Double,
    CharFlash: scala.Boolean,
    CharFontCharSet: scala.Double,
    CharFontCharSetAsian: scala.Double,
    CharFontCharSetComplex: scala.Double,
    CharFontFamily: scala.Double,
    CharFontFamilyAsian: scala.Double,
    CharFontFamilyComplex: scala.Double,
    CharFontName: java.lang.String,
    CharFontNameAsian: java.lang.String,
    CharFontNameComplex: java.lang.String,
    CharFontPitch: scala.Double,
    CharFontPitchAsian: scala.Double,
    CharFontPitchComplex: scala.Double,
    CharFontStyleName: java.lang.String,
    CharFontStyleNameAsian: java.lang.String,
    CharFontStyleNameComplex: java.lang.String,
    CharHeight: scala.Double,
    CharHeightAsian: scala.Double,
    CharHeightComplex: scala.Double,
    CharHidden: scala.Boolean,
    CharKerning: scala.Double,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPostureAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharPostureComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharRelief: scala.Double,
    CharRotation: scala.Double,
    CharScaleWidth: scala.Double,
    CharShadowed: scala.Boolean,
    CharStrikeout: scala.Double,
    CharUnderline: scala.Double,
    CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharWeight: scala.Double,
    CharWeightAsian: scala.Double,
    CharWeightComplex: scala.Double,
    CharWordMode: scala.Boolean,
    ControlBackground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ControlBackgroundTransparent: scala.Boolean,
    ControlTextEmphasis: scala.Double,
    Enabled: scala.Boolean,
    FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontDescriptorAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontDescriptorComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    Formula: java.lang.String,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    ParaAdjust: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    UnvisitedCharStyleName: java.lang.String,
    VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment,
    VisitedCharStyleName: java.lang.String,
    acquire: js.Function0[scala.Unit],
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
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XFormatCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CharAutoKerning")(CharAutoKerning)
    __obj.updateDynamic("CharCaseMap")(CharCaseMap)
    __obj.updateDynamic("CharColor")(CharColor)
    __obj.updateDynamic("CharCombineIsOn")(CharCombineIsOn)
    __obj.updateDynamic("CharCombinePrefix")(CharCombinePrefix)
    __obj.updateDynamic("CharCombineSuffix")(CharCombineSuffix)
    __obj.updateDynamic("CharContoured")(CharContoured)
    __obj.updateDynamic("CharEmphasis")(CharEmphasis)
    __obj.updateDynamic("CharEscapement")(CharEscapement)
    __obj.updateDynamic("CharEscapementHeight")(CharEscapementHeight)
    __obj.updateDynamic("CharFlash")(CharFlash)
    __obj.updateDynamic("CharFontCharSet")(CharFontCharSet)
    __obj.updateDynamic("CharFontCharSetAsian")(CharFontCharSetAsian)
    __obj.updateDynamic("CharFontCharSetComplex")(CharFontCharSetComplex)
    __obj.updateDynamic("CharFontFamily")(CharFontFamily)
    __obj.updateDynamic("CharFontFamilyAsian")(CharFontFamilyAsian)
    __obj.updateDynamic("CharFontFamilyComplex")(CharFontFamilyComplex)
    __obj.updateDynamic("CharFontName")(CharFontName)
    __obj.updateDynamic("CharFontNameAsian")(CharFontNameAsian)
    __obj.updateDynamic("CharFontNameComplex")(CharFontNameComplex)
    __obj.updateDynamic("CharFontPitch")(CharFontPitch)
    __obj.updateDynamic("CharFontPitchAsian")(CharFontPitchAsian)
    __obj.updateDynamic("CharFontPitchComplex")(CharFontPitchComplex)
    __obj.updateDynamic("CharFontStyleName")(CharFontStyleName)
    __obj.updateDynamic("CharFontStyleNameAsian")(CharFontStyleNameAsian)
    __obj.updateDynamic("CharFontStyleNameComplex")(CharFontStyleNameComplex)
    __obj.updateDynamic("CharHeight")(CharHeight)
    __obj.updateDynamic("CharHeightAsian")(CharHeightAsian)
    __obj.updateDynamic("CharHeightComplex")(CharHeightComplex)
    __obj.updateDynamic("CharHidden")(CharHidden)
    __obj.updateDynamic("CharKerning")(CharKerning)
    __obj.updateDynamic("CharLocale")(CharLocale)
    __obj.updateDynamic("CharLocaleAsian")(CharLocaleAsian)
    __obj.updateDynamic("CharLocaleComplex")(CharLocaleComplex)
    __obj.updateDynamic("CharPosture")(CharPosture)
    __obj.updateDynamic("CharPostureAsian")(CharPostureAsian)
    __obj.updateDynamic("CharPostureComplex")(CharPostureComplex)
    __obj.updateDynamic("CharRelief")(CharRelief)
    __obj.updateDynamic("CharRotation")(CharRotation)
    __obj.updateDynamic("CharScaleWidth")(CharScaleWidth)
    __obj.updateDynamic("CharShadowed")(CharShadowed)
    __obj.updateDynamic("CharStrikeout")(CharStrikeout)
    __obj.updateDynamic("CharUnderline")(CharUnderline)
    __obj.updateDynamic("CharUnderlineColor")(CharUnderlineColor)
    __obj.updateDynamic("CharWeight")(CharWeight)
    __obj.updateDynamic("CharWeightAsian")(CharWeightAsian)
    __obj.updateDynamic("CharWeightComplex")(CharWeightComplex)
    __obj.updateDynamic("CharWordMode")(CharWordMode)
    __obj.updateDynamic("ControlBackground")(ControlBackground)
    __obj.updateDynamic("ControlBackgroundTransparent")(ControlBackgroundTransparent)
    __obj.updateDynamic("ControlTextEmphasis")(ControlTextEmphasis)
    __obj.updateDynamic("Enabled")(Enabled)
    __obj.updateDynamic("FontDescriptor")(FontDescriptor)
    __obj.updateDynamic("FontDescriptorAsian")(FontDescriptorAsian)
    __obj.updateDynamic("FontDescriptorComplex")(FontDescriptorComplex)
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("HyperLinkName")(HyperLinkName)
    __obj.updateDynamic("HyperLinkTarget")(HyperLinkTarget)
    __obj.updateDynamic("HyperLinkURL")(HyperLinkURL)
    __obj.updateDynamic("ParaAdjust")(ParaAdjust)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("UnvisitedCharStyleName")(UnvisitedCharStyleName)
    __obj.updateDynamic("VerticalAlign")(VerticalAlign)
    __obj.updateDynamic("VisitedCharStyleName")(VisitedCharStyleName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[XFormatCondition]
  }
}

