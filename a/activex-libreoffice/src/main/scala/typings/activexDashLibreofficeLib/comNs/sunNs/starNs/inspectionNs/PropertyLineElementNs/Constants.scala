package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.PropertyLineElementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.inspection.PropertyLineElement.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait All
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.PropertyLineElementNs.Constants
  
  @js.native
  sealed trait InputControl
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.PropertyLineElementNs.Constants
  
  @js.native
  sealed trait PrimaryButton
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.PropertyLineElementNs.Constants
  
  @js.native
  sealed trait SecondaryButton
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.PropertyLineElementNs.Constants
  
  /* 255 */ val All: All with scala.Double = js.native
  /* 1 */ val InputControl: InputControl with scala.Double = js.native
  /* 2 */ val PrimaryButton: PrimaryButton with scala.Double = js.native
  /* 4 */ val SecondaryButton: SecondaryButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.PropertyLineElementNs.Constants with scala.Double
  ] = js.native
}

