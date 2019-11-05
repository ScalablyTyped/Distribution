package typings.adhan.adhanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdhanCalculationMethod extends js.Object {
  def Dubai(): Paramater
  def Egyptian(): Paramater
  def Karachi(): Paramater
  def Kuwait(): Paramater
  def MoonsightingCommittee(): Paramater
  def MuslimWorldLeague(): Paramater
  def NorthAmerica(): Paramater
  def Other(): Paramater
  def Qatar(): Paramater
  def Singapore(): Paramater
  def UmmAlQura(): Paramater
}

object AdhanCalculationMethod {
  @scala.inline
  def apply(
    Dubai: () => Paramater,
    Egyptian: () => Paramater,
    Karachi: () => Paramater,
    Kuwait: () => Paramater,
    MoonsightingCommittee: () => Paramater,
    MuslimWorldLeague: () => Paramater,
    NorthAmerica: () => Paramater,
    Other: () => Paramater,
    Qatar: () => Paramater,
    Singapore: () => Paramater,
    UmmAlQura: () => Paramater
  ): AdhanCalculationMethod = {
    val __obj = js.Dynamic.literal(Dubai = js.Any.fromFunction0(Dubai), Egyptian = js.Any.fromFunction0(Egyptian), Karachi = js.Any.fromFunction0(Karachi), Kuwait = js.Any.fromFunction0(Kuwait), MoonsightingCommittee = js.Any.fromFunction0(MoonsightingCommittee), MuslimWorldLeague = js.Any.fromFunction0(MuslimWorldLeague), NorthAmerica = js.Any.fromFunction0(NorthAmerica), Other = js.Any.fromFunction0(Other), Qatar = js.Any.fromFunction0(Qatar), Singapore = js.Any.fromFunction0(Singapore), UmmAlQura = js.Any.fromFunction0(UmmAlQura))
  
    __obj.asInstanceOf[AdhanCalculationMethod]
  }
}

