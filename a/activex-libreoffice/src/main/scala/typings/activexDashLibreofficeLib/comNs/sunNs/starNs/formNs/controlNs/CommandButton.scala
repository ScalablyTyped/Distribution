package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a button control.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.CommandButton} service.
  *
  * The control is clickable, the action taken upon clicking depends on the settings of the model the control belongs to.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  * @see com.sun.star.form.component.CommandButton.ButtonType
  */
trait CommandButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlButton
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XApproveActionBroadcaster

