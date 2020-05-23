package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for property set registries.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XPropertySetRegistryFactory extends XInterface {
  /**
    * creates a property set registry.
    * @param URL The identifier of the registry to create ( e.g. file-URL ). The value can be an empty string.
    * @returns The registry.
    */
  def createPropertySetRegistry(URL: String): XPropertySetRegistry
}

object XPropertySetRegistryFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createPropertySetRegistry: String => XPropertySetRegistry,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertySetRegistryFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createPropertySetRegistry = js.Any.fromFunction1(createPropertySetRegistry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertySetRegistryFactory]
  }
}

