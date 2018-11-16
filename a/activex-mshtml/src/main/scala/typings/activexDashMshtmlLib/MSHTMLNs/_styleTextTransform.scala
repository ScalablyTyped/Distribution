package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTextTransform extends js.Object

@JSGlobal("MSHTML._styleTextTransform")
@js.native
object _styleTextTransform extends js.Object {
  @js.native
  sealed trait styleTextTransformCapitalize
    extends activexDashMshtmlLib.MSHTMLNs._styleTextTransform
  
  @js.native
  sealed trait styleTextTransformLowercase
    extends activexDashMshtmlLib.MSHTMLNs._styleTextTransform
  
  @js.native
  sealed trait styleTextTransformNone
    extends activexDashMshtmlLib.MSHTMLNs._styleTextTransform
  
  @js.native
  sealed trait styleTextTransformNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleTextTransform
  
  @js.native
  sealed trait styleTextTransformUppercase
    extends activexDashMshtmlLib.MSHTMLNs._styleTextTransform
  
  @js.native
  sealed trait styleTextTransform_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTextTransform
  
  /* 1 */ val styleTextTransformCapitalize: styleTextTransformCapitalize with scala.Double = js.native
  /* 2 */ val styleTextTransformLowercase: styleTextTransformLowercase with scala.Double = js.native
  /* 4 */ val styleTextTransformNone: styleTextTransformNone with scala.Double = js.native
  /* 0 */ val styleTextTransformNotSet: styleTextTransformNotSet with scala.Double = js.native
  /* 3 */ val styleTextTransformUppercase: styleTextTransformUppercase with scala.Double = js.native
  /* 2147483647 */ val styleTextTransform_Max: styleTextTransform_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTextTransform with scala.Double] = js.native
}

