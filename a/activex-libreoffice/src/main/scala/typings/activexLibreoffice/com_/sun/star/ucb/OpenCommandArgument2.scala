package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
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
  var SortingInfo: SafeArray[NumberedSortingInfo]
}

object OpenCommandArgument2 {
  @scala.inline
  def apply(
    Mode: Double,
    Priority: Double,
    Properties: SafeArray[Property],
    Sink: XInterface,
    SortingInfo: SafeArray[NumberedSortingInfo]
  ): OpenCommandArgument2 = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any], SortingInfo = SortingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCommandArgument2]
  }
}

