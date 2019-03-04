package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for property set registries.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XPropertySetRegistryFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a property set registry.
    * @param URL The identifier of the registry to create ( e.g. file-URL ). The value can be an empty string.
    * @returns The registry.
    */
  def createPropertySetRegistry(URL: java.lang.String): XPropertySetRegistry
}

object XPropertySetRegistryFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createPropertySetRegistry: js.Function1[java.lang.String, XPropertySetRegistry],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPropertySetRegistryFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createPropertySetRegistry = createPropertySetRegistry, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPropertySetRegistryFactory]
  }
}

