package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the area elements of a chart, e.g. the background area, the diagram wall, and the diagram floor of three-dimensional charts. */
trait ChartArea
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier

object ChartArea {
  @scala.inline
  def apply(
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
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
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
  ): ChartArea = {
    val __obj = js.Dynamic.literal(FillBackground = FillBackground, FillBitmap = FillBitmap, FillBitmapLogicalSize = FillBitmapLogicalSize, FillBitmapMode = FillBitmapMode, FillBitmapName = FillBitmapName, FillBitmapOffsetX = FillBitmapOffsetX, FillBitmapOffsetY = FillBitmapOffsetY, FillBitmapPositionOffsetX = FillBitmapPositionOffsetX, FillBitmapPositionOffsetY = FillBitmapPositionOffsetY, FillBitmapRectanglePoint = FillBitmapRectanglePoint, FillBitmapSizeX = FillBitmapSizeX, FillBitmapSizeY = FillBitmapSizeY, FillBitmapStretch = FillBitmapStretch, FillBitmapTile = FillBitmapTile, FillBitmapURL = FillBitmapURL, FillColor = FillColor, FillGradient = FillGradient, FillGradientName = FillGradientName, FillHatch = FillHatch, FillHatchName = FillHatchName, FillStyle = FillStyle, FillTransparence = FillTransparence, FillTransparenceGradient = FillTransparenceGradient, FillTransparenceGradientName = FillTransparenceGradientName, GraphicCrop = GraphicCrop, LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth, PropertySetInfo = PropertySetInfo, UserDefinedAttributes = UserDefinedAttributes, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[ChartArea]
  }
}

