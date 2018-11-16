package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcExportXMLEncoding extends js.Object

@JSGlobal("Access.AcExportXMLEncoding")
@js.native
object AcExportXMLEncoding extends js.Object {
  @js.native
  sealed trait acUTF16
    extends activexDashAccessLib.AccessNs.AcExportXMLEncoding
  
  @js.native
  sealed trait acUTF8
    extends activexDashAccessLib.AccessNs.AcExportXMLEncoding
  
  /* 1 */ val acUTF16: acUTF16 with scala.Double = js.native
  /* 0 */ val acUTF8: acUTF8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcExportXMLEncoding with scala.Double] = js.native
}

