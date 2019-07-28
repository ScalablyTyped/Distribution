package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specify the MIME encoding to be used when form data is submitted. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait FormSubmitEncoding extends js.Object

object FormSubmitEncoding {
  /**
    * Specifies to use "multipart/form-data" as submit encoding.
    *
    * Usually used when the form contains a file upload element.
    */
  @scala.inline
  def MULTIPART: `1` = this.cast(1)
  /**
    * specifies to use "text/plain"
    *
    * Usually used if the FormSubmitMethod attribute has the value POST and the content should be reviewed as full text.
    */
  @scala.inline
  def TEXT: `2` = this.cast(2)
  /**
    * When the button is clicked, an URL set for the button is opened.
    * @see com.sun.star.form.component.CommandButton.TargetURL
    * @see com.sun.star.form.component.CommandButton.TargetFrame Specifies to use "application/x-www-form-urlencoded" as submit encoding.  Usually used if t
    */
  @scala.inline
  def URL: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

