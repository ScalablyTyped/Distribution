package typings.agGrid.iFilterMod

import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterComp
  extends IFilter
     with IComponent[IFilterParams]
object IFilterComp {
  
  @scala.inline
  def apply(
    doesFilterPass: IDoesFilterPassParams => Boolean,
    getGui: () => HTMLElement,
    getModel: () => js.Any,
    isFilterActive: () => Boolean,
    setModel: js.Any => Unit
  ): IFilterComp = {
    val __obj = js.Dynamic.literal(doesFilterPass = js.Any.fromFunction1(doesFilterPass), getGui = js.Any.fromFunction0(getGui), getModel = js.Any.fromFunction0(getModel), isFilterActive = js.Any.fromFunction0(isFilterActive), setModel = js.Any.fromFunction1(setModel))
    __obj.asInstanceOf[IFilterComp]
  }
}
