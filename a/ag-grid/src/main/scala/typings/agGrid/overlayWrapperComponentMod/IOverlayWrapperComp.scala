package typings.agGrid.overlayWrapperComponentMod

import typings.agGrid.iComponentMod.IAfterGuiAttachedParams
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayWrapperComp extends IComponent[IOverlayWrapperParams] {
  def hideOverlay(eOverlayWrapper: HTMLElement): Unit
  def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit
  def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit
}

object IOverlayWrapperComp {
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    hideOverlay: HTMLElement => Unit,
    showLoadingOverlay: HTMLElement => Unit,
    showNoRowsOverlay: HTMLElement => Unit,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit = null,
    destroy: () => Unit = null,
    init: IOverlayWrapperParams => Promise[Unit] | Unit = null
  ): IOverlayWrapperComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), hideOverlay = js.Any.fromFunction1(hideOverlay), showLoadingOverlay = js.Any.fromFunction1(showLoadingOverlay), showNoRowsOverlay = js.Any.fromFunction1(showNoRowsOverlay))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IOverlayWrapperComp]
  }
}

