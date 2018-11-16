package typings
package arcgisDashRestDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object arcgisDashRestDashApiMod {
  type Color = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type ElipticArc = Arc
  type JsonCurve = CircularArc | Arc | OldCircularArc | BezierCurve
  type Position = Position2D | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type Position2D = js.Tuple2[scala.Double, scala.Double]
  type SimpleFillSymbolStyle = arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFSBackwardDiagonal | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFSCross | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFSDiagonalCross | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFSForwardDiagonal | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFSHorizontal | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFSNull | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFSSolid | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFSVertical
  type SimpleLineSymbolStyle = arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLSDash | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLSDashDot | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLSDashDotDot | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLSDot | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLSNull | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLSSolid
  type SimpleMarkerSymbolStyle = arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMSCircle | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMSCross | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMSDiamond | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMSSquare | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMSX | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMSTriangle
  type SpatialReference = SpatialReferenceWkt | SpatialReferenceWkid
  type SymbolType = arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSLS | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSMS | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFS | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriPMS | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriPFS | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriTS
  type esriGeometryType = arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriGeometryPoint | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriGeometryMultipoint | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriGeometryPolyline | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriGeometryPolygon | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriGeometryEnvelope
}
