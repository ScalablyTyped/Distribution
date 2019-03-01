package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies all the properties for the graphic object of a data point (e.g., a single bar in a bar chart).
  *
  * Text properties correlate to the data description of the data point. There is a similar service for a group of graphic elements called {@link
  * ChartDataRowProperties} for the properties of whole data rows.
  * @see ChartDataRowProperties
  */
trait ChartDataPointProperties
  extends Chart3DBarProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier {
  /**
    * specifies how the captions of data points are displayed.
    * @see ChartDataCaption
    */
  var DataCaption: scala.Double
  /**
    * specifies a relative position for the data label
    * @see DataLabelPlacement
    */
  var LabelPlacement: scala.Double
  /** specifies a string that is used to separate the parts of a data label (caption) */
  var LabelSeparator: java.lang.String
  /** specifies a number format for the display of the value in the data label */
  var NumberFormat: scala.Double
  /** specifies a number format for the display of the percentage value in the data label */
  var PercentageNumberFormat: scala.Double
  /** the offset by which pie segments in a {@link PieDiagram} are dragged outside from the center. This value is given in percent of the radius. */
  var SegmentOffset: scala.Double
  /**
    * In charts that support symbols, you can set this property to any valid URL that points to a graphic file. This graphic is then used as symbol for each
    * data point.
    *
    * When you query this value you get an internal URL of the embedded graphic.
    * @see ChartSymbolType
    */
  var SymbolBitmapURL: java.lang.String
  /**
    * specifies the type of symbols if the current chart type supports the usage of symbols.
    * @see ChartSymbolType
    */
  var SymbolType: scala.Double
  /**
    * specifies if the text of a data label (caption) must be wrapped
    * @since LibreOffice 5.1
    */
  var TextWordWrap: scala.Boolean
}

object ChartDataPointProperties {
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
    DataCaption: scala.Double,
    FillBackground: scala.Boolean,
    FillBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap,
    FillBitmapLogicalSize: scala.Boolean,
    FillBitmapMode: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapMode,
    FillBitmapName: java.lang.String,
    FillBitmapOffsetX: scala.Double,
    FillBitmapOffsetY: scala.Double,
    FillBitmapPositionOffsetX: scala.Double,
    FillBitmapPositionOffsetY: scala.Double,
    FillBitmapRectanglePoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint,
    FillBitmapSizeX: scala.Double,
    FillBitmapSizeY: scala.Double,
    FillBitmapStretch: scala.Boolean,
    FillBitmapTile: scala.Boolean,
    FillBitmapURL: java.lang.String,
    FillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FillGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillGradientName: java.lang.String,
    FillHatch: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Hatch,
    FillHatchName: java.lang.String,
    FillStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle,
    FillTransparence: scala.Double,
    FillTransparenceGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillTransparenceGradientName: java.lang.String,
    GraphicCrop: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GraphicCrop,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    LabelPlacement: scala.Double,
    LabelSeparator: java.lang.String,
    LineCap: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap,
    LineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    LineDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash,
    LineDashName: java.lang.String,
    LineEnd: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords,
    LineEndCenter: scala.Boolean,
    LineEndName: java.lang.String,
    LineEndWidth: scala.Double,
    LineJoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint,
    LineStart: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords,
    LineStartCenter: scala.Boolean,
    LineStartName: java.lang.String,
    LineStartWidth: scala.Double,
    LineStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle,
    LineTransparence: scala.Double,
    LineWidth: scala.Double,
    NumberFormat: scala.Double,
    PercentageNumberFormat: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RubyAdjust: scala.Double,
    RubyCharStyleName: java.lang.String,
    RubyIsAbove: scala.Boolean,
    RubyText: java.lang.String,
    SegmentOffset: scala.Double,
    SolidType: scala.Double,
    SymbolBitmapURL: java.lang.String,
    SymbolType: scala.Double,
    TextUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    TextWordWrap: scala.Boolean,
    UnvisitedCharStyleName: java.lang.String,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
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
  ): ChartDataPointProperties = {
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
    __obj.updateDynamic("DataCaption")(DataCaption)
    __obj.updateDynamic("FillBackground")(FillBackground)
    __obj.updateDynamic("FillBitmap")(FillBitmap)
    __obj.updateDynamic("FillBitmapLogicalSize")(FillBitmapLogicalSize)
    __obj.updateDynamic("FillBitmapMode")(FillBitmapMode)
    __obj.updateDynamic("FillBitmapName")(FillBitmapName)
    __obj.updateDynamic("FillBitmapOffsetX")(FillBitmapOffsetX)
    __obj.updateDynamic("FillBitmapOffsetY")(FillBitmapOffsetY)
    __obj.updateDynamic("FillBitmapPositionOffsetX")(FillBitmapPositionOffsetX)
    __obj.updateDynamic("FillBitmapPositionOffsetY")(FillBitmapPositionOffsetY)
    __obj.updateDynamic("FillBitmapRectanglePoint")(FillBitmapRectanglePoint)
    __obj.updateDynamic("FillBitmapSizeX")(FillBitmapSizeX)
    __obj.updateDynamic("FillBitmapSizeY")(FillBitmapSizeY)
    __obj.updateDynamic("FillBitmapStretch")(FillBitmapStretch)
    __obj.updateDynamic("FillBitmapTile")(FillBitmapTile)
    __obj.updateDynamic("FillBitmapURL")(FillBitmapURL)
    __obj.updateDynamic("FillColor")(FillColor)
    __obj.updateDynamic("FillGradient")(FillGradient)
    __obj.updateDynamic("FillGradientName")(FillGradientName)
    __obj.updateDynamic("FillHatch")(FillHatch)
    __obj.updateDynamic("FillHatchName")(FillHatchName)
    __obj.updateDynamic("FillStyle")(FillStyle)
    __obj.updateDynamic("FillTransparence")(FillTransparence)
    __obj.updateDynamic("FillTransparenceGradient")(FillTransparenceGradient)
    __obj.updateDynamic("FillTransparenceGradientName")(FillTransparenceGradientName)
    __obj.updateDynamic("GraphicCrop")(GraphicCrop)
    __obj.updateDynamic("HyperLinkName")(HyperLinkName)
    __obj.updateDynamic("HyperLinkTarget")(HyperLinkTarget)
    __obj.updateDynamic("HyperLinkURL")(HyperLinkURL)
    __obj.updateDynamic("LabelPlacement")(LabelPlacement)
    __obj.updateDynamic("LabelSeparator")(LabelSeparator)
    __obj.updateDynamic("LineCap")(LineCap)
    __obj.updateDynamic("LineColor")(LineColor)
    __obj.updateDynamic("LineDash")(LineDash)
    __obj.updateDynamic("LineDashName")(LineDashName)
    __obj.updateDynamic("LineEnd")(LineEnd)
    __obj.updateDynamic("LineEndCenter")(LineEndCenter)
    __obj.updateDynamic("LineEndName")(LineEndName)
    __obj.updateDynamic("LineEndWidth")(LineEndWidth)
    __obj.updateDynamic("LineJoint")(LineJoint)
    __obj.updateDynamic("LineStart")(LineStart)
    __obj.updateDynamic("LineStartCenter")(LineStartCenter)
    __obj.updateDynamic("LineStartName")(LineStartName)
    __obj.updateDynamic("LineStartWidth")(LineStartWidth)
    __obj.updateDynamic("LineStyle")(LineStyle)
    __obj.updateDynamic("LineTransparence")(LineTransparence)
    __obj.updateDynamic("LineWidth")(LineWidth)
    __obj.updateDynamic("NumberFormat")(NumberFormat)
    __obj.updateDynamic("PercentageNumberFormat")(PercentageNumberFormat)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RubyAdjust")(RubyAdjust)
    __obj.updateDynamic("RubyCharStyleName")(RubyCharStyleName)
    __obj.updateDynamic("RubyIsAbove")(RubyIsAbove)
    __obj.updateDynamic("RubyText")(RubyText)
    __obj.updateDynamic("SegmentOffset")(SegmentOffset)
    __obj.updateDynamic("SolidType")(SolidType)
    __obj.updateDynamic("SymbolBitmapURL")(SymbolBitmapURL)
    __obj.updateDynamic("SymbolType")(SymbolType)
    __obj.updateDynamic("TextUserDefinedAttributes")(TextUserDefinedAttributes)
    __obj.updateDynamic("TextWordWrap")(TextWordWrap)
    __obj.updateDynamic("UnvisitedCharStyleName")(UnvisitedCharStyleName)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
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
    __obj.asInstanceOf[ChartDataPointProperties]
  }
}

