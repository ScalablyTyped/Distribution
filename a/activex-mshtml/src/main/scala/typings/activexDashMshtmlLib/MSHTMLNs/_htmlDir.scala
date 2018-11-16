package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlDir extends js.Object

@JSGlobal("MSHTML._htmlDir")
@js.native
object _htmlDir extends js.Object {
  @js.native
  sealed trait htmlDirLeftToRight
    extends activexDashMshtmlLib.MSHTMLNs._htmlDir
  
  @js.native
  sealed trait htmlDirNotSet
    extends activexDashMshtmlLib.MSHTMLNs._htmlDir
  
  @js.native
  sealed trait htmlDirRightToLeft
    extends activexDashMshtmlLib.MSHTMLNs._htmlDir
  
  @js.native
  sealed trait htmlDir_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlDir
  
  /* 1 */ val htmlDirLeftToRight: htmlDirLeftToRight with scala.Double = js.native
  /* 0 */ val htmlDirNotSet: htmlDirNotSet with scala.Double = js.native
  /* 2 */ val htmlDirRightToLeft: htmlDirRightToLeft with scala.Double = js.native
  /* 2147483647 */ val htmlDir_Max: htmlDir_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlDir with scala.Double] = js.native
}

