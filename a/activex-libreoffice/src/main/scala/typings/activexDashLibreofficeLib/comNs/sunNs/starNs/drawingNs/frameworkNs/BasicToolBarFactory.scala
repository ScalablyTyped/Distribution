package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

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
  def create(xController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController): scala.Unit
}

object BasicToolBarFactory {
  @scala.inline
  def apply(
    create: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    createResource: js.Function1[XResourceId, XResource],
    releaseResource: js.Function1[XResource, scala.Unit]
  ): BasicToolBarFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("createResource")(createResource)
    __obj.updateDynamic("releaseResource")(releaseResource)
    __obj.asInstanceOf[BasicToolBarFactory]
  }
}

