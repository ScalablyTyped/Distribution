package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.DataAwareControlModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a date field which is data-aware, and can be bound to a database field. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs.DateField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultDate */ @js.native
trait DatabaseDateField extends DataAwareControlModel {
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    * @see com.sun.star.awt.UnoControlDateFieldModel.Date
    * @see com.sun.star.form.XReset
    */
  var DefaultDate: Double = js.native
}

