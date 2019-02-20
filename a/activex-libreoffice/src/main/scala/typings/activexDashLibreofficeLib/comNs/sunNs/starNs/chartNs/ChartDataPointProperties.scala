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

