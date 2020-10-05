package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TJS extends js.Object {
  var JPY: js.Array[String] = js.native
  var TJS: js.Array[String] = js.native
}

object TJS {
  @scala.inline
  def apply(JPY: js.Array[String], TJS: js.Array[String]): TJS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TJS = TJS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TJS]
  }
  @scala.inline
  implicit class TJSOps[Self <: TJS] (val x: Self) extends AnyVal {
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
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTJSVarargs(value: String*): Self = this.set("TJS", js.Array(value :_*))
    @scala.inline
    def setTJS(value: js.Array[String]): Self = this.set("TJS", value.asInstanceOf[js.Any])
  }
  
}

