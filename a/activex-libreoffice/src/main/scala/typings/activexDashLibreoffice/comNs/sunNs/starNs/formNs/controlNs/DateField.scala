package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.controlNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControlDateField
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XBoundControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control which can be used for inputting date values, and which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.DateField} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
@js.native
trait DateField
  extends UnoControlDateField
     with XBoundControl

