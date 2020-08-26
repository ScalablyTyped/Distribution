package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.frame.XController
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
@js.native
trait BasicPaneFactory extends XResourceFactory {
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: XController): Unit = js.native
}

object BasicPaneFactory {
  @scala.inline
  def apply(
    create: XController => Unit,
    createResource: XResourceId => XResource,
    releaseResource: XResource => Unit
  ): BasicPaneFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createResource = js.Any.fromFunction1(createResource), releaseResource = js.Any.fromFunction1(releaseResource))
    __obj.asInstanceOf[BasicPaneFactory]
  }
  @scala.inline
  implicit class BasicPaneFactoryOps[Self <: BasicPaneFactory] (val x: Self) extends AnyVal {
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
    def setCreate(value: XController => Unit): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

