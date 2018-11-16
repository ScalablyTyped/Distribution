package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpShapeFormat extends js.Object

@JSGlobal("PowerPoint.PpShapeFormat")
@js.native
object PpShapeFormat extends js.Object {
  @js.native
  sealed trait ppShapeFormatBMP
    extends activexDashPowerpointLib.PowerPointNs.PpShapeFormat
  
  @js.native
  sealed trait ppShapeFormatEMF
    extends activexDashPowerpointLib.PowerPointNs.PpShapeFormat
  
  @js.native
  sealed trait ppShapeFormatGIF
    extends activexDashPowerpointLib.PowerPointNs.PpShapeFormat
  
  @js.native
  sealed trait ppShapeFormatJPG
    extends activexDashPowerpointLib.PowerPointNs.PpShapeFormat
  
  @js.native
  sealed trait ppShapeFormatPNG
    extends activexDashPowerpointLib.PowerPointNs.PpShapeFormat
  
  @js.native
  sealed trait ppShapeFormatWMF
    extends activexDashPowerpointLib.PowerPointNs.PpShapeFormat
  
  /* 3 */ val ppShapeFormatBMP: ppShapeFormatBMP with scala.Double = js.native
  /* 5 */ val ppShapeFormatEMF: ppShapeFormatEMF with scala.Double = js.native
  /* 0 */ val ppShapeFormatGIF: ppShapeFormatGIF with scala.Double = js.native
  /* 1 */ val ppShapeFormatJPG: ppShapeFormatJPG with scala.Double = js.native
  /* 2 */ val ppShapeFormatPNG: ppShapeFormatPNG with scala.Double = js.native
  /* 4 */ val ppShapeFormatWMF: ppShapeFormatWMF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpShapeFormat with scala.Double] = js.native
}

