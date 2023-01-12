package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateFindingsUnprocessedFinding extends StObject {
  
  /**
    * The code associated with the error. Possible values are:    ConcurrentUpdateError - Another request attempted to update the finding while this request was being processed. This error may also occur if you call  BatchUpdateFindings  and  BatchImportFindings  at the same time.    DuplicatedFindingIdentifier - The request included two or more findings with the same FindingIdentifier.    FindingNotFound - The FindingIdentifier included in the request did not match an existing finding.    FindingSizeExceeded - The finding size was greater than the permissible value of 240 KB.    InternalFailure - An internal service failure occurred when updating the finding.    InvalidInput - The finding update contained an invalid value that did not satisfy the Amazon Web Services Security Finding Format syntax.  
    */
  var ErrorCode: NonEmptyString
  
  /**
    * The message associated with the error. Possible values are:    Concurrent finding updates detected     Finding Identifier is duplicated     Finding Not Found     Finding size exceeded 240 KB     Internal service failure     Invalid Input   
    */
  var ErrorMessage: NonEmptyString
  
  /**
    * The identifier of the finding that was not updated.
    */
  var FindingIdentifier: AwsSecurityFindingIdentifier
}
object BatchUpdateFindingsUnprocessedFinding {
  
  inline def apply(
    ErrorCode: NonEmptyString,
    ErrorMessage: NonEmptyString,
    FindingIdentifier: AwsSecurityFindingIdentifier
  ): BatchUpdateFindingsUnprocessedFinding = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], FindingIdentifier = FindingIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateFindingsUnprocessedFinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateFindingsUnprocessedFinding] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: NonEmptyString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setFindingIdentifier(value: AwsSecurityFindingIdentifier): Self = StObject.set(x, "FindingIdentifier", value.asInstanceOf[js.Any])
  }
}
