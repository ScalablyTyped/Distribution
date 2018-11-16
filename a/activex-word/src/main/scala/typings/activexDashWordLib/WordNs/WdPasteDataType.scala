package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPasteDataType extends js.Object

@JSGlobal("Word.WdPasteDataType")
@js.native
object WdPasteDataType extends js.Object {
  @js.native
  sealed trait wdPasteBitmap
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteDeviceIndependentBitmap
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteEnhancedMetafile
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteHTML
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteHyperlink
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteMetafilePicture
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteOLEObject
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteRTF
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteShape
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  @js.native
  sealed trait wdPasteText
    extends activexDashWordLib.WordNs.WdPasteDataType
  
  /* 4 */ val wdPasteBitmap: wdPasteBitmap with scala.Double = js.native
  /* 5 */ val wdPasteDeviceIndependentBitmap: wdPasteDeviceIndependentBitmap with scala.Double = js.native
  /* 9 */ val wdPasteEnhancedMetafile: wdPasteEnhancedMetafile with scala.Double = js.native
  /* 10 */ val wdPasteHTML: wdPasteHTML with scala.Double = js.native
  /* 7 */ val wdPasteHyperlink: wdPasteHyperlink with scala.Double = js.native
  /* 3 */ val wdPasteMetafilePicture: wdPasteMetafilePicture with scala.Double = js.native
  /* 0 */ val wdPasteOLEObject: wdPasteOLEObject with scala.Double = js.native
  /* 1 */ val wdPasteRTF: wdPasteRTF with scala.Double = js.native
  /* 8 */ val wdPasteShape: wdPasteShape with scala.Double = js.native
  /* 2 */ val wdPasteText: wdPasteText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPasteDataType with scala.Double] = js.native
}

