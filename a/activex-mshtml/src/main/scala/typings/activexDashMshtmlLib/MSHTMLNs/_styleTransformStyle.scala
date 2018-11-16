package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTransformStyle extends js.Object

@JSGlobal("MSHTML._styleTransformStyle")
@js.native
object _styleTransformStyle extends js.Object {
  @js.native
  sealed trait styleTransformStyleFlat
    extends activexDashMshtmlLib.MSHTMLNs._styleTransformStyle
  
  @js.native
  sealed trait styleTransformStyleNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleTransformStyle
  
  @js.native
  sealed trait styleTransformStylePreserve3D
    extends activexDashMshtmlLib.MSHTMLNs._styleTransformStyle
  
  @js.native
  sealed trait styleTransformStyle_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTransformStyle
  
  /* 0 */ val styleTransformStyleFlat: styleTransformStyleFlat with scala.Double = js.native
  /* 2 */ val styleTransformStyleNotSet: styleTransformStyleNotSet with scala.Double = js.native
  /* 1 */ val styleTransformStylePreserve3D: styleTransformStylePreserve3D with scala.Double = js.native
  /* 2147483647 */ val styleTransformStyle_Max: styleTransformStyle_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTransformStyle with scala.Double] = js.native
}

