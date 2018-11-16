package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartGallery extends js.Object

@JSGlobal("PowerPoint.XlChartGallery")
@js.native
object XlChartGallery extends js.Object {
  @js.native
  sealed trait xlAnyGallery
    extends activexDashPowerpointLib.PowerPointNs.XlChartGallery
  
  @js.native
  sealed trait xlBuiltIn
    extends activexDashPowerpointLib.PowerPointNs.XlChartGallery
  
  @js.native
  sealed trait xlUserDefined
    extends activexDashPowerpointLib.PowerPointNs.XlChartGallery
  
  /* 23 */ val xlAnyGallery: xlAnyGallery with scala.Double = js.native
  /* 21 */ val xlBuiltIn: xlBuiltIn with scala.Double = js.native
  /* 22 */ val xlUserDefined: xlUserDefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlChartGallery with scala.Double] = js.native
}

