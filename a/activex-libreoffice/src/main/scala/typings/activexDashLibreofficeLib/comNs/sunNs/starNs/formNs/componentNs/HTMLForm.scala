package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XReset
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XSubmit {
  /** specifies the kind of encoding for submission. */
  var SubmitEncoding: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitEncoding = js.native
  /** specifies the kind of submission. */
  var SubmitMethod: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormSubmitMethod = js.native
  /** describes the frame, where to open the document specified by the TargetURL. */
  var TargetFrame: java.lang.String = js.native
  /** specifies the URL, which should be used for submission. */
  var TargetURL: java.lang.String = js.native
}

