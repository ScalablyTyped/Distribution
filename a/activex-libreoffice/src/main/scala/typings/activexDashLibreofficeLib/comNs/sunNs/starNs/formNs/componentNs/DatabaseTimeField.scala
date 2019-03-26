package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a data-aware field for inputting a time value. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.TimeField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultTime */ @js.native
trait DatabaseTimeField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel {
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    * @see com.sun.star.awt.UnoControlTimeFieldModel.Time
    * @see com.sun.star.form.XReset
    */
  var DefaultTime: scala.Double = js.native
}

