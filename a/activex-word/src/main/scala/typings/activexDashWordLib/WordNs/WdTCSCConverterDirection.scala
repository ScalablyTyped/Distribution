package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTCSCConverterDirection extends js.Object

@JSGlobal("Word.WdTCSCConverterDirection")
@js.native
object WdTCSCConverterDirection extends js.Object {
  @js.native
  sealed trait wdTCSCConverterDirectionAuto
    extends activexDashWordLib.WordNs.WdTCSCConverterDirection
  
  @js.native
  sealed trait wdTCSCConverterDirectionSCTC
    extends activexDashWordLib.WordNs.WdTCSCConverterDirection
  
  @js.native
  sealed trait wdTCSCConverterDirectionTCSC
    extends activexDashWordLib.WordNs.WdTCSCConverterDirection
  
  /* 2 */ val wdTCSCConverterDirectionAuto: wdTCSCConverterDirectionAuto with scala.Double = js.native
  /* 0 */ val wdTCSCConverterDirectionSCTC: wdTCSCConverterDirectionSCTC with scala.Double = js.native
  /* 1 */ val wdTCSCConverterDirectionTCSC: wdTCSCConverterDirectionTCSC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTCSCConverterDirection with scala.Double] = js.native
}

