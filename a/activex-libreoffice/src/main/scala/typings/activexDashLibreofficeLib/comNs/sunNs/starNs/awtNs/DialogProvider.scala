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
    acquire: js.Function0[scala.Unit],
    createDialog: js.Function1[java.lang.String, XDialog],
    createWithModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, scala.Unit],
    createWithModelAndScripting: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XScriptListener, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): DialogProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, createDialog = createDialog, createWithModel = createWithModel, createWithModelAndScripting = createWithModelAndScripting, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[DialogProvider]
  }
}

