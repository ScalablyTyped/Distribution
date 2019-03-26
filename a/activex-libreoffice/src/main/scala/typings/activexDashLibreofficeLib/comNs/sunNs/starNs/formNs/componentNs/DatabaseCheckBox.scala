package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a check box which is data-aware, and can be bound to a database field.
  *
  * Mostly, you will create data-aware checkboxes as tristate checkboxes, because this is a requirement to correctly handle `NULL` values in databases.
  * @see com.sun.star.awt.UnoControlCheckBoxModel.TriState
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.CheckBox because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultState, RefValue */ @js.native
trait DatabaseCheckBox
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel {
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    * @see com.sun.star.form.XReset
    */
  var DefaultState: scala.Double = js.native
  /**
    * contains a reference value which is used for submission in a HTML form
    *
    * When submitting a {@link HTMLForm} which contains a check box, which is checked, the RefValue is used for submission.
    */
  var RefValue: java.lang.String = js.native
}

