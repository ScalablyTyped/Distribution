package typings.activexLibreoffice.com_.sun.star.form.control

import typings.activexLibreoffice.com_.sun.star.awt.UnoControlEdit
import typings.activexLibreoffice.com_.sun.star.awt.XSpinField
import typings.activexLibreoffice.com_.sun.star.form.XBoundControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control which can be used for inputting values with a arbitrary formatting, and can (but not necessarily has to) be bound to a database
  * field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.FormattedField} service.
  *
  * In addition, this control can be used in HTML forms. It triggers the {@link com.sun.star.form.XSubmit.submit()} method of the form it belongs to if
  * the **enter** key is pressed while it has the focus.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  * @see com.sun.star.util.XNumberFormatsSupplier
  */
@js.native
trait FormattedField
  extends UnoControlEdit
     with XSpinField
     with XBoundControl

