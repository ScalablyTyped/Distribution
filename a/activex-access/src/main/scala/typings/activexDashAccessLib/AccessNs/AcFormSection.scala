package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFormSection extends js.Object

@JSGlobal("Access.AcFormSection")
@js.native
object AcFormSection extends js.Object {
  @js.native
  sealed trait acDetail
    extends activexDashAccessLib.AccessNs.AcFormSection
  
  @js.native
  sealed trait acFooter
    extends activexDashAccessLib.AccessNs.AcFormSection
  
  @js.native
  sealed trait acHeader
    extends activexDashAccessLib.AccessNs.AcFormSection
  
  @js.native
  sealed trait acPageFooter
    extends activexDashAccessLib.AccessNs.AcFormSection
  
  @js.native
  sealed trait acPageHeader
    extends activexDashAccessLib.AccessNs.AcFormSection
  
  /* 0 */ val acDetail: acDetail with scala.Double = js.native
  /* 2 */ val acFooter: acFooter with scala.Double = js.native
  /* 1 */ val acHeader: acHeader with scala.Double = js.native
  /* 4 */ val acPageFooter: acPageFooter with scala.Double = js.native
  /* 3 */ val acPageHeader: acPageHeader with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFormSection with scala.Double] = js.native
}

