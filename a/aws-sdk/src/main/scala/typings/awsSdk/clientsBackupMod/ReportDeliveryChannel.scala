package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportDeliveryChannel extends StObject {
  
  /**
    * A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
    */
  var Formats: js.UndefOr[FormatList] = js.undefined
  
  /**
    * The unique name of the S3 bucket that receives your reports.
    */
  var S3BucketName: String
  
  /**
    * The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
}
object ReportDeliveryChannel {
  
  inline def apply(S3BucketName: String): ReportDeliveryChannel = {
    val __obj = js.Dynamic.literal(S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDeliveryChannel]
  }
  
  extension [Self <: ReportDeliveryChannel](x: Self) {
    
    inline def setFormats(value: FormatList): Self = StObject.set(x, "Formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "Formats", js.undefined)
    
    inline def setFormatsVarargs(value: String*): Self = StObject.set(x, "Formats", js.Array(value*))
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
