package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateObject extends js.Object {
  
  def AddDays(pvarDate: js.Any, pvarDays: js.Any): js.Any = js.native
  
  def AddSeconds(pvarTime: js.Any, pvarSeconds: js.Any): js.Any = js.native
  
  @JSName("InfoPath.DateObject_typekey")
  var InfoPathDotDateObject_typekey: DateObject = js.native
  
  def Now(): js.Any = js.native
  
  def Today(): js.Any = js.native
}
object DateObject {
  
  @scala.inline
  def apply(
    AddDays: (js.Any, js.Any) => js.Any,
    AddSeconds: (js.Any, js.Any) => js.Any,
    InfoPathDotDateObject_typekey: DateObject,
    Now: () => js.Any,
    Today: () => js.Any
  ): DateObject = {
    val __obj = js.Dynamic.literal(AddDays = js.Any.fromFunction2(AddDays), AddSeconds = js.Any.fromFunction2(AddSeconds), Now = js.Any.fromFunction0(Now), Today = js.Any.fromFunction0(Today))
    __obj.updateDynamic("InfoPath.DateObject_typekey")(InfoPathDotDateObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
  
  @scala.inline
  implicit class DateObjectOps[Self <: DateObject] (val x: Self) extends AnyVal {
    
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
    def setAddDays(value: (js.Any, js.Any) => js.Any): Self = this.set("AddDays", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddSeconds(value: (js.Any, js.Any) => js.Any): Self = this.set("AddSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInfoPathDotDateObject_typekey(value: DateObject): Self = this.set("InfoPath.DateObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: () => js.Any): Self = this.set("Now", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToday(value: () => js.Any): Self = this.set("Today", js.Any.fromFunction0(value))
  }
}
