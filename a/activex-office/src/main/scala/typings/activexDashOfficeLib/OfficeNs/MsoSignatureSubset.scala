package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSignatureSubset extends js.Object

@JSGlobal("Office.MsoSignatureSubset")
@js.native
object MsoSignatureSubset extends js.Object {
  @js.native
  sealed trait msoSignatureSubsetAll
    extends activexDashOfficeLib.OfficeNs.MsoSignatureSubset
  
  @js.native
  sealed trait msoSignatureSubsetSignatureLines
    extends activexDashOfficeLib.OfficeNs.MsoSignatureSubset
  
  @js.native
  sealed trait msoSignatureSubsetSignatureLinesSigned
    extends activexDashOfficeLib.OfficeNs.MsoSignatureSubset
  
  @js.native
  sealed trait msoSignatureSubsetSignatureLinesUnsigned
    extends activexDashOfficeLib.OfficeNs.MsoSignatureSubset
  
  @js.native
  sealed trait msoSignatureSubsetSignaturesAllSigs
    extends activexDashOfficeLib.OfficeNs.MsoSignatureSubset
  
  @js.native
  sealed trait msoSignatureSubsetSignaturesNonVisible
    extends activexDashOfficeLib.OfficeNs.MsoSignatureSubset
  
  /* 5 */ val msoSignatureSubsetAll: msoSignatureSubsetAll with scala.Double = js.native
  /* 2 */ val msoSignatureSubsetSignatureLines: msoSignatureSubsetSignatureLines with scala.Double = js.native
  /* 3 */ val msoSignatureSubsetSignatureLinesSigned: msoSignatureSubsetSignatureLinesSigned with scala.Double = js.native
  /* 4 */ val msoSignatureSubsetSignatureLinesUnsigned: msoSignatureSubsetSignatureLinesUnsigned with scala.Double = js.native
  /* 0 */ val msoSignatureSubsetSignaturesAllSigs: msoSignatureSubsetSignaturesAllSigs with scala.Double = js.native
  /* 1 */ val msoSignatureSubsetSignaturesNonVisible: msoSignatureSubsetSignaturesNonVisible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSignatureSubset with scala.Double] = js.native
}

