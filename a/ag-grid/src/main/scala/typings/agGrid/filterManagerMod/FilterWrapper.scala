package typings.agGrid.filterManagerMod

import typings.agGrid.columnMod.Column
import typings.agGrid.iFilterMod.IFilterComp
import typings.agGrid.utilsMod.ExternalPromise
import typings.agGrid.utilsMod.Promise
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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compiledElement = compiledElement.asInstanceOf[js.Any], filterPromise = filterPromise.asInstanceOf[js.Any], guiPromise = guiPromise.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterWrapper]
  }
}

