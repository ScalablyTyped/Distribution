package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link BasicPaneFactory} is a resource factory that provides the panes used by the Draw and Impress applications.
  *
  * This factory provides the center, left, and right pane. For the left pane there are two URLS, `private:resource/floater/LeftImpressPane` and
  * `private:resource/floater/LeftDrawPane` , one for Impress, the other for Draw. The center pane and the right pane have the URLs
  * `private:resource/floater/CenterPane` and `private:resource/floater/RightPane` respectively.
  *
  * This factory is typically created indirectly by registering it in the configuration and have the {@link XModuleController} create it on demand.
  */
trait BasicPaneFactory extends XResourceFactory {
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController): scala.Unit
}

object BasicPaneFactory {
  @scala.inline
  def apply(
    create: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    createResource: js.Function1[XResourceId, XResource],
    releaseResource: js.Function1[XResource, scala.Unit]
  ): BasicPaneFactory = {
    val __obj = js.Dynamic.literal(create = create, createResource = createResource, releaseResource = releaseResource)
  
    __obj.asInstanceOf[BasicPaneFactory]
  }
}

