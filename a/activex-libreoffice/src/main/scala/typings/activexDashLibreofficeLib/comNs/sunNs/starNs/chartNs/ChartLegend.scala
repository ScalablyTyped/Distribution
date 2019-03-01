package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the legend of a chart.
  *
  * The text/font properties which are specified in the service {@link com.sun.star.drawing.Shape} correlate to all text objects inside the legend.
  */
trait ChartLegend
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier {
  /** determines the alignment of the legend relative to the diagram. */
  var Alignment: ChartLegendPosition
  /**
    * If this property is `TRUE` the position is calculated by the application automatically. Setting this property to false will have no effect. Instead
    * use the interface {@link com.sun.star.drawing.XShape} to set a concrete position.
    */
  var AutomaticPosition: scala.Boolean
}

object ChartLegend {
  @scala.inline
  def apply(
    Alignment: ChartLegendPosition,
    AutomaticPosition: scala.Boolean,
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
    GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    Hyperlink: java.lang.String,
    InteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    LayerID: scala.Double,
    LayerName: java.lang.String,
    MoveProtect: scala.Boolean,
    Name: java.lang.String,
    NavigationOrder: scala.Double,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RelativeHeight: scala.Double,
    RelativeHeightRelation: scala.Double,
    RelativeWidth: scala.Double,
    RelativeWidthRelation: scala.Double,
    RubyAdjust: scala.Double,
    RubyCharStyleName: java.lang.String,
    RubyIsAbove: scala.Boolean,
    RubyText: java.lang.String,
    ShapeType: java.lang.String,
    ShapeUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SizeProtect: scala.Boolean,
    Style: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyle,
    TextUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3,
    UnvisitedCharStyleName: java.lang.String,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Visible: scala.Boolean,
    VisitedCharStyleName: java.lang.String,
    ZOrder: scala.Double,
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
    dispose: js.Function0[scala.Unit],
    getDirectPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[
        activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.GetDirectPropertyTolerantResult
      ]
    ],
    getGluePoints: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.GetPropertyTolerantResult]
    ],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
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
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValuesTolerant: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed]
    ],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): ChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Alignment")(Alignment)
    __obj.updateDynamic("AutomaticPosition")(AutomaticPosition)
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
    __obj.updateDynamic("GluePoints")(GluePoints)
    __obj.updateDynamic("HyperLinkName")(HyperLinkName)
    __obj.updateDynamic("HyperLinkTarget")(HyperLinkTarget)
    __obj.updateDynamic("HyperLinkURL")(HyperLinkURL)
    __obj.updateDynamic("Hyperlink")(Hyperlink)
    __obj.updateDynamic("InteropGrabBag")(InteropGrabBag)
    __obj.updateDynamic("LayerID")(LayerID)
    __obj.updateDynamic("LayerName")(LayerName)
    __obj.updateDynamic("MoveProtect")(MoveProtect)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NavigationOrder")(NavigationOrder)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("Printable")(Printable)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RelativeHeight")(RelativeHeight)
    __obj.updateDynamic("RelativeHeightRelation")(RelativeHeightRelation)
    __obj.updateDynamic("RelativeWidth")(RelativeWidth)
    __obj.updateDynamic("RelativeWidthRelation")(RelativeWidthRelation)
    __obj.updateDynamic("RubyAdjust")(RubyAdjust)
    __obj.updateDynamic("RubyCharStyleName")(RubyCharStyleName)
    __obj.updateDynamic("RubyIsAbove")(RubyIsAbove)
    __obj.updateDynamic("RubyText")(RubyText)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("ShapeUserDefinedAttributes")(ShapeUserDefinedAttributes)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("SizeProtect")(SizeProtect)
    __obj.updateDynamic("Style")(Style)
    __obj.updateDynamic("TextUserDefinedAttributes")(TextUserDefinedAttributes)
    __obj.updateDynamic("Transformation")(Transformation)
    __obj.updateDynamic("UnvisitedCharStyleName")(UnvisitedCharStyleName)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Visible")(Visible)
    __obj.updateDynamic("VisitedCharStyleName")(VisitedCharStyleName)
    __obj.updateDynamic("ZOrder")(ZOrder)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getDirectPropertyValuesTolerant")(getDirectPropertyValuesTolerant)
    __obj.updateDynamic("getGluePoints")(getGluePoints)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValuesTolerant")(getPropertyValuesTolerant)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValuesTolerant")(setPropertyValuesTolerant)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[ChartLegend]
  }
}

