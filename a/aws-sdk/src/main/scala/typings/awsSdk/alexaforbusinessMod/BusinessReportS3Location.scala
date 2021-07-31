package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessReportS3Location extends StObject {
  
  /**
    * The S3 bucket name of the output reports.
    */
  var BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
  
  /**
    * The path of the business report.
    */
  var Path: js.UndefOr[BusinessReportS3Path] = js.undefined
}
object BusinessReportS3Location {
  
  @scala.inline
  def apply(): BusinessReportS3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReportS3Location]
  }
  
  @scala.inline
  implicit class BusinessReportS3LocationMutableBuilder[Self <: BusinessReportS3Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: CustomerS3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    @scala.inline
    def setPath(value: BusinessReportS3Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
