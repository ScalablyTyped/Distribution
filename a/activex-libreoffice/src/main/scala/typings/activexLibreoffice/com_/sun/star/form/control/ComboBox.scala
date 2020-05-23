package typings.activexLibreoffice.com_.sun.star.form.control

import typings.activexLibreoffice.com_.sun.star.awt.UnoControlEdit
import typings.activexLibreoffice.com_.sun.star.awt.XComboBox
import typings.activexLibreoffice.com_.sun.star.form.XBoundControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a combo box control.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.ComboBox} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
@js.native
trait ComboBox
  extends UnoControlEdit
     with XComboBox
     with XBoundControl

