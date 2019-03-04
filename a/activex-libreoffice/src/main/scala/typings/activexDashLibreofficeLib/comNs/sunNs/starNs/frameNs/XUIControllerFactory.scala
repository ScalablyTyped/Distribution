package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a factory to create User Interface controllers.
  *
  * A user interface controller can be registered for a command URL. A certain user interface controller will be created when a user interface element
  * contains a registered command URL.
  * @see PopupMenuControllerFactory
  * @see StatusbarControllerFactory
  * @see ToolbarControllerFactory
  * @since LibreOffice 4.1
  */
trait XUIControllerFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiComponentFactory
     with XUIControllerRegistration

object XUIControllerFactory {
  @scala.inline
  def apply(
    AvailableServiceNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    createInstanceWithArgumentsAndContext: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    createInstanceWithContext: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    deregisterController: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    getAvailableServiceNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasController: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerController: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XUIControllerFactory = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames, acquire = acquire, createInstanceWithArgumentsAndContext = createInstanceWithArgumentsAndContext, createInstanceWithContext = createInstanceWithContext, deregisterController = deregisterController, getAvailableServiceNames = getAvailableServiceNames, hasController = hasController, queryInterface = queryInterface, registerController = registerController, release = release)
  
    __obj.asInstanceOf[XUIControllerFactory]
  }
}

