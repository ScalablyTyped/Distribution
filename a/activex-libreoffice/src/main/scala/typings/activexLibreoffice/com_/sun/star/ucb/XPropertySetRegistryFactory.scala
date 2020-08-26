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
@js.native
trait XPropertySetRegistryFactory extends XInterface {
  /**
    * creates a property set registry.
    * @param URL The identifier of the registry to create ( e.g. file-URL ). The value can be an empty string.
    * @returns The registry.
    */
  def createPropertySetRegistry(URL: String): XPropertySetRegistry = js.native
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
  @scala.inline
  implicit class XPropertySetRegistryFactoryOps[Self <: XPropertySetRegistryFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatePropertySetRegistry(value: String => XPropertySetRegistry): Self = this.set("createPropertySetRegistry", js.Any.fromFunction1(value))
  }
  
}

