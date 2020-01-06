package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeMergeConflictsError extends js.Object {
  /**
    * The name of the exception.
    */
  var exceptionName: ExceptionName = js.native
  /**
    * The path to the file.
    */
  var filePath: Path = js.native
  /**
    * The message provided by the exception.
    */
  var message: Message = js.native
}

object BatchDescribeMergeConflictsError {
  @scala.inline
  def apply(exceptionName: ExceptionName, filePath: Path, message: Message): BatchDescribeMergeConflictsError = {
    val __obj = js.Dynamic.literal(exceptionName = exceptionName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDescribeMergeConflictsError]
  }
}

