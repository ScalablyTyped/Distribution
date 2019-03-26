package typings
package agDashGridLib.distLibInterfacesIFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterComp
  extends IFilter
     with agDashGridLib.distLibInterfacesIComponentMod.IComponent[IFilterParams]

object IFilterComp {
  @scala.inline
  def apply(
    doesFilterPass: IDoesFilterPassParams => scala.Boolean,
    getGui: () => stdLib.HTMLElement,
    getModel: () => js.Any,
    isFilterActive: () => scala.Boolean,
    setModel: js.Any => scala.Unit,
    afterGuiAttached: /* params */ js.UndefOr[agDashGridLib.distLibInterfacesIComponentMod.IAfterGuiAttachedParams] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    getFrameworkComponentInstance: () => _ = null,
    getModelAsString: /* model */ js.Any => java.lang.String = null,
    init: IFilterParams => agDashGridLib.distLibUtilsMod.Promise[scala.Unit] | scala.Unit = null,
    onFloatingFilterChanged: /* change */ js.Any => scala.Unit = null,
    onNewRowsLoaded: () => scala.Unit = null
  ): IFilterComp = {
    val __obj = js.Dynamic.literal(doesFilterPass = js.Any.fromFunction1(doesFilterPass), getGui = js.Any.fromFunction0(getGui), getModel = js.Any.fromFunction0(getModel), isFilterActive = js.Any.fromFunction0(isFilterActive), setModel = js.Any.fromFunction1(setModel))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (getFrameworkComponentInstance != null) __obj.updateDynamic("getFrameworkComponentInstance")(js.Any.fromFunction0(getFrameworkComponentInstance))
    if (getModelAsString != null) __obj.updateDynamic("getModelAsString")(js.Any.fromFunction1(getModelAsString))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (onFloatingFilterChanged != null) __obj.updateDynamic("onFloatingFilterChanged")(js.Any.fromFunction1(onFloatingFilterChanged))
    if (onNewRowsLoaded != null) __obj.updateDynamic("onNewRowsLoaded")(js.Any.fromFunction0(onNewRowsLoaded))
    __obj.asInstanceOf[IFilterComp]
  }
}

