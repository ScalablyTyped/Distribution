package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormSubmitMethod extends js.Object

/** specifies how information is sent to a program invoked by submitting a form. */
@JSGlobal("com.sun.star.form.FormSubmitMethod")
@js.native
object FormSubmitMethod extends js.Object {
  /** specifies to append the input information of a form to the target URL as parameters. */
  @js.native
  sealed trait GET
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitMethod
  
  /** specifies to send the input information in a data body. */
  @js.native
  sealed trait POST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitMethod
  
  /* 0 */ val GET: GET with scala.Double = js.native
  /* 1 */ val POST: POST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitMethod with scala.Double
  ] = js.native
}

