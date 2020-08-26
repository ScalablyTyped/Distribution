package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives access to a single diagram. This interface is needed by the wrapper for the old API (namespace {@link com.sun.star.chart} ). */
@js.native
trait XDiagramProvider extends XInterface {
  var Diagram: XDiagram = js.native
  def getDiagram(): XDiagram = js.native
  def setDiagram(xDiagram: XDiagram): Unit = js.native
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
    val __obj = js.Dynamic.literal(Diagram = Diagram.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDiagram = js.Any.fromFunction0(getDiagram), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDiagram = js.Any.fromFunction1(setDiagram))
    __obj.asInstanceOf[XDiagramProvider]
  }
  @scala.inline
  implicit class XDiagramProviderOps[Self <: XDiagramProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiagram(value: XDiagram): Self = this.set("Diagram", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDiagram(value: () => XDiagram): Self = this.set("getDiagram", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDiagram(value: XDiagram => Unit): Self = this.set("setDiagram", js.Any.fromFunction1(value))
  }
  
}

