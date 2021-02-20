package typings.activexLibreoffice.com_.sun.star.drawing.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Factory and possibly cache for creating and releasing resources.
  *
  * A resource factory is created and used by the {@link XConfigurationController} object.
  *
  * A factory may want to implement a cache to reuse previously released resources.
  */
@js.native
trait XResourceFactory extends StObject {
  
  /**
    * Create a resource for the given {@link XResourceId} object.
    * @param xResourceId The resource URL of this id specifies the type of resource to create. The anchor can be used to obtain the associated object from the
    * @returns Returns a resource object that has been just created or was taken from a cache. When the requested resource can not be created then an empty refe
    * @throws InvalidArgumentException when the given URL is not supported by the factory.
    */
  def createResource(xResourceId: XResourceId): XResource = js.native
  
  /**
    * Call this method to tell a factory that the given resource is no longer in use. The factory can decide whether to destroy the resource or to keep it
    * in a cache in order to reuse it later.
    * @param xResource The given resource has to be one created by the same factory.
    * @throws InvalidArgumentException when the given pane was not created by the same factory.
    */
  def releaseResource(xResource: XResource): Unit = js.native
}
object XResourceFactory {
  
  @scala.inline
  def apply(createResource: XResourceId => XResource, releaseResource: XResource => Unit): XResourceFactory = {
    val __obj = js.Dynamic.literal(createResource = js.Any.fromFunction1(createResource), releaseResource = js.Any.fromFunction1(releaseResource))
    __obj.asInstanceOf[XResourceFactory]
  }
  
  @scala.inline
  implicit class XResourceFactoryMutableBuilder[Self <: XResourceFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateResource(value: XResourceId => XResource): Self = StObject.set(x, "createResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleaseResource(value: XResource => Unit): Self = StObject.set(x, "releaseResource", js.Any.fromFunction1(value))
  }
}
