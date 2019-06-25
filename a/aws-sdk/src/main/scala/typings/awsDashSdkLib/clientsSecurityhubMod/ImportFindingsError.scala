package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportFindingsError extends js.Object {
  /**
    * The code of the error made during the BatchImportFindings operation.
    */
  var ErrorCode: NonEmptyString
  /**
    * The message of the error made during the BatchImportFindings operation.
    */
  var ErrorMessage: NonEmptyString
  /**
    * The ID of the error made during the BatchImportFindings operation.
    */
  var Id: NonEmptyString
}

object ImportFindingsError {
  @scala.inline
  def apply(ErrorCode: NonEmptyString, ErrorMessage: NonEmptyString, Id: NonEmptyString): ImportFindingsError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode, ErrorMessage = ErrorMessage, Id = Id)
  
    __obj.asInstanceOf[ImportFindingsError]
  }
}

