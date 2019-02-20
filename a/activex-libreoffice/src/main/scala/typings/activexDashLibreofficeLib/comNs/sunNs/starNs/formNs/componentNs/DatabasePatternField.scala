package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a data-aware control model for entering text which matches a specific pattern. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.PatternField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultText, getPropertyValues, getPropertyValues, setPropertyValues, setPropertyValues */ @js.native
trait DatabasePatternField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel {
  /**
    * determines if an empty text should be treated as a `NULL` value.
    *
    * When the user enters text into a pattern field, and after this, the control content is to be committed into the database field the control is bound
    * to, a decision must be made how to deal with empty strings. ;  This is controlled by this property.
    *
    * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
    */
  var ConvertEmptyToNull: scala.Boolean = js.native
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    * @see com.sun.star.awt.UnoControlPatternFieldModel.Text
    * @see com.sun.star.form.XReset
    */
  var DefaultText: java.lang.String = js.native
}

