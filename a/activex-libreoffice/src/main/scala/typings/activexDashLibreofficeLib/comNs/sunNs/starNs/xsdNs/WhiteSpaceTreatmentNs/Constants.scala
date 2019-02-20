package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.WhiteSpaceTreatmentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.xsd.WhiteSpaceTreatment.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait Collapse
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.WhiteSpaceTreatmentNs.Constants
  
  @js.native
  sealed trait Preserve
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.WhiteSpaceTreatmentNs.Constants
  
  @js.native
  sealed trait Replace
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.WhiteSpaceTreatmentNs.Constants
  
  /* 2 */ val Collapse: Collapse with scala.Double = js.native
  /* 0 */ val Preserve: Preserve with scala.Double = js.native
  /* 1 */ val Replace: Replace with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.WhiteSpaceTreatmentNs.Constants with scala.Double
  ] = js.native
}

