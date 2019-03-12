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
    AvailableServiceNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    createInstanceWithArgumentsAndContext: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceWithContext: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    deregisterController: (java.lang.String, java.lang.String) => scala.Unit,
    getAvailableServiceNames: () => stdLib.SafeArray[java.lang.String],
    hasController: (java.lang.String, java.lang.String) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerController: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    release: () => scala.Unit
  ): XUIControllerFactory = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames, acquire = js.Any.fromFunction0(acquire), createInstanceWithArgumentsAndContext = js.Any.fromFunction3(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction2(createInstanceWithContext), deregisterController = js.Any.fromFunction2(deregisterController), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), hasController = js.Any.fromFunction2(hasController), queryInterface = js.Any.fromFunction1(queryInterface), registerController = js.Any.fromFunction3(registerController), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUIControllerFactory]
  }
}

