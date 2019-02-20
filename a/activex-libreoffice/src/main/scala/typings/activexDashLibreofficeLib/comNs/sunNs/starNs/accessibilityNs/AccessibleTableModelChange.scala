package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure lets an event give access to a change of a table model.
  *
  * The data members of the {@link AccessibleTableModelChange} structure give access to the type and cell range of a change of a table model. See {@link
  * AccessibleTableModelChangeType} for details of the change type. The range of the affected rows, columns, and/or cells can be obtained by accessing the
  * other four data members.
  * @since OOo 1.1.2
  */
trait AccessibleTableModelChange extends js.Object {
  /**
    * The lowest index of a column that has changed.
    *
    * The first column that has been changed or contains modified cells.
    */
  var FirstColumn: scala.Double
  /**
    * The lowest index of a row that has changed.
    *
    * The first row that has been changed or that contains modified cells.
    */
  var FirstRow: scala.Double
  /**
    * The highest index of a column that has changed.
    *
    * The last column that has been changed or contains modified cells.
    */
  var LastColumn: scala.Double
  /**
    * The highest index of a row that has changed.
    *
    * The last row that has been changed or that contains modified cells.
    */
  var LastRow: scala.Double
  /**
    * The type of the event as defined in {@link AccessibleTableModelChangeType} .
    *
    * The model change either inserted or deleted one or more rows and/or columns or modified the content of a number of cells. See {@link
    * AccessibleTableModelChangeType} for details of the type of the model change.
    */
  var Type: scala.Double
}

