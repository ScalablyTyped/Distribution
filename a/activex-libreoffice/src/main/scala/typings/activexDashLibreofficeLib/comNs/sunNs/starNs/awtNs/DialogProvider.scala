package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a provider for dialogs implementing the {@link com.sun.star.awt.XDialog} interface. */
trait DialogProvider extends XDialogProvider {
  def createWithModel(Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel): scala.Unit
  def createWithModelAndScripting(
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    InStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    DialogLib: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    ScriptListener: activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XScriptListener
  ): scala.Unit
}

object DialogProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createDialog: java.lang.String => XDialog,
    createWithModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel => scala.Unit,
    createWithModelAndScripting: (activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer, activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XScriptListener) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): DialogProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDialog = js.Any.fromFunction1(createDialog), createWithModel = js.Any.fromFunction1(createWithModel), createWithModelAndScripting = js.Any.fromFunction4(createWithModelAndScripting), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DialogProvider]
  }
}

