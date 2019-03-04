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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    render: js.Function1[XGraphic, scala.Unit]
  ): XGraphicRenderer = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, render = render)
  
    __obj.asInstanceOf[XGraphicRenderer]
  }
}

