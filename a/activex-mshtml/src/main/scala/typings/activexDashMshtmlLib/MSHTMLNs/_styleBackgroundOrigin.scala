package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBackgroundOrigin extends js.Object

@JSGlobal("MSHTML._styleBackgroundOrigin")
@js.native
object _styleBackgroundOrigin extends js.Object {
  @js.native
  sealed trait styleBackgroundOriginBorderBox
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundOrigin
  
  @js.native
  sealed trait styleBackgroundOriginContentBox
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundOrigin
  
  @js.native
  sealed trait styleBackgroundOriginNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundOrigin
  
  @js.native
  sealed trait styleBackgroundOriginPaddingBox
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundOrigin
  
  @js.native
  sealed trait styleBackgroundOrigin_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundOrigin
  
  /* 0 */ val styleBackgroundOriginBorderBox: styleBackgroundOriginBorderBox with scala.Double = js.native
  /* 2 */ val styleBackgroundOriginContentBox: styleBackgroundOriginContentBox with scala.Double = js.native
  /* 3 */ val styleBackgroundOriginNotSet: styleBackgroundOriginNotSet with scala.Double = js.native
  /* 1 */ val styleBackgroundOriginPaddingBox: styleBackgroundOriginPaddingBox with scala.Double = js.native
  /* 2147483647 */ val styleBackgroundOrigin_Max: styleBackgroundOrigin_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBackgroundOrigin with scala.Double] = js.native
}

