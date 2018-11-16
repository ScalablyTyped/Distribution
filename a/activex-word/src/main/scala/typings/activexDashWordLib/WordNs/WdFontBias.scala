package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFontBias extends js.Object

@JSGlobal("Word.WdFontBias")
@js.native
object WdFontBias extends js.Object {
  @js.native
  sealed trait wdFontBiasDefault
    extends activexDashWordLib.WordNs.WdFontBias
  
  @js.native
  sealed trait wdFontBiasDontCare
    extends activexDashWordLib.WordNs.WdFontBias
  
  @js.native
  sealed trait wdFontBiasFareast
    extends activexDashWordLib.WordNs.WdFontBias
  
  /* 0 */ val wdFontBiasDefault: wdFontBiasDefault with scala.Double = js.native
  /* 255 */ val wdFontBiasDontCare: wdFontBiasDontCare with scala.Double = js.native
  /* 1 */ val wdFontBiasFareast: wdFontBiasFareast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFontBias with scala.Double] = js.native
}

