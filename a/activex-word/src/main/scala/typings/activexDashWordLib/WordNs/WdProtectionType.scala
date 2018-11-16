package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdProtectionType extends js.Object

@JSGlobal("Word.WdProtectionType")
@js.native
object WdProtectionType extends js.Object {
  @js.native
  sealed trait wdAllowOnlyComments
    extends activexDashWordLib.WordNs.WdProtectionType
  
  @js.native
  sealed trait wdAllowOnlyFormFields
    extends activexDashWordLib.WordNs.WdProtectionType
  
  @js.native
  sealed trait wdAllowOnlyReading
    extends activexDashWordLib.WordNs.WdProtectionType
  
  @js.native
  sealed trait wdAllowOnlyRevisions
    extends activexDashWordLib.WordNs.WdProtectionType
  
  @js.native
  sealed trait wdNoProtection
    extends activexDashWordLib.WordNs.WdProtectionType
  
  /* 1 */ val wdAllowOnlyComments: wdAllowOnlyComments with scala.Double = js.native
  /* 2 */ val wdAllowOnlyFormFields: wdAllowOnlyFormFields with scala.Double = js.native
  /* 3 */ val wdAllowOnlyReading: wdAllowOnlyReading with scala.Double = js.native
  /* 0 */ val wdAllowOnlyRevisions: wdAllowOnlyRevisions with scala.Double = js.native
  /* -1 */ val wdNoProtection: wdNoProtection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdProtectionType with scala.Double] = js.native
}

