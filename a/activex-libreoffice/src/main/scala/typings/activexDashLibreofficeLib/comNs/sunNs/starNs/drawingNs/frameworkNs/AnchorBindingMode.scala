package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnchorBindingMode extends js.Object

/**
  * This enum specifies how a resource is bound to an anchor. This can be direct or indirect.
  *
  * Example: Let r:a1:a2 denote a resource r which is bound to anchor a1:a2 which itself is a resource a1 bound to anchor a2. Then r:a1:a2 is bound
  * directly to a1:a2 and indirectly to a2.
  */
@JSGlobal("com.sun.star.drawing.framework.AnchorBindingMode")
@js.native
object AnchorBindingMode extends js.Object {
  @js.native
  sealed trait DIRECT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.AnchorBindingMode
  
  @js.native
  sealed trait INDIRECT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.AnchorBindingMode
  
  /* 0 */ val DIRECT: DIRECT with scala.Double = js.native
  /* 1 */ val INDIRECT: INDIRECT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.AnchorBindingMode with scala.Double
  ] = js.native
}

