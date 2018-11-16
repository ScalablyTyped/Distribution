package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpMediaType extends js.Object

@JSGlobal("PowerPoint.PpMediaType")
@js.native
object PpMediaType extends js.Object {
  @js.native
  sealed trait ppMediaTypeMixed
    extends activexDashPowerpointLib.PowerPointNs.PpMediaType
  
  @js.native
  sealed trait ppMediaTypeMovie
    extends activexDashPowerpointLib.PowerPointNs.PpMediaType
  
  @js.native
  sealed trait ppMediaTypeOther
    extends activexDashPowerpointLib.PowerPointNs.PpMediaType
  
  @js.native
  sealed trait ppMediaTypeSound
    extends activexDashPowerpointLib.PowerPointNs.PpMediaType
  
  /* -2 */ val ppMediaTypeMixed: ppMediaTypeMixed with scala.Double = js.native
  /* 3 */ val ppMediaTypeMovie: ppMediaTypeMovie with scala.Double = js.native
  /* 1 */ val ppMediaTypeOther: ppMediaTypeOther with scala.Double = js.native
  /* 2 */ val ppMediaTypeSound: ppMediaTypeSound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpMediaType with scala.Double] = js.native
}

