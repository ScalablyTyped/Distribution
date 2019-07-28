package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XReset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a component which allows the input of text, either single- or multi-line. */
@js.native
trait TextField
  extends RichTextControl
     with XReset {
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    * @see com.sun.star.awt.UnoControlEditModel.Text
    * @see com.sun.star.form.XReset
    */
  var DefaultText: String = js.native
}

