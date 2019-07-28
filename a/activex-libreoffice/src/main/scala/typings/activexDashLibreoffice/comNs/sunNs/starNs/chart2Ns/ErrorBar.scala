package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSink
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineCap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineDash
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineJoint
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBar
  extends XDataSink
     with LineProperties
     with XDataSource {
  /** @see com.sun.star.chart.ErrorBarStyle */
  var ErrorBarStyle: Double
  var NegativeError: Double
  var PositiveError: Double
  var ShowNegativeError: Boolean
  var ShowPositiveError: Boolean
  /** The weight for the standard deviation. */
  var Weight: Double
}

object ErrorBar {
  @scala.inline
  def apply(
    DataSequences: SafeArray[XLabeledDataSequence],
    ErrorBarStyle: Double,
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
    NegativeError: Double,
    PositiveError: Double,
    ShowNegativeError: Boolean,
    ShowPositiveError: Boolean,
    Weight: Double,
    acquire: () => Unit,
    getDataSequences: () => SafeArray[XLabeledDataSequence],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setData: SeqEquiv[XLabeledDataSequence] => Unit
  ): ErrorBar = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences, ErrorBarStyle = ErrorBarStyle, LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth, NegativeError = NegativeError, PositiveError = PositiveError, ShowNegativeError = ShowNegativeError, ShowPositiveError = ShowPositiveError, Weight = Weight, acquire = js.Any.fromFunction0(acquire), getDataSequences = js.Any.fromFunction0(getDataSequences), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction1(setData))
  
    __obj.asInstanceOf[ErrorBar]
  }
}

