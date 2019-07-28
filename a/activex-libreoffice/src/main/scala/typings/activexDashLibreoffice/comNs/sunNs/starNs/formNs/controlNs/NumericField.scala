package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.controlNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControlNumericField
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XBoundControl
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
  extends UnoControlNumericField
     with XBoundControl

