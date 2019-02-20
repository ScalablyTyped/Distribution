package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for commands like "open", "update", and "synchronize".
  *
  * This struct extends the original {@link OpenCommandArgument} , which must not be changed for compatibility reasons.
  * @see XCommandProcessor
  */
trait OpenCommandArgument2 extends OpenCommandArgument {
  /**
    * The sort criteria for the rows of the returned {@link ContentResultSet} .
    *
    * The result set implementation may ignore this parameter, if it cannot sort the data by the given criteria in an efficient way (i.e. directly using the
    * underlying data source -> SQL-database -> ORDER BY).
    */
  var SortingInfo: activexDashInteropLib.SafeArray[NumberedSortingInfo]
}

