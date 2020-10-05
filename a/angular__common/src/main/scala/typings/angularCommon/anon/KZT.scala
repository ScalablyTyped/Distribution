package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KZT extends js.Object {
  var JPY: js.Array[String] = js.native
  var KZT: js.Array[String] = js.native
  var RUB: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
}

object KZT {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    KZT: js.Array[String],
    RUB: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): KZT = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KZT = KZT.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KZT]
  }
  @scala.inline
  implicit class KZTOps[Self <: KZT] (val x: Self) extends AnyVal {
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
    def setKZTVarargs(value: String*): Self = this.set("KZT", js.Array(value :_*))
    @scala.inline
    def setKZT(value: js.Array[String]): Self = this.set("KZT", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUBVarargs(value: String*): Self = this.set("RUB", js.Array(value :_*))
    @scala.inline
    def setRUB(value: js.Array[String]): Self = this.set("RUB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
  }
  
}

