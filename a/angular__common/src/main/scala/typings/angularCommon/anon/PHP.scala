package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PHP extends js.Object {
  var JPY: js.Array[String] = js.native
  var PHP: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object PHP {
  @scala.inline
  def apply(JPY: js.Array[String], PHP: js.Array[String], USD: js.Array[String]): PHP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PHP]
  }
  @scala.inline
  implicit class PHPOps[Self <: PHP] (val x: Self) extends AnyVal {
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
    def setPHPVarargs(value: String*): Self = this.set("PHP", js.Array(value :_*))
    @scala.inline
    def setPHP(value: js.Array[String]): Self = this.set("PHP", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

