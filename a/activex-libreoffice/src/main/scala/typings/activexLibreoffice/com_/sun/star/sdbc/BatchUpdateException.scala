package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is thrown when an error occurs during a batch update operation.
  *
  * In addition to the information provided by {@link com.sun.star.sdbc.SQLException} , a `BatchUpdateException` provides the update counts for all
  * commands that were executed successfully during the batch update, that is, all commands that were executed before the error occurred. The order of
  * elements in an array of update counts corresponds to the order in which commands were added to the batch.
  */
trait BatchUpdateException extends SQLException {
  /** is an array of `long` , with each element indicating the update count for a SQL command that executed successfully before the exception was thrown. */
  var UpdateCounts: SafeArray[Double]
}

object BatchUpdateException {
  @scala.inline
  def apply(
    Context: XInterface,
    ErrorCode: Double,
    Message: String,
    NextException: js.Any,
    SQLState: String,
    UpdateCounts: SafeArray[Double]
  ): BatchUpdateException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextException = NextException.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any], UpdateCounts = UpdateCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateException]
  }
}

