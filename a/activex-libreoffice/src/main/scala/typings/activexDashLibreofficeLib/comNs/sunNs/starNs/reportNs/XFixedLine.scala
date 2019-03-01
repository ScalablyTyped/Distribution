package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XFixedLine extends XReportControlModel {
  /** This property contains the line color. */
  var LineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** This property contains the dash of the line. */
  var LineDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash
  /** This property contains the type of the line. */
  var LineStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle
  /** This property contains the extent of transparency. */
  var LineTransparence: scala.Double
  /** This property contains the width of the line in 1/100th mm. */
  var LineWidth: scala.Double
  /**
    * specifies the orientation of the control.
    *
    * `; 0: horizontal; 1: vertical (default); `
    */
  var Orientation: scala.Double
}

object XFixedLine {
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
    ConditionalPrintExpression: java.lang.String,
    ControlBackground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ControlBackgroundTransparent: scala.Boolean,
    ControlBorder: scala.Double,
    ControlBorderColor: scala.Double,
    ControlTextEmphasis: scala.Double,
    Count: scala.Double,
    DataField: java.lang.String,
    DetailFields: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontDescriptorAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontDescriptorComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    Height: scala.Double,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    LineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    LineDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash,
    LineStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle,
    LineTransparence: scala.Double,
    LineWidth: scala.Double,
    MasterFields: activexDashInteropLib.SafeArray[java.lang.String],
    Name: java.lang.String,
    Orientation: scala.Double,
    ParaAdjust: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionX: scala.Double,
    PositionY: scala.Double,
    PrintRepeatedValues: scala.Boolean,
    PrintWhenGroupChange: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Section: XSection,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    UnvisitedCharStyleName: java.lang.String,
    VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment,
    VisitedCharStyleName: java.lang.String,
    Width: scala.Double,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
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
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    createFormatCondition: js.Function0[XFormatCondition],
    dispose: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
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
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): XFixedLine = {
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
    __obj.updateDynamic("ConditionalPrintExpression")(ConditionalPrintExpression)
    __obj.updateDynamic("ControlBackground")(ControlBackground)
    __obj.updateDynamic("ControlBackgroundTransparent")(ControlBackgroundTransparent)
    __obj.updateDynamic("ControlBorder")(ControlBorder)
    __obj.updateDynamic("ControlBorderColor")(ControlBorderColor)
    __obj.updateDynamic("ControlTextEmphasis")(ControlTextEmphasis)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("DataField")(DataField)
    __obj.updateDynamic("DetailFields")(DetailFields)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("FontDescriptor")(FontDescriptor)
    __obj.updateDynamic("FontDescriptorAsian")(FontDescriptorAsian)
    __obj.updateDynamic("FontDescriptorComplex")(FontDescriptorComplex)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("HyperLinkName")(HyperLinkName)
    __obj.updateDynamic("HyperLinkTarget")(HyperLinkTarget)
    __obj.updateDynamic("HyperLinkURL")(HyperLinkURL)
    __obj.updateDynamic("LineColor")(LineColor)
    __obj.updateDynamic("LineDash")(LineDash)
    __obj.updateDynamic("LineStyle")(LineStyle)
    __obj.updateDynamic("LineTransparence")(LineTransparence)
    __obj.updateDynamic("LineWidth")(LineWidth)
    __obj.updateDynamic("MasterFields")(MasterFields)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("ParaAdjust")(ParaAdjust)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PositionX")(PositionX)
    __obj.updateDynamic("PositionY")(PositionY)
    __obj.updateDynamic("PrintRepeatedValues")(PrintRepeatedValues)
    __obj.updateDynamic("PrintWhenGroupChange")(PrintWhenGroupChange)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Section")(Section)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("UnvisitedCharStyleName")(UnvisitedCharStyleName)
    __obj.updateDynamic("VerticalAlign")(VerticalAlign)
    __obj.updateDynamic("VisitedCharStyleName")(VisitedCharStyleName)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addContainerListener")(addContainerListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createClone")(createClone)
    __obj.updateDynamic("createFormatCondition")(createFormatCondition)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertByIndex")(insertByIndex)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByIndex")(removeByIndex)
    __obj.updateDynamic("removeContainerListener")(removeContainerListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("replaceByIndex")(replaceByIndex)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[XFixedLine]
  }
}

