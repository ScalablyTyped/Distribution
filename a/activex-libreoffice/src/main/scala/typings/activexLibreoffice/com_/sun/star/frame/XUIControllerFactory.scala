package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XMultiComponentFactory
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XMultiComponentFactory
     with XUIControllerRegistration
object XUIControllerFactory {
  
  inline def apply(
    AvailableServiceNames: SafeArray[String],
    acquire: () => Unit,
    createInstanceWithArgumentsAndContext: (String, SeqEquiv[js.Any], XComponentContext) => XInterface,
    createInstanceWithContext: (String, XComponentContext) => XInterface,
    deregisterController: (String, String) => Unit,
    getAvailableServiceNames: () => SafeArray[String],
    hasController: (String, String) => Boolean,
    queryInterface: `type` => js.Any,
    registerController: (String, String, String) => Unit,
    release: () => Unit
  ): XUIControllerFactory = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createInstanceWithArgumentsAndContext = js.Any.fromFunction3(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction2(createInstanceWithContext), deregisterController = js.Any.fromFunction2(deregisterController), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), hasController = js.Any.fromFunction2(hasController), queryInterface = js.Any.fromFunction1(queryInterface), registerController = js.Any.fromFunction3(registerController), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUIControllerFactory]
  }
}
