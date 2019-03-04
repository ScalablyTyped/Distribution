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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    updateModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, scala.Unit]
  ): XUpdateModel = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, updateModel = updateModel)
  
    __obj.asInstanceOf[XUpdateModel]
  }
}

