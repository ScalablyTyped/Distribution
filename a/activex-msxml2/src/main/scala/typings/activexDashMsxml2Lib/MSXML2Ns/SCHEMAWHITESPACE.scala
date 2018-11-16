package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SCHEMAWHITESPACE extends js.Object

/** Schema Object Model Whitespace facet values */
@JSGlobal("MSXML2.SCHEMAWHITESPACE")
@js.native
object SCHEMAWHITESPACE extends js.Object {
  @js.native
  sealed trait SCHEMAWHITESPACE_COLLAPSE
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMAWHITESPACE
  
  @js.native
  sealed trait SCHEMAWHITESPACE_NONE
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMAWHITESPACE
  
  @js.native
  sealed trait SCHEMAWHITESPACE_PRESERVE
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMAWHITESPACE
  
  @js.native
  sealed trait SCHEMAWHITESPACE_REPLACE
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMAWHITESPACE
  
  /* 2 */ val SCHEMAWHITESPACE_COLLAPSE: SCHEMAWHITESPACE_COLLAPSE with scala.Double = js.native
  /* -1 */ val SCHEMAWHITESPACE_NONE: SCHEMAWHITESPACE_NONE with scala.Double = js.native
  /* 0 */ val SCHEMAWHITESPACE_PRESERVE: SCHEMAWHITESPACE_PRESERVE with scala.Double = js.native
  /* 1 */ val SCHEMAWHITESPACE_REPLACE: SCHEMAWHITESPACE_REPLACE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns.SCHEMAWHITESPACE with scala.Double] = js.native
}

