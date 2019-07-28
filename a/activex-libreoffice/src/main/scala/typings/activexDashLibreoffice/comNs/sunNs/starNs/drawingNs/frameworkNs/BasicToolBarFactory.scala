package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.frameworkNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link BasicToolBarFactory} is a resource factory that provides (some of) the tool bars used by the Draw and Impress applications.
  *
  * The factory recognizes the following URLs: `private:resource/toolbar/ViewTabBar` for the tab bar that allows the switching between views. This short
  * list marks the implementation of this service clearly as being in transition.
  *
  * This factory is typically created indirectly by registering it in the configuration and have the {@link XModuleController} create it on demand.
  */
trait BasicToolBarFactory extends XResourceFactory {
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: XController): Unit
}

object BasicToolBarFactory {
  @scala.inline
  def apply(
    create: XController => Unit,
    createResource: XResourceId => XResource,
    releaseResource: XResource => Unit
  ): BasicToolBarFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createResource = js.Any.fromFunction1(createResource), releaseResource = js.Any.fromFunction1(releaseResource))
  
    __obj.asInstanceOf[BasicToolBarFactory]
  }
}

