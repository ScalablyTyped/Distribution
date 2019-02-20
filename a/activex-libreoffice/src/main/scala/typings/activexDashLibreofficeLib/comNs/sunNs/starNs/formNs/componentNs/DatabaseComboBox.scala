package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a combo box which is data-aware, and can be bound to a database field.
  *
  * Like most other data aware controls, such a combo box will display the actual content of the field it is bound to. In addition, as a combo box
  * contains a list where the user can choose items to fill into the control, this list can be filled with different data from a database, too.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.ComboBox because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultText, getPropertyValues, getPropertyValues, setPropertyValues, setPropertyValues */ @js.native
trait DatabaseComboBox
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel {
  /**
    * determines if an empty text should be treated as a `NULL` value.
    *
    * When the user enters text into a combo box, and after this, the control content is to be committed into the database field the control is bound to, a
    * decision must be made how to deal with empty strings. ;  This is controlled by {@link ConvertEmptyToNull} .
    *
    * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
    */
  var ConvertEmptyToNull: scala.Boolean = js.native
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    * @see com.sun.star.awt.UnoControlComboBoxModel.Text
    * @see com.sun.star.form.XReset
    */
  var DefaultText: java.lang.String = js.native
  /**
    * describes the source of items in the combo box's list.
    *
    * The concrete meaning of this property depends on the value of {@link ListSourceType}
    */
  var ListSource: java.lang.String = js.native
  /**
    * specifies the kind of list source.
    *
    * Note: A value of com::sun::star::form::ListSourceType::VALUELIST is not valid for a combo box. It won't be rejected when setting it, but controls will
    * usually ignore it and leave the list empty.
    */
  var ListSourceType: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ListSourceType = js.native
}

