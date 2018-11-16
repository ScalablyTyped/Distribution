package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SCHEMAPROCESSCONTENTS extends js.Object

/** Schema Object Model Process Contents */
@JSGlobal("MSXML2.SCHEMAPROCESSCONTENTS")
@js.native
object SCHEMAPROCESSCONTENTS extends js.Object {
  @js.native
  sealed trait SCHEMAPROCESSCONTENTS_LAX
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMAPROCESSCONTENTS
  
  @js.native
  sealed trait SCHEMAPROCESSCONTENTS_NONE
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMAPROCESSCONTENTS
  
  @js.native
  sealed trait SCHEMAPROCESSCONTENTS_SKIP
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMAPROCESSCONTENTS
  
  @js.native
  sealed trait SCHEMAPROCESSCONTENTS_STRICT
    extends activexDashMsxml2Lib.MSXML2Ns.SCHEMAPROCESSCONTENTS
  
  /* 2 */ val SCHEMAPROCESSCONTENTS_LAX: SCHEMAPROCESSCONTENTS_LAX with scala.Double = js.native
  /* 0 */ val SCHEMAPROCESSCONTENTS_NONE: SCHEMAPROCESSCONTENTS_NONE with scala.Double = js.native
  /* 1 */ val SCHEMAPROCESSCONTENTS_SKIP: SCHEMAPROCESSCONTENTS_SKIP with scala.Double = js.native
  /* 3 */ val SCHEMAPROCESSCONTENTS_STRICT: SCHEMAPROCESSCONTENTS_STRICT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns.SCHEMAPROCESSCONTENTS with scala.Double] = js.native
}

