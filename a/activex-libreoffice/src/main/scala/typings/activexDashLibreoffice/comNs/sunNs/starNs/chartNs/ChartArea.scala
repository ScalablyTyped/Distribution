package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Gradient
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.BitmapMode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.Hatch
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineCap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineDash
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineJoint
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.RectanglePoint
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.GraphicCrop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the area elements of a chart, e.g. the background area, the diagram wall, and the diagram floor of three-dimensional charts. */
trait ChartArea
  extends XPropertySet
     with FillProperties
     with LineProperties
     with UserDefinedAttributesSupplier

object ChartArea {
  @scala.inline
  def apply(
    FillBackground: Boolean,
    FillBitmap: XBitmap,
    FillBitmapLogicalSize: Boolean,
    FillBitmapMode: BitmapMode,
    FillBitmapName: String,
    FillBitmapOffsetX: Double,
    FillBitmapOffsetY: Double,
    FillBitmapPositionOffsetX: Double,
    FillBitmapPositionOffsetY: Double,
    FillBitmapRectanglePoint: RectanglePoint,
    FillBitmapSizeX: Double,
    FillBitmapSizeY: Double,
    FillBitmapStretch: Boolean,
    FillBitmapTile: Boolean,
    FillBitmapURL: String,
    FillColor: Color,
    FillGradient: Gradient,
    FillGradientName: String,
    FillHatch: Hatch,
    FillHatchName: String,
    FillStyle: FillStyle,
    FillTransparence: Double,
    FillTransparenceGradient: Gradient,
    FillTransparenceGradientName: String,
    GraphicCrop: GraphicCrop,
    LineCap: LineCap,
    LineColor: Color,
    LineDash: LineDash,
    LineDashName: String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: Boolean,
    LineEndName: String,
    LineEndWidth: Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: Boolean,
    LineStartName: String,
    LineStartWidth: Double,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double,
    PropertySetInfo: XPropertySetInfo,
    UserDefinedAttributes: XNameContainer,
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
  ): ChartArea = {
    val __obj = js.Dynamic.literal(FillBackground = FillBackground, FillBitmap = FillBitmap, FillBitmapLogicalSize = FillBitmapLogicalSize, FillBitmapMode = FillBitmapMode, FillBitmapName = FillBitmapName, FillBitmapOffsetX = FillBitmapOffsetX, FillBitmapOffsetY = FillBitmapOffsetY, FillBitmapPositionOffsetX = FillBitmapPositionOffsetX, FillBitmapPositionOffsetY = FillBitmapPositionOffsetY, FillBitmapRectanglePoint = FillBitmapRectanglePoint, FillBitmapSizeX = FillBitmapSizeX, FillBitmapSizeY = FillBitmapSizeY, FillBitmapStretch = FillBitmapStretch, FillBitmapTile = FillBitmapTile, FillBitmapURL = FillBitmapURL, FillColor = FillColor, FillGradient = FillGradient, FillGradientName = FillGradientName, FillHatch = FillHatch, FillHatchName = FillHatchName, FillStyle = FillStyle, FillTransparence = FillTransparence, FillTransparenceGradient = FillTransparenceGradient, FillTransparenceGradientName = FillTransparenceGradientName, GraphicCrop = GraphicCrop, LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth, PropertySetInfo = PropertySetInfo, UserDefinedAttributes = UserDefinedAttributes, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ChartArea]
  }
}

