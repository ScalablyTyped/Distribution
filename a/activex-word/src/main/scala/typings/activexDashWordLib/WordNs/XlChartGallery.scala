package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartGallery extends js.Object

@JSGlobal("Word.XlChartGallery")
@js.native
object XlChartGallery extends js.Object {
  @js.native
  sealed trait xlAnyGallery
    extends activexDashWordLib.WordNs.XlChartGallery
  
  @js.native
  sealed trait xlBuiltIn
    extends activexDashWordLib.WordNs.XlChartGallery
  
  @js.native
  sealed trait xlUserDefined
    extends activexDashWordLib.WordNs.XlChartGallery
  
  /* 23 */ val xlAnyGallery: xlAnyGallery with scala.Double = js.native
  /* 21 */ val xlBuiltIn: xlBuiltIn with scala.Double = js.native
  /* 22 */ val xlUserDefined: xlUserDefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlChartGallery with scala.Double] = js.native
}

