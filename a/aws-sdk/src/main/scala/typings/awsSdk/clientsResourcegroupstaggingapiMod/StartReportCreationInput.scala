package typings.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReportCreationInput extends StObject {
  
  /**
    * The name of the Amazon S3 bucket where the report will be stored; for example:  awsexamplebucket  For more information on S3 bucket requirements, including an example bucket policy, see the example S3 bucket policy on this page.
    */
  var S3Bucket: typings.awsSdk.clientsResourcegroupstaggingapiMod.S3Bucket
}
object StartReportCreationInput {
  
  inline def apply(S3Bucket: S3Bucket): StartReportCreationInput = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReportCreationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReportCreationInput] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
  }
}
