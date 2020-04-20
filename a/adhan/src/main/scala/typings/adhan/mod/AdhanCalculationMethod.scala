package typings.adhan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdhanCalculationMethod extends js.Object {
  def Dubai(): Parameter
  def Egyptian(): Parameter
  def Karachi(): Parameter
  def Kuwait(): Parameter
  def MoonsightingCommittee(): Parameter
  def MuslimWorldLeague(): Parameter
  def NorthAmerica(): Parameter
  def Other(): Parameter
  def Qatar(): Parameter
  def Singapore(): Parameter
  def UmmAlQura(): Parameter
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
}

