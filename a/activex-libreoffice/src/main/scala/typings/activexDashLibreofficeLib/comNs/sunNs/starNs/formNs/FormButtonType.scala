package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormButtonType extends js.Object

/**
  * specifies the action to execute when a button is pressed.
  * @see com.sun.star.form.component.CommandButton
  */
@JSGlobal("com.sun.star.form.FormButtonType")
@js.native
object FormButtonType extends js.Object {
  /** requires the button to act like a common push button, means no special action is triggered. */
  @js.native
  sealed trait PUSH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormButtonType
  
  /** When the button is clicked, it performs a reset on its containing form. */
  @js.native
  sealed trait RESET
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormButtonType
  
  /** When the button is clicked, it performs a submit on its containing form. */
  @js.native
  sealed trait SUBMIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormButtonType
  
  /**
    * When the button is clicked, an URL set for the button is opened.
    * @see com.sun.star.form.component.CommandButton.TargetURL
    * @see com.sun.star.form.component.CommandButton.TargetFrame Specifies to use "application/x-www-form-urlencoded" as submit encoding.  Usually used if t
    */
  @js.native
  sealed trait URL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormButtonType
  
  /* 0 */ val PUSH: PUSH with scala.Double = js.native
  /* 2 */ val RESET: RESET with scala.Double = js.native
  /* 1 */ val SUBMIT: SUBMIT with scala.Double = js.native
  /* 3 */ val URL: URL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormButtonType with scala.Double
  ] = js.native
}

