package typings
package agDashGridLib.distLibFilterFilterManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterWrapper extends js.Object {
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var compiledElement: js.Any
  var filterPromise: agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibInterfacesIFilterMod.IFilterComp]
  var guiPromise: agDashGridLib.distLibUtilsMod.ExternalPromise[stdLib.HTMLElement]
  var scope: js.Any
}

object FilterWrapper {
  @scala.inline
  def apply(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    compiledElement: js.Any,
    filterPromise: agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibInterfacesIFilterMod.IFilterComp],
    guiPromise: agDashGridLib.distLibUtilsMod.ExternalPromise[stdLib.HTMLElement],
    scope: js.Any
  ): FilterWrapper = {
    val __obj = js.Dynamic.literal(column = column, compiledElement = compiledElement, filterPromise = filterPromise, guiPromise = guiPromise, scope = scope)
  
    __obj.asInstanceOf[FilterWrapper]
  }
}

