package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpHTMLVersion extends js.Object

@JSGlobal("PowerPoint.PpHTMLVersion")
@js.native
object PpHTMLVersion extends js.Object {
  @js.native
  sealed trait ppHTMLAutodetect
    extends activexDashPowerpointLib.PowerPointNs.PpHTMLVersion
  
  @js.native
  sealed trait ppHTMLDual
    extends activexDashPowerpointLib.PowerPointNs.PpHTMLVersion
  
  @js.native
  sealed trait ppHTMLv3
    extends activexDashPowerpointLib.PowerPointNs.PpHTMLVersion
  
  @js.native
  sealed trait ppHTMLv4
    extends activexDashPowerpointLib.PowerPointNs.PpHTMLVersion
  
  /* 4 */ val ppHTMLAutodetect: ppHTMLAutodetect with scala.Double = js.native
  /* 3 */ val ppHTMLDual: ppHTMLDual with scala.Double = js.native
  /* 1 */ val ppHTMLv3: ppHTMLv3 with scala.Double = js.native
  /* 2 */ val ppHTMLv4: ppHTMLv4 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpHTMLVersion with scala.Double] = js.native
}

