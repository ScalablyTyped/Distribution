package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MWK extends js.Object {
  var JPY: js.Array[String] = js.native
  var MWK: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object MWK {
  @scala.inline
  def apply(JPY: js.Array[String], MWK: js.Array[String], USD: js.Array[String]): MWK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MWK = MWK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MWK]
  }
  @scala.inline
  implicit class MWKOps[Self <: MWK] (val x: Self) extends AnyVal {
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
    def setMWKVarargs(value: String*): Self = this.set("MWK", js.Array(value :_*))
    @scala.inline
    def setMWK(value: js.Array[String]): Self = this.set("MWK", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

