package typings.activexLibreoffice.com_.sun.star.uno

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XMultiComponentFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component context to be passed to a component via {@link com.sun.star.lang.XSingleComponentFactory} . Arbitrary values (e.g. deployment values) can be
  * retrieved from the context.
  */
trait XComponentContext extends XInterface {
  /**
    * Gets the service manager instance to be used from key `/singletons/com.sun.star.lang.theServiceManager` . This method has been added for convenience,
    * because the service manager is used very often.
    * @returns service manager; throws {@link DeploymentException} in case service manager is null
    */
  val ServiceManager: XMultiComponentFactory
  /**
    * Gets the service manager instance to be used from key `/singletons/com.sun.star.lang.theServiceManager` . This method has been added for convenience,
    * because the service manager is used very often.
    * @returns service manager; throws {@link DeploymentException} in case service manager is null
    */
  def getServiceManager(): XMultiComponentFactory
  /**
    * Gets a value from the context.
    * @param Name name of value
    * @returns value
    */
  def getValueByName(Name: String): js.Any
}

object XComponentContext {
  @scala.inline
  def apply(
    ServiceManager: XMultiComponentFactory,
    acquire: () => Unit,
    getServiceManager: () => XMultiComponentFactory,
    getValueByName: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentContext = {
    val __obj = js.Dynamic.literal(ServiceManager = ServiceManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getServiceManager = js.Any.fromFunction0(getServiceManager), getValueByName = js.Any.fromFunction1(getValueByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentContext]
  }
}

