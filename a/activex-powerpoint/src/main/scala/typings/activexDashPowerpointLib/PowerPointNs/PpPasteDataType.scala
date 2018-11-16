package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpPasteDataType extends js.Object

@JSGlobal("PowerPoint.PpPasteDataType")
@js.native
object PpPasteDataType extends js.Object {
  @js.native
  sealed trait ppPasteBitmap
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteDefault
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteEnhancedMetafile
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteGIF
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteHTML
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteJPG
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteMetafilePicture
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteOLEObject
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPastePNG
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteRTF
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteShape
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  @js.native
  sealed trait ppPasteText
    extends activexDashPowerpointLib.PowerPointNs.PpPasteDataType
  
  /* 1 */ val ppPasteBitmap: ppPasteBitmap with scala.Double = js.native
  /* 0 */ val ppPasteDefault: ppPasteDefault with scala.Double = js.native
  /* 2 */ val ppPasteEnhancedMetafile: ppPasteEnhancedMetafile with scala.Double = js.native
  /* 4 */ val ppPasteGIF: ppPasteGIF with scala.Double = js.native
  /* 8 */ val ppPasteHTML: ppPasteHTML with scala.Double = js.native
  /* 5 */ val ppPasteJPG: ppPasteJPG with scala.Double = js.native
  /* 3 */ val ppPasteMetafilePicture: ppPasteMetafilePicture with scala.Double = js.native
  /* 10 */ val ppPasteOLEObject: ppPasteOLEObject with scala.Double = js.native
  /* 6 */ val ppPastePNG: ppPastePNG with scala.Double = js.native
  /* 9 */ val ppPasteRTF: ppPasteRTF with scala.Double = js.native
  /* 11 */ val ppPasteShape: ppPasteShape with scala.Double = js.native
  /* 7 */ val ppPasteText: ppPasteText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpPasteDataType with scala.Double] = js.native
}

