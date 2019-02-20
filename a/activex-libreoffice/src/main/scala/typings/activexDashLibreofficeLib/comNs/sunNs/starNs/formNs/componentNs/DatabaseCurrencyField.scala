package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a currency field which is data-aware, and can be bound to a database field. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.CurrencyField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultValue, getPropertyValues, getPropertyValues, setPropertyValues, setPropertyValues */ @js.native
trait DatabaseCurrencyField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel {
  /**
    * contains a default value for the control.
    * @see com.sun.star.awt.UnoControlCurrencyFieldModel.Value
    * @see com.sun.star.form.XReset
    */
  var DefaultValue: scala.Double = js.native
}

