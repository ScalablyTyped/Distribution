package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSalutationType extends js.Object

@JSGlobal("Word.WdSalutationType")
@js.native
object WdSalutationType extends js.Object {
  @js.native
  sealed trait wdSalutationBusiness
    extends activexDashWordLib.WordNs.WdSalutationType
  
  @js.native
  sealed trait wdSalutationFormal
    extends activexDashWordLib.WordNs.WdSalutationType
  
  @js.native
  sealed trait wdSalutationInformal
    extends activexDashWordLib.WordNs.WdSalutationType
  
  @js.native
  sealed trait wdSalutationOther
    extends activexDashWordLib.WordNs.WdSalutationType
  
  /* 2 */ val wdSalutationBusiness: wdSalutationBusiness with scala.Double = js.native
  /* 1 */ val wdSalutationFormal: wdSalutationFormal with scala.Double = js.native
  /* 0 */ val wdSalutationInformal: wdSalutationInformal with scala.Double = js.native
  /* 3 */ val wdSalutationOther: wdSalutationOther with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSalutationType with scala.Double] = js.native
}

