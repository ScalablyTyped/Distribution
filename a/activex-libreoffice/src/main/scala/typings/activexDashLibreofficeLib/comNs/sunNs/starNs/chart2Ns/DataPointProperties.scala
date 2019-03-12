package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPointProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillProperties {
  /**
    * Is used for borders around filled objects. See `LineColor` .
    * @see com.sun.star.drawing.LineProperties
    */
  var BorderColor: scala.Double = js.native
  /**
    * Is used for borders around filled objects. See `LineDash` .
    * @see com.sun.star.drawing.LineProperties
    */
  var BorderDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash = js.native
  /**
    * The name of a dash that can be found in the {@link com.sun.star.container.XNameContainer} "com.sun.star.drawing.LineDashTable", that can be created
    * via the com::sun::star::uno::XMultiServiceFactory of the {@link ChartDocument} .
    */
  var BorderDashName: java.lang.String = js.native
  /**
    * Is used for borders around filled objects. See `LineStyle` .
    * @see com.sun.star.drawing.LineProperties
    */
  var BorderStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle = js.native
  /**
    * Is used for borders around filled objects. See `LineTransparence` .
    * @see com.sun.star.drawing.LineProperties
    */
  var BorderTransparency: scala.Double = js.native
  /**
    * Is used for borders around filled objects. See `LineWidth` .
    * @see com.sun.star.drawing.LineProperties
    */
  var BorderWidth: scala.Double = js.native
  /**
    * points to a style that also supports this service (but not this property) that is used as default, if the PropertyState of a property is
    * `DEFAULT_VALUE` .This is the main color of a data point.
    *
    * For charts with filled areas, like bar-charts, this should map to the `FillColor` of the objects. For line-charts this should map to the `LineColor`
    * property.
    * @see com.sun.star.drawing.FillProperties
    * @see com.sun.star.drawing.LineProperties
    */
  var Color: scala.Double = js.native
  /**
    * If void, no error bars are shown for the data point in x-direction.
    *
    * The {@link com.sun.star.beans.XPropertySet} must support the service {@link ErrorBar} .
    */
  var ErrorBarX: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet = js.native
  /**
    * If void, no error bars are shown for the data point in y-direction.
    *
    * The {@link com.sun.star.beans.XPropertySet} must support the service {@link ErrorBar} .
    */
  var ErrorBarY: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet = js.native
  /**
    * describes the geometry of a 3 dimensional data point. Number is one of constant group {@link DataPointGeometry3D} .
    *
    * This is especially used for 3D bar-charts.
    *
    * CUBOID==0 CYLINDER==1 CONE==2 PYRAMID==3 CUBOID==else
    */
  var Geometry3D: scala.Double = js.native
  var Gradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient = js.native
  var GradientName: java.lang.String = js.native
  var Hatch: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Hatch = js.native
  var HatchName: java.lang.String = js.native
  var Label: DataPointLabel = js.native
  /**
    * specifies a relative position for the data label
    * @see com.sun.star.chart.DataLabelPlacement
    */
  var LabelPlacement: scala.Double = js.native
  /** specifies a string that is used to separate the parts of a data label (caption) */
  var LabelSeparator: java.lang.String = js.native
  /**
    * Is only used for line-chart types.
    * @see com.sun.star.drawing.LineProperties
    */
  var LineDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash = js.native
  /**
    * The name of a dash that can be found in the {@link com.sun.star.container.XNameContainer} "com.sun.star.drawing.LineDashTable", that can be created
    * via the com::sun::star::uno::XMultiServiceFactory of the {@link ChartDocument} .
    */
  var LineDashName: java.lang.String = js.native
  var LineStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle = js.native
  /**
    * Is only used for line-chart types.
    * @see com.sun.star.drawing.LineProperties
    */
  var LineWidth: scala.Double = js.native
  /** specifies a number format for the display of the value in the data label */
  var NumberFormat: scala.Double = js.native
  /**
    * describes a value by which a data point is moved from its default position in percent of the maximum allowed distance.
    *
    * This is especially useful for the explosion of pie-chart segments.
    */
  var Offset: scala.Double = js.native
  /** A value between 0 and 100 indicating the percentage how round an edge should be. */
  var PercentDiagonal: scala.Double = js.native
  /** specifies a number format for the display of the percentage value in the data label */
  var PercentageNumberFormat: scala.Double = js.native
  /**
    * The size of the page at the moment when the font size for data labels was set.
    *
    * This size is used to resize text in the view when the size of the page has changed since the font sizes were set (automatic text scaling).
    */
  var ReferencePageSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size = js.native
  /** In case {@link ErrorBarX} and {@link ErrorBarY} both are set, and error bars are shown, a box spanning all error-indicators is rendered. */
  var ShowErrorBox: scala.Boolean = js.native
  var Symbol: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.Symbol = js.native
  /**
    * specifies if the text of a data label (caption) must be wrapped
    * @since LibreOffice 5.1
    */
  var TextWordWrap: scala.Boolean = js.native
  /**
    * This is the main transparency value of a data point.
    *
    * For charts with filled areas, like bar-charts, this should map to the `FillTransparence` of the objects. For line-charts this should map to the
    * `LineTransparence` property.
    * @see com.sun.star.drawing.FillProperties
    * @see com.sun.star.drawing.LineProperties
    */
  var Transparency: scala.Double = js.native
  /** This describes the transparency of the fill area as a gradient. */
  var TransparencyGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient = js.native
  var TransparencyGradientName: java.lang.String = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo = js.native
}

