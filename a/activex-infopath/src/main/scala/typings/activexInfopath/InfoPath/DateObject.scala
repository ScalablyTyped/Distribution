package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObject extends js.Object {
  @JSName("InfoPath.DateObject_typekey")
  var InfoPathDotDateObject_typekey: DateObject
  def AddDays(pvarDate: js.Any, pvarDays: js.Any): js.Any
  def AddSeconds(pvarTime: js.Any, pvarSeconds: js.Any): js.Any
  def Now(): js.Any
  def Today(): js.Any
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
}

