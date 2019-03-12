package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal interface to update the used css::frame::XModel
  * @since LibreOffice 5.1
  */
trait XUpdateModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def updateModel(xModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel): scala.Unit
}

object XUpdateModel {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    updateModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel => scala.Unit
  ): XUpdateModel = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateModel = js.Any.fromFunction1(updateModel))
  
    __obj.asInstanceOf[XUpdateModel]
  }
}

