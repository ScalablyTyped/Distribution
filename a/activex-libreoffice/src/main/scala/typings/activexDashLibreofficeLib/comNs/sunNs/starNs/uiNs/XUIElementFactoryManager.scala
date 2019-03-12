package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

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
    RegisteredFactories: stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    acquire: () => scala.Unit,
    createUIElement: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => XUIElement,
    deregisterFactory: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    getFactory: (java.lang.String, java.lang.String) => XUIElementFactory,
    getRegisteredFactories: () => stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerFactory: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    release: () => scala.Unit
  ): XUIElementFactoryManager = {
    val __obj = js.Dynamic.literal(RegisteredFactories = RegisteredFactories, acquire = js.Any.fromFunction0(acquire), createUIElement = js.Any.fromFunction2(createUIElement), deregisterFactory = js.Any.fromFunction3(deregisterFactory), getFactory = js.Any.fromFunction2(getFactory), getRegisteredFactories = js.Any.fromFunction0(getRegisteredFactories), queryInterface = js.Any.fromFunction1(queryInterface), registerFactory = js.Any.fromFunction4(registerFactory), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUIElementFactoryManager]
  }
}

