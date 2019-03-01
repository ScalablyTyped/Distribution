package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBar
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSink
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource {
  /** @see com.sun.star.chart.ErrorBarStyle */
  var ErrorBarStyle: scala.Double
  var NegativeError: scala.Double
  var PositiveError: scala.Double
  var ShowNegativeError: scala.Boolean
  var ShowPositiveError: scala.Boolean
  /** The weight for the standard deviation. */
  var Weight: scala.Double
}

object ErrorBar {
  @scala.inline
  def apply(
    DataSequences: activexDashInteropLib.SafeArray[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
    ],
    ErrorBarStyle: scala.Double,
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
    NegativeError: scala.Double,
    PositiveError: scala.Double,
    ShowNegativeError: scala.Boolean,
    ShowPositiveError: scala.Boolean,
    Weight: scala.Double,
    acquire: js.Function0[scala.Unit],
    getDataSequences: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
      ]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
      ], 
      scala.Unit
    ]
  ): ErrorBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataSequences")(DataSequences)
    __obj.updateDynamic("ErrorBarStyle")(ErrorBarStyle)
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
    __obj.updateDynamic("NegativeError")(NegativeError)
    __obj.updateDynamic("PositiveError")(PositiveError)
    __obj.updateDynamic("ShowNegativeError")(ShowNegativeError)
    __obj.updateDynamic("ShowPositiveError")(ShowPositiveError)
    __obj.updateDynamic("Weight")(Weight)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDataSequences")(getDataSequences)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setData")(setData)
    __obj.asInstanceOf[ErrorBar]
  }
}

