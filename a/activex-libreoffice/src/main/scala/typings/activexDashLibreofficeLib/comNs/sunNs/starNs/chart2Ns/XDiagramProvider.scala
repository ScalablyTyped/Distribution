package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives access to a single diagram. This interface is needed by the wrapper for the old API (namespace {@link com.sun.star.chart} ). */
trait XDiagramProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var Diagram: XDiagram
  def getDiagram(): XDiagram
  def setDiagram(xDiagram: XDiagram): scala.Unit
}

