package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUDRON extends js.Object {
  var AUD: js.Array[String] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var THB: js.Array[String] = js.native
  var TRY: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
}

object AUDRON {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TRY: js.Array[String],
    TWD: js.Array[String]
  ): AUDRON = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDRON]
  }
  @scala.inline
  implicit class AUDRONOps[Self <: AUDRON] (val x: Self) extends AnyVal {
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
    def setAUDVarargs(value: String*): Self = this.set("AUD", js.Array(value :_*))
    @scala.inline
    def setAUD(value: js.Array[String]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRYVarargs(value: String*): Self = this.set("TRY", js.Array(value :_*))
    @scala.inline
    def setTRY(value: js.Array[String]): Self = this.set("TRY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
  }
  
}

