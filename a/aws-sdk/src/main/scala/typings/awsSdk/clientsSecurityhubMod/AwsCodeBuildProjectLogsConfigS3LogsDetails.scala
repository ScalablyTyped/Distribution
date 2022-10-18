package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectLogsConfigS3LogsDetails extends StObject {
  
  /**
    * Whether to disable encryption of the S3 build log output.
    */
  var EncryptionDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the S3 bucket and the path prefix for S3 logs.
    */
  var Location: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current status of the S3 build logs.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCodeBuildProjectLogsConfigS3LogsDetails {
  
  inline def apply(): AwsCodeBuildProjectLogsConfigS3LogsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectLogsConfigS3LogsDetails]
  }
  
  extension [Self <: AwsCodeBuildProjectLogsConfigS3LogsDetails](x: Self) {
    
    inline def setEncryptionDisabled(value: Boolean): Self = StObject.set(x, "EncryptionDisabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabledUndefined: Self = StObject.set(x, "EncryptionDisabled", js.undefined)
    
    inline def setLocation(value: NonEmptyString): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
