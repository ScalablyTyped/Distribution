package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a radio button which is data-aware, and can be bound to a database field. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.RadioButton because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultState, RefValue, UncheckedRefValue */ @js.native
trait DatabaseRadioButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel {
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    *
    * In a group of radio buttons only one button should be checked by default.
    * @see com.sun.star.awt.UnoControlRadioButtonModel.State
    * @see com.sun.star.form.XReset
    */
  var DefaultState: scala.Double = js.native
  /**
    * contains a reference value which is used for submission in a HTML form.
    *
    * If the form the control belongs to is to be submitted (see {@link com.sun.star.form.XSubmit} ), and the control is checked, this reference value is
    * used for submission.
    */
  var RefValue: java.lang.String = js.native
  /**
    * specifies a value which is to be associated with the control when it's **not** selected.
    *
    * In various situations, the {@link RefValue} is associated with the control if and only if it is selected. ; {@link UncheckedRefValue} provides a
    * extensions of this concept: If present, the value should be associated with the control when it is **not** selected.
    */
  var UncheckedRefValue: java.lang.String = js.native
}

