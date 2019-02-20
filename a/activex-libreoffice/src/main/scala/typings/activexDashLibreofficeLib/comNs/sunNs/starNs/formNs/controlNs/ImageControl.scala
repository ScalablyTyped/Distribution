package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control used for displaying images stored in a database.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.DatabaseImageControl} service.
  *
  * If the model of the control is valid bound to a database field, the control allows to select an image (browsing the file system) upon double clicking
  * into it, and forwards the URL of the chosen image to the ImageURL property of its model.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
trait ImageControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlImageControl
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XBoundControl

