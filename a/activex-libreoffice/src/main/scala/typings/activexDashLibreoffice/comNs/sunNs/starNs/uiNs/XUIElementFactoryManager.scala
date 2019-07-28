package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style service {@link XUIElementFactoryManager} .
  * @since LibreOffice 4.1
  */
trait XUIElementFactoryManager
  extends XUIElementFactory
     with XUIElementFactoryRegistration

object XUIElementFactoryManager {
  @scala.inline
  def apply(
    RegisteredFactories: SafeArray[SafeArray[PropertyValue]],
    acquire: () => Unit,
    createUIElement: (String, SeqEquiv[PropertyValue]) => XUIElement,
    deregisterFactory: (String, String, String) => Unit,
    getFactory: (String, String) => XUIElementFactory,
    getRegisteredFactories: () => SafeArray[SafeArray[PropertyValue]],
    queryInterface: `type` => js.Any,
    registerFactory: (String, String, String, String) => Unit,
    release: () => Unit
  ): XUIElementFactoryManager = {
    val __obj = js.Dynamic.literal(RegisteredFactories = RegisteredFactories, acquire = js.Any.fromFunction0(acquire), createUIElement = js.Any.fromFunction2(createUIElement), deregisterFactory = js.Any.fromFunction3(deregisterFactory), getFactory = js.Any.fromFunction2(getFactory), getRegisteredFactories = js.Any.fromFunction0(getRegisteredFactories), queryInterface = js.Any.fromFunction1(queryInterface), registerFactory = js.Any.fromFunction4(registerFactory), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUIElementFactoryManager]
  }
}

