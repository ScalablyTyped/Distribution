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
    val __obj = js.Dynamic.literal()
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
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
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
    __obj.asInstanceOf[ChartArea]
  }
}

