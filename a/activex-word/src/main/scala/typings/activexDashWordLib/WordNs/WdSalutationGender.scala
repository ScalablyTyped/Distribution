package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSalutationGender extends js.Object

@JSGlobal("Word.WdSalutationGender")
@js.native
object WdSalutationGender extends js.Object {
  @js.native
  sealed trait wdGenderFemale
    extends activexDashWordLib.WordNs.WdSalutationGender
  
  @js.native
  sealed trait wdGenderMale
    extends activexDashWordLib.WordNs.WdSalutationGender
  
  @js.native
  sealed trait wdGenderNeutral
    extends activexDashWordLib.WordNs.WdSalutationGender
  
  @js.native
  sealed trait wdGenderUnknown
    extends activexDashWordLib.WordNs.WdSalutationGender
  
  /* 0 */ val wdGenderFemale: wdGenderFemale with scala.Double = js.native
  /* 1 */ val wdGenderMale: wdGenderMale with scala.Double = js.native
  /* 2 */ val wdGenderNeutral: wdGenderNeutral with scala.Double = js.native
  /* 3 */ val wdGenderUnknown: wdGenderUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSalutationGender with scala.Double] = js.native
}

