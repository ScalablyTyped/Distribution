package typings.agGrid.dateComponentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDate extends js.Object {
  
  /** Returns the current date represented by this editor */
  def getDate(): Date = js.native
  
  /** Sets the date represented by this component */
  def setDate(date: Date): Unit = js.native
}
object IDate {
  
  @scala.inline
  def apply(getDate: () => Date, setDate: Date => Unit): IDate = {
    val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), setDate = js.Any.fromFunction1(setDate))
    __obj.asInstanceOf[IDate]
  }
  
  @scala.inline
  implicit class IDateOps[Self <: IDate] (val x: Self) extends AnyVal {
    
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
    def setGetDate(value: () => Date): Self = this.set("getDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDate(value: Date => Unit): Self = this.set("setDate", js.Any.fromFunction1(value))
  }
}
