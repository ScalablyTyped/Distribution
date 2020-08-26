package typings.agGrid.dateComponentMod

import typings.agGrid.iComponentMod.IComponent
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateComp
  extends IComponent[IDateParams]
     with IDate

object IDateComp {
  @scala.inline
  def apply(getDate: () => Date, getGui: () => HTMLElement, setDate: Date => Unit): IDateComp = {
    val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), getGui = js.Any.fromFunction0(getGui), setDate = js.Any.fromFunction1(setDate))
    __obj.asInstanceOf[IDateComp]
  }
}

