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

object XDiagramProvider {
  @scala.inline
  def apply(
    Diagram: XDiagram,
    acquire: js.Function0[scala.Unit],
    getDiagram: js.Function0[XDiagram],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDiagram: js.Function1[XDiagram, scala.Unit]
  ): XDiagramProvider = {
    val __obj = js.Dynamic.literal(Diagram = Diagram, acquire = acquire, getDiagram = getDiagram, queryInterface = queryInterface, release = release, setDiagram = setDiagram)
  
    __obj.asInstanceOf[XDiagramProvider]
  }
}

