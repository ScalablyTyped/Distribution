package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives access to a single diagram. This interface is needed by the wrapper for the old API (namespace {@link com.sun.star.chart} ). */
trait XDiagramProvider extends XInterface {
  var Diagram: XDiagram
  def getDiagram(): XDiagram
  def setDiagram(xDiagram: XDiagram): Unit
}

object XDiagramProvider {
  @scala.inline
  def apply(
    Diagram: XDiagram,
    acquire: () => Unit,
    getDiagram: () => XDiagram,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDiagram: XDiagram => Unit
  ): XDiagramProvider = {
    val __obj = js.Dynamic.literal(Diagram = Diagram, acquire = js.Any.fromFunction0(acquire), getDiagram = js.Any.fromFunction0(getDiagram), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDiagram = js.Any.fromFunction1(setDiagram))
  
    __obj.asInstanceOf[XDiagramProvider]
  }
}

