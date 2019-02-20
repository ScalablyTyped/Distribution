package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * controls how a data pilot field's results are shown in relation to a selected reference result.
  * @see com.sun.star.sheet.DataPilotField
  */
trait DataPilotFieldReference extends js.Object {
  /** contains the reference field */
  var ReferenceField: java.lang.String
  /** contains the name of the reference item, when the {@link DataPilotFieldReference.ReferenceItemType} is NAMED otherwise is empty */
  var ReferenceItemName: java.lang.String
  /**
    * selects between a named reference item and using the previous or next item for each item from the reference field.
    * @see com.sun.star.sheet.DataPilotFieldReferenceItemType
    */
  var ReferenceItemType: scala.Double
  /**
    * contains the type of the reference.
    * @see com.sun.star.sheet.DataPilotFieldReferenceType
    */
  var ReferenceType: scala.Double
}

