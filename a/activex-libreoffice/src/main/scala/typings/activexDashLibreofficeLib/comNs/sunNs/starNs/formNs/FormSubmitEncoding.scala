package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormSubmitEncoding extends js.Object

/** specify the MIME encoding to be used when form data is submitted. */
@JSGlobal("com.sun.star.form.FormSubmitEncoding")
@js.native
object FormSubmitEncoding extends js.Object {
  /**
    * Specifies to use "multipart/form-data" as submit encoding.
    *
    * Usually used when the form contains a file upload element.
    */
  @js.native
  sealed trait MULTIPART
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitEncoding
  
  /**
    * specifies to use "text/plain"
    *
    * Usually used if the FormSubmitMethod attribute has the value POST and the content should be reviewed as full text.
    */
  @js.native
  sealed trait TEXT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitEncoding
  
  /**
    * When the button is clicked, an URL set for the button is opened.
    * @see com.sun.star.form.component.CommandButton.TargetURL
    * @see com.sun.star.form.component.CommandButton.TargetFrame Specifies to use "application/x-www-form-urlencoded" as submit encoding.  Usually used if t
    */
  @js.native
  sealed trait URL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitEncoding
  
  /* 1 */ val MULTIPART: MULTIPART with scala.Double = js.native
  /* 2 */ val TEXT: TEXT with scala.Double = js.native
  /* 0 */ val URL: URL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitEncoding with scala.Double
  ] = js.native
}

