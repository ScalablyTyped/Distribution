package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XResourceFactoryManager} is part of the configuration controller and manages the set of registered resource factories.
  * @see XConfigurationController
  * @see XResourceFactory
  */
trait XResourceFactoryManager extends js.Object {
  /**
    * Register a new resource factory for the given URL.
    *
    * When one factory is responsible for more than one type of resource then this method has to be called for each type. If this method is called multiple
    * times for the same URL then a previously registered factory is removed for the URL.
    * @param sResourceURL The URL of the resource that the factory can create.
    * @param xResourceFactory The resource factory object.
    */
  def addResourceFactory(sResourceURL: java.lang.String, xResourceFactory: XResourceFactory): scala.Unit
  /**
    * Return the resource factory that was previously registered for the given resource type. This method is typically called by one of the resource
    * controllers.
    * @param sResourceURL The URL of the resource type for which to return the resource factory.
    * @returns When no resource factory was registered for the given resource type then an empty reference is returned.
    */
  def getResourceFactory(sResourceURL: java.lang.String): XResourceFactory
  /**
    * Remove a resource factory for all resource types it has been registered for. Use {@link removeResourceFactoryForURL()} to remove a factory just for
    * one resource type and to leave it registered for others.
    * @param xResourceFactory The resource factory object to remove.
    */
  def removeResourceFactoryForReference(xResourceFactory: XResourceFactory): scala.Unit
  /**
    * Remove a resource factory for one type of resource. When the factory has been registered for other URLs as well then it remains registered for them.
    * Use the {@link removeResourceFactoryForReference()} to remove a factory completely.
    * @param sResourceURL The URL for which to remove the resource factory.
    */
  def removeResourceFactoryForURL(sResourceURL: java.lang.String): scala.Unit
}

object XResourceFactoryManager {
  @scala.inline
  def apply(
    addResourceFactory: js.Function2[java.lang.String, XResourceFactory, scala.Unit],
    getResourceFactory: js.Function1[java.lang.String, XResourceFactory],
    removeResourceFactoryForReference: js.Function1[XResourceFactory, scala.Unit],
    removeResourceFactoryForURL: js.Function1[java.lang.String, scala.Unit]
  ): XResourceFactoryManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addResourceFactory")(addResourceFactory)
    __obj.updateDynamic("getResourceFactory")(getResourceFactory)
    __obj.updateDynamic("removeResourceFactoryForReference")(removeResourceFactoryForReference)
    __obj.updateDynamic("removeResourceFactoryForURL")(removeResourceFactoryForURL)
    __obj.asInstanceOf[XResourceFactoryManager]
  }
}

