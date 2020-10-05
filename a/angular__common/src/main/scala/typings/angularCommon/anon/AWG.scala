package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AWG extends js.Object {
  var ANG: js.Array[String] = js.native
  var AWG: js.Array[String] = js.native
  var BBD: js.Array[js.UndefOr[String]] = js.native
  var BSD: js.Array[js.UndefOr[String]] = js.native
  var HTG: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var MMK: js.Array[String] = js.native
  var PAB: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TTD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object AWG {
  @scala.inline
  def apply(
    ANG: js.Array[String],
    AWG: js.Array[String],
    BBD: js.Array[js.UndefOr[String]],
    BSD: js.Array[js.UndefOr[String]],
    HTG: js.Array[String],
    JPY: js.Array[String],
    MMK: js.Array[String],
    PAB: js.Array[String],
    THB: js.Array[String],
    TTD: js.Array[String],
    USD: js.Array[String]
  ): AWG = {
    val __obj = js.Dynamic.literal(ANG = ANG.asInstanceOf[js.Any], AWG = AWG.asInstanceOf[js.Any], BBD = BBD.asInstanceOf[js.Any], BSD = BSD.asInstanceOf[js.Any], HTG = HTG.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MMK = MMK.asInstanceOf[js.Any], PAB = PAB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TTD = TTD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWG]
  }
  @scala.inline
  implicit class AWGOps[Self <: AWG] (val x: Self) extends AnyVal {
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
    def setANGVarargs(value: String*): Self = this.set("ANG", js.Array(value :_*))
    @scala.inline
    def setANG(value: js.Array[String]): Self = this.set("ANG", value.asInstanceOf[js.Any])
    @scala.inline
    def setAWGVarargs(value: String*): Self = this.set("AWG", js.Array(value :_*))
    @scala.inline
    def setAWG(value: js.Array[String]): Self = this.set("AWG", value.asInstanceOf[js.Any])
    @scala.inline
    def setBBDVarargs(value: js.UndefOr[String]*): Self = this.set("BBD", js.Array(value :_*))
    @scala.inline
    def setBBD(value: js.Array[js.UndefOr[String]]): Self = this.set("BBD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBSDVarargs(value: js.UndefOr[String]*): Self = this.set("BSD", js.Array(value :_*))
    @scala.inline
    def setBSD(value: js.Array[js.UndefOr[String]]): Self = this.set("BSD", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTGVarargs(value: String*): Self = this.set("HTG", js.Array(value :_*))
    @scala.inline
    def setHTG(value: js.Array[String]): Self = this.set("HTG", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMMKVarargs(value: String*): Self = this.set("MMK", js.Array(value :_*))
    @scala.inline
    def setMMK(value: js.Array[String]): Self = this.set("MMK", value.asInstanceOf[js.Any])
    @scala.inline
    def setPABVarargs(value: String*): Self = this.set("PAB", js.Array(value :_*))
    @scala.inline
    def setPAB(value: js.Array[String]): Self = this.set("PAB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTTDVarargs(value: String*): Self = this.set("TTD", js.Array(value :_*))
    @scala.inline
    def setTTD(value: js.Array[String]): Self = this.set("TTD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

