package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.DataAwareControlModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a currency field which is data-aware, and can be bound to a database field. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs.CurrencyField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultValue */ @js.native
trait DatabaseCurrencyField extends DataAwareControlModel {
  /**
    * contains a default value for the control.
    * @see com.sun.star.awt.UnoControlCurrencyFieldModel.Value
    * @see com.sun.star.form.XReset
    */
  var DefaultValue: Double = js.native
}

