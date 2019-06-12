package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDescribeMergeConflictsError extends js.Object {
  /**
    * The name of the exception.
    */
  var exceptionName: ExceptionName
  /**
    * The path to the file.
    */
  var filePath: Path
  /**
    * The message provided by the exception.
    */
  var message: Message
}

object BatchDescribeMergeConflictsError {
  @scala.inline
  def apply(exceptionName: ExceptionName, filePath: Path, message: Message): BatchDescribeMergeConflictsError = {
    val __obj = js.Dynamic.literal(exceptionName = exceptionName, filePath = filePath, message = message)
  
    __obj.asInstanceOf[BatchDescribeMergeConflictsError]
  }
}

