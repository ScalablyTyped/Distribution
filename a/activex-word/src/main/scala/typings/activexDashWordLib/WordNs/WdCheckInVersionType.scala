package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCheckInVersionType extends js.Object

@JSGlobal("Word.WdCheckInVersionType")
@js.native
object WdCheckInVersionType extends js.Object {
  @js.native
  sealed trait wdCheckInMajorVersion
    extends activexDashWordLib.WordNs.WdCheckInVersionType
  
  @js.native
  sealed trait wdCheckInMinorVersion
    extends activexDashWordLib.WordNs.WdCheckInVersionType
  
  @js.native
  sealed trait wdCheckInOverwriteVersion
    extends activexDashWordLib.WordNs.WdCheckInVersionType
  
  /* 1 */ val wdCheckInMajorVersion: wdCheckInMajorVersion with scala.Double = js.native
  /* 0 */ val wdCheckInMinorVersion: wdCheckInMinorVersion with scala.Double = js.native
  /* 2 */ val wdCheckInOverwriteVersion: wdCheckInOverwriteVersion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCheckInVersionType with scala.Double] = js.native
}

