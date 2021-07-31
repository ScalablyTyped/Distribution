package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastReportGenerationExecutionError extends StObject {
  
  /**
    * The error code for the error that is returned when a usage report can't be generated.
    */
  var ErrorCode: js.UndefOr[UsageReportExecutionErrorCode] = js.undefined
  
  /**
    * The error message for the error that is returned when a usage report can't be generated.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
}
object LastReportGenerationExecutionError {
  
  @scala.inline
  def apply(): LastReportGenerationExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastReportGenerationExecutionError]
  }
  
  @scala.inline
  implicit class LastReportGenerationExecutionErrorMutableBuilder[Self <: LastReportGenerationExecutionError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: UsageReportExecutionErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
