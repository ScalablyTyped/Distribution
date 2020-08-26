package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BYNESP extends js.Object {
  var BYN: js.Array[js.UndefOr[String]] = js.native
  var ESP: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var KMF: js.Array[js.UndefOr[String]] = js.native
  var MXN: js.Array[String] = js.native
  var RUB: js.Array[js.UndefOr[String]] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var XCD: js.Array[js.UndefOr[String]] = js.native
}

object BYNESP {
  @scala.inline
  def apply(
    BYN: js.Array[js.UndefOr[String]],
    ESP: js.Array[String],
    JPY: js.Array[String],
    KMF: js.Array[js.UndefOr[String]],
    MXN: js.Array[String],
    RUB: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    XCD: js.Array[js.UndefOr[String]]
  ): BYNESP = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], ESP = ESP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KMF = KMF.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNESP]
  }
  @scala.inline
  implicit class BYNESPOps[Self <: BYNESP] (val x: Self) extends AnyVal {
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
    def setBYNVarargs(value: js.UndefOr[String]*): Self = this.set("BYN", js.Array(value :_*))
    @scala.inline
    def setBYN(value: js.Array[js.UndefOr[String]]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setESPVarargs(value: String*): Self = this.set("ESP", js.Array(value :_*))
    @scala.inline
    def setESP(value: js.Array[String]): Self = this.set("ESP", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setKMFVarargs(value: js.UndefOr[String]*): Self = this.set("KMF", js.Array(value :_*))
    @scala.inline
    def setKMF(value: js.Array[js.UndefOr[String]]): Self = this.set("KMF", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXNVarargs(value: String*): Self = this.set("MXN", js.Array(value :_*))
    @scala.inline
    def setMXN(value: js.Array[String]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUBVarargs(value: js.UndefOr[String]*): Self = this.set("RUB", js.Array(value :_*))
    @scala.inline
    def setRUB(value: js.Array[js.UndefOr[String]]): Self = this.set("RUB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setXCDVarargs(value: js.UndefOr[String]*): Self = this.set("XCD", js.Array(value :_*))
    @scala.inline
    def setXCD(value: js.Array[js.UndefOr[String]]): Self = this.set("XCD", value.asInstanceOf[js.Any])
  }
  
}

