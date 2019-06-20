package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the action to execute when a button is pressed.
  * @see com.sun.star.form.component.CommandButton
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
*/
trait FormButtonType extends js.Object

object FormButtonType {
  /** requires the button to act like a common push button, means no special action is triggered. */
  @scala.inline
  def PUSH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** When the button is clicked, it performs a reset on its containing form. */
  @scala.inline
  def RESET: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** When the button is clicked, it performs a submit on its containing form. */
  @scala.inline
  def SUBMIT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * When the button is clicked, an URL set for the button is opened.
    * @see com.sun.star.form.component.CommandButton.TargetURL
    * @see com.sun.star.form.component.CommandButton.TargetFrame Specifies to use "application/x-www-form-urlencoded" as submit encoding.  Usually used if t
    */
  @scala.inline
  def URL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

