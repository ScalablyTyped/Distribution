package typings.activexLibreoffice.com_.sun.star.form.control

import typings.activexLibreoffice.com_.sun.star.awt.UnoControlEdit
import typings.activexLibreoffice.com_.sun.star.awt.XNumericField
import typings.activexLibreoffice.com_.sun.star.awt.XSpinField
import typings.activexLibreoffice.com_.sun.star.form.XBoundControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control for inputting numeric values and which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.NumericField} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
@js.native
trait NumericField
  extends UnoControlEdit
     with XSpinField
     with XNumericField
     with XBoundControl

