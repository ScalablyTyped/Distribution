package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SCHEMACONTENTTYPE extends js.Object

/** Schema Object Model Content Types */
@JSGlobal("MSXML2._SCHEMACONTENTTYPE")
@js.native
object _SCHEMACONTENTTYPE extends js.Object {
  @js.native
  sealed trait SCHEMACONTENTTYPE_ELEMENTONLY
    extends activexDashMsxml2Lib.MSXML2Ns._SCHEMACONTENTTYPE
  
  @js.native
  sealed trait SCHEMACONTENTTYPE_EMPTY
    extends activexDashMsxml2Lib.MSXML2Ns._SCHEMACONTENTTYPE
  
  @js.native
  sealed trait SCHEMACONTENTTYPE_MIXED
    extends activexDashMsxml2Lib.MSXML2Ns._SCHEMACONTENTTYPE
  
  @js.native
  sealed trait SCHEMACONTENTTYPE_TEXTONLY
    extends activexDashMsxml2Lib.MSXML2Ns._SCHEMACONTENTTYPE
  
  /* 2 */ val SCHEMACONTENTTYPE_ELEMENTONLY: SCHEMACONTENTTYPE_ELEMENTONLY with scala.Double = js.native
  /* 0 */ val SCHEMACONTENTTYPE_EMPTY: SCHEMACONTENTTYPE_EMPTY with scala.Double = js.native
  /* 3 */ val SCHEMACONTENTTYPE_MIXED: SCHEMACONTENTTYPE_MIXED with scala.Double = js.native
  /* 1 */ val SCHEMACONTENTTYPE_TEXTONLY: SCHEMACONTENTTYPE_TEXTONLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns._SCHEMACONTENTTYPE with scala.Double] = js.native
}

