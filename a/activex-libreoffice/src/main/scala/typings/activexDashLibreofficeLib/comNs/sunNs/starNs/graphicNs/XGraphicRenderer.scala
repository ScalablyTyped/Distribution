package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interfaces exposes just one method to render a {@link XGraphic} container */
trait XGraphicRenderer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Renders the {@link XGraphic} container
    * @param Graphic The graphic container to be rendered
    * @see XGraphic
    */
  def render(Graphic: XGraphic): scala.Unit
}

object XGraphicRenderer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    render: XGraphic => scala.Unit
  ): XGraphicRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction1(render))
  
    __obj.asInstanceOf[XGraphicRenderer]
  }
}

