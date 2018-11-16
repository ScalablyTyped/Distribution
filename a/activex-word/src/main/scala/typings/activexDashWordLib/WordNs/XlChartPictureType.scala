package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartPictureType extends js.Object

@JSGlobal("Word.XlChartPictureType")
@js.native
object XlChartPictureType extends js.Object {
  @js.native
  sealed trait xlStack
    extends activexDashWordLib.WordNs.XlChartPictureType
  
  @js.native
  sealed trait xlStackScale
    extends activexDashWordLib.WordNs.XlChartPictureType
  
  @js.native
  sealed trait xlStretch
    extends activexDashWordLib.WordNs.XlChartPictureType
  
  /* 2 */ val xlStack: xlStack with scala.Double = js.native
  /* 3 */ val xlStackScale: xlStackScale with scala.Double = js.native
  /* 1 */ val xlStretch: xlStretch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlChartPictureType with scala.Double] = js.native
}

