package typings.activexLibreoffice.com_.sun.star.form.component

import typings.activexLibreoffice.com_.sun.star.form.FormSubmitEncoding
import typings.activexLibreoffice.com_.sun.star.form.FormSubmitMethod
import typings.activexLibreoffice.com_.sun.star.form.XReset
import typings.activexLibreoffice.com_.sun.star.form.XSubmit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies the special kind of {@link Forms} for HTML documents.
  *
  * An {@link HTMLForm} fulfills the specification of forms in HTML. It supplies the possibility of submitting or resetting the contents of a form. For
  * more information on HTML forms, please see the documentation of HTML.
  */
@js.native
trait HTMLForm
  extends Form
     with XReset
     with XSubmit {
  /** specifies the kind of encoding for submission. */
  var SubmitEncoding: FormSubmitEncoding = js.native
  /** specifies the kind of submission. */
  var SubmitMethod: FormSubmitMethod = js.native
  /** describes the frame, where to open the document specified by the TargetURL. */
  var TargetFrame: String = js.native
  /** specifies the URL, which should be used for submission. */
  var TargetURL: String = js.native
}

