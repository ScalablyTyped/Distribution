package typings.adhan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdhanCalculationMethod extends js.Object {
  def Dubai(): Parameter = js.native
  def Egyptian(): Parameter = js.native
  def Karachi(): Parameter = js.native
  def Kuwait(): Parameter = js.native
  def MoonsightingCommittee(): Parameter = js.native
  def MuslimWorldLeague(): Parameter = js.native
  def NorthAmerica(): Parameter = js.native
  def Other(): Parameter = js.native
  def Qatar(): Parameter = js.native
  def Singapore(): Parameter = js.native
  def UmmAlQura(): Parameter = js.native
}

object AdhanCalculationMethod {
  @scala.inline
  def apply(
    Dubai: () => Parameter,
    Egyptian: () => Parameter,
    Karachi: () => Parameter,
    Kuwait: () => Parameter,
    MoonsightingCommittee: () => Parameter,
    MuslimWorldLeague: () => Parameter,
    NorthAmerica: () => Parameter,
    Other: () => Parameter,
    Qatar: () => Parameter,
    Singapore: () => Parameter,
    UmmAlQura: () => Parameter
  ): AdhanCalculationMethod = {
    val __obj = js.Dynamic.literal(Dubai = js.Any.fromFunction0(Dubai), Egyptian = js.Any.fromFunction0(Egyptian), Karachi = js.Any.fromFunction0(Karachi), Kuwait = js.Any.fromFunction0(Kuwait), MoonsightingCommittee = js.Any.fromFunction0(MoonsightingCommittee), MuslimWorldLeague = js.Any.fromFunction0(MuslimWorldLeague), NorthAmerica = js.Any.fromFunction0(NorthAmerica), Other = js.Any.fromFunction0(Other), Qatar = js.Any.fromFunction0(Qatar), Singapore = js.Any.fromFunction0(Singapore), UmmAlQura = js.Any.fromFunction0(UmmAlQura))
    __obj.asInstanceOf[AdhanCalculationMethod]
  }
  @scala.inline
  implicit class AdhanCalculationMethodOps[Self <: AdhanCalculationMethod] (val x: Self) extends AnyVal {
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
    def setDubai(value: () => Parameter): Self = this.set("Dubai", js.Any.fromFunction0(value))
    @scala.inline
    def setEgyptian(value: () => Parameter): Self = this.set("Egyptian", js.Any.fromFunction0(value))
    @scala.inline
    def setKarachi(value: () => Parameter): Self = this.set("Karachi", js.Any.fromFunction0(value))
    @scala.inline
    def setKuwait(value: () => Parameter): Self = this.set("Kuwait", js.Any.fromFunction0(value))
    @scala.inline
    def setMoonsightingCommittee(value: () => Parameter): Self = this.set("MoonsightingCommittee", js.Any.fromFunction0(value))
    @scala.inline
    def setMuslimWorldLeague(value: () => Parameter): Self = this.set("MuslimWorldLeague", js.Any.fromFunction0(value))
    @scala.inline
    def setNorthAmerica(value: () => Parameter): Self = this.set("NorthAmerica", js.Any.fromFunction0(value))
    @scala.inline
    def setOther(value: () => Parameter): Self = this.set("Other", js.Any.fromFunction0(value))
    @scala.inline
    def setQatar(value: () => Parameter): Self = this.set("Qatar", js.Any.fromFunction0(value))
    @scala.inline
    def setSingapore(value: () => Parameter): Self = this.set("Singapore", js.Any.fromFunction0(value))
    @scala.inline
    def setUmmAlQura(value: () => Parameter): Self = this.set("UmmAlQura", js.Any.fromFunction0(value))
  }
  
}

