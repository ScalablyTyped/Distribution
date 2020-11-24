package typings.activexLibreoffice.com_.sun.star.drawing.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XResourceFactoryManager} is part of the configuration controller and manages the set of registered resource factories.
  * @see XConfigurationController
  * @see XResourceFactory
  */
@js.native
trait XResourceFactoryManager extends js.Object {
  
  /**
    * Register a new resource factory for the given URL.
    *
    * When one factory is responsible for more than one type of resource then this method has to be called for each type. If this method is called multiple
    * times for the same URL then a previously registered factory is removed for the URL.
    * @param sResourceURL The URL of the resource that the factory can create.
    * @param xResourceFactory The resource factory object.
    */
  def addResourceFactory(sResourceURL: String, xResourceFactory: XResourceFactory): Unit = js.native
  
  /**
    * Return the resource factory that was previously registered for the given resource type. This method is typically called by one of the resource
    * controllers.
    * @param sResourceURL The URL of the resource type for which to return the resource factory.
    * @returns When no resource factory was registered for the given resource type then an empty reference is returned.
    */
  def getResourceFactory(sResourceURL: String): XResourceFactory = js.native
  
  /**
    * Remove a resource factory for all resource types it has been registered for. Use {@link removeResourceFactoryForURL()} to remove a factory just for
    * one resource type and to leave it registered for others.
    * @param xResourceFactory The resource factory object to remove.
    */
  def removeResourceFactoryForReference(xResourceFactory: XResourceFactory): Unit = js.native
  
  /**
    * Remove a resource factory for one type of resource. When the factory has been registered for other URLs as well then it remains registered for them.
    * Use the {@link removeResourceFactoryForReference()} to remove a factory completely.
    * @param sResourceURL The URL for which to remove the resource factory.
    */
  def removeResourceFactoryForURL(sResourceURL: String): Unit = js.native
}
object XResourceFactoryManager {
  
  @scala.inline
  def apply(
    addResourceFactory: (String, XResourceFactory) => Unit,
    getResourceFactory: String => XResourceFactory,
    removeResourceFactoryForReference: XResourceFactory => Unit,
    removeResourceFactoryForURL: String => Unit
  ): XResourceFactoryManager = {
    val __obj = js.Dynamic.literal(addResourceFactory = js.Any.fromFunction2(addResourceFactory), getResourceFactory = js.Any.fromFunction1(getResourceFactory), removeResourceFactoryForReference = js.Any.fromFunction1(removeResourceFactoryForReference), removeResourceFactoryForURL = js.Any.fromFunction1(removeResourceFactoryForURL))
    __obj.asInstanceOf[XResourceFactoryManager]
  }
  
  @scala.inline
  implicit class XResourceFactoryManagerOps[Self <: XResourceFactoryManager] (val x: Self) extends AnyVal {
    
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
    def setAddResourceFactory(value: (String, XResourceFactory) => Unit): Self = this.set("addResourceFactory", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResourceFactory(value: String => XResourceFactory): Self = this.set("getResourceFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveResourceFactoryForReference(value: XResourceFactory => Unit): Self = this.set("removeResourceFactoryForReference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveResourceFactoryForURL(value: String => Unit): Self = this.set("removeResourceFactoryForURL", js.Any.fromFunction1(value))
  }
}
