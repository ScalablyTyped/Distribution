package typings.agDashGrid.distLibRenderingDateComponentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDate extends js.Object {
  /** Returns the current date represented by this editor */
  def getDate(): Date
  /** Sets the date represented by this component */
  def setDate(date: Date): Unit
}

object IDate {
  @scala.inline
  def apply(getDate: () => Date, setDate: Date => Unit): IDate = {
    val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), setDate = js.Any.fromFunction1(setDate))
  
    __obj.asInstanceOf[IDate]
  }
}

