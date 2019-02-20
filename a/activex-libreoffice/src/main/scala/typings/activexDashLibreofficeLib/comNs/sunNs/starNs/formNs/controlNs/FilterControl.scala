package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a check box control which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.CheckBox} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
trait FilterControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl {
  def createWithFormat(
    MessageParent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    NumberFormatter: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatter,
    ControlModel: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  ): scala.Unit
}

