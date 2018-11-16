package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleDir extends js.Object

@JSGlobal("MSHTML._styleDir")
@js.native
object _styleDir extends js.Object {
  @js.native
  sealed trait styleDirInherit
    extends activexDashMshtmlLib.MSHTMLNs._styleDir
  
  @js.native
  sealed trait styleDirLeftToRight
    extends activexDashMshtmlLib.MSHTMLNs._styleDir
  
  @js.native
  sealed trait styleDirNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleDir
  
  @js.native
  sealed trait styleDirRightToLeft
    extends activexDashMshtmlLib.MSHTMLNs._styleDir
  
  @js.native
  sealed trait styleDir_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleDir
  
  /* 3 */ val styleDirInherit: styleDirInherit with scala.Double = js.native
  /* 1 */ val styleDirLeftToRight: styleDirLeftToRight with scala.Double = js.native
  /* 0 */ val styleDirNotSet: styleDirNotSet with scala.Double = js.native
  /* 2 */ val styleDirRightToLeft: styleDirRightToLeft with scala.Double = js.native
  /* 2147483647 */ val styleDir_Max: styleDir_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleDir with scala.Double] = js.native
}

