package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory and possibly cache for creating and releasing resources.
  *
  * A resource factory is created and used by the {@link XConfigurationController} object.
  *
  * A factory may want to implement a cache to reuse previously released resources.
  */
trait XResourceFactory extends js.Object {
  /**
    * Create a resource for the given {@link XResourceId} object.
    * @param xResourceId The resource URL of this id specifies the type of resource to create. The anchor can be used to obtain the associated object from the
    * @returns Returns a resource object that has been just created or was taken from a cache. When the requested resource can not be created then an empty refe
    * @throws InvalidArgumentException when the given URL is not supported by the factory.
    */
  def createResource(xResourceId: XResourceId): XResource
  /**
    * Call this method to tell a factory that the given resource is no longer in use. The factory can decide whether to destroy the resource or to keep it
    * in a cache in order to reuse it later.
    * @param xResource The given resource has to be one created by the same factory.
    * @throws InvalidArgumentException when the given pane was not created by the same factory.
    */
  def releaseResource(xResource: XResource): scala.Unit
}

object XResourceFactory {
  @scala.inline
  def apply(
    createResource: js.Function1[XResourceId, XResource],
    releaseResource: js.Function1[XResource, scala.Unit]
  ): XResourceFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createResource")(createResource)
    __obj.updateDynamic("releaseResource")(releaseResource)
    __obj.asInstanceOf[XResourceFactory]
  }
}

