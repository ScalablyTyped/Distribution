package typings.agDashGrid.distLibFilterFilterManagerMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibInterfacesIFilterMod.IFilterComp
import typings.agDashGrid.distLibUtilsMod.ExternalPromise
import typings.agDashGrid.distLibUtilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterWrapper extends js.Object {
  var column: Column
  var compiledElement: js.Any
  var filterPromise: Promise[IFilterComp]
  var guiPromise: ExternalPromise[HTMLElement]
  var scope: js.Any
}

object FilterWrapper {
  @scala.inline
  def apply(
    column: Column,
    compiledElement: js.Any,
    filterPromise: Promise[IFilterComp],
    guiPromise: ExternalPromise[HTMLElement],
    scope: js.Any
  ): FilterWrapper = {
    val __obj = js.Dynamic.literal(column = column, compiledElement = compiledElement, filterPromise = filterPromise, guiPromise = guiPromise, scope = scope)
  
    __obj.asInstanceOf[FilterWrapper]
  }
}

