package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a formatted field model which is data-aware, and can be bound to a database field. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.FormattedField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait DatabaseFormattedField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel {
  /**
    * determines if an empty text should be treated as a `NULL` value.
    *
    * When the user enters text into a formatted field control, and after this, the control content is to be committed into the database field the control
    * is bound to, a decision must be made how to deal with empty strings. ;  This is controlled by {@link ConvertEmptyToNull} .
    *
    * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
    */
  var ConvertEmptyToNull: scala.Boolean = js.native
}

