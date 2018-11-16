package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatID extends js.Object

/** String versions of globally unique identifiers (GUIDs) that indicate the file format of an image. */
@JSGlobal("WIA.FormatID")
@js.native
object FormatID extends js.Object {
  @js.native
  sealed trait wiaFormatBMP
    extends activexDashWiaLib.WIANs.FormatID
  
  @js.native
  sealed trait wiaFormatGIF
    extends activexDashWiaLib.WIANs.FormatID
  
  @js.native
  sealed trait wiaFormatJPEG
    extends activexDashWiaLib.WIANs.FormatID
  
  @js.native
  sealed trait wiaFormatPNG
    extends activexDashWiaLib.WIANs.FormatID
  
  @js.native
  sealed trait wiaFormatTIFF
    extends activexDashWiaLib.WIANs.FormatID
  
  /* "{B96B3CAB-0728-11D3-9D7B-0000F81EF32E}" */ val wiaFormatBMP: wiaFormatBMP with java.lang.String = js.native
  /* "{B96B3CB0-0728-11D3-9D7B-0000F81EF32E}" */ val wiaFormatGIF: wiaFormatGIF with java.lang.String = js.native
  /* "{B96B3CAE-0728-11D3-9D7B-0000F81EF32E}" */ val wiaFormatJPEG: wiaFormatJPEG with java.lang.String = js.native
  /* "{B96B3CAF-0728-11D3-9D7B-0000F81EF32E}" */ val wiaFormatPNG: wiaFormatPNG with java.lang.String = js.native
  /* "{B96B3CB1-0728-11D3-9D7B-0000F81EF32E}" */ val wiaFormatTIFF: wiaFormatTIFF with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[activexDashWiaLib.WIANs.FormatID with java.lang.String] = js.native
}

