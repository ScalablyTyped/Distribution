package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportJournalToS3Request extends StObject {
  
  /**
    * The exclusive end date and time for the range of journal contents to export. The ExclusiveEndTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z. The ExclusiveEndTime must be less than or equal to the current UTC date and time.
    */
  var ExclusiveEndTime: js.Date
  
  /**
    * The inclusive start date and time for the range of journal contents to export. The InclusiveStartTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z. The InclusiveStartTime must be before ExclusiveEndTime. If you provide an InclusiveStartTime that is before the ledger's CreationDateTime, Amazon QLDB defaults it to the ledger's CreationDateTime.
    */
  var InclusiveStartTime: js.Date
  
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
  
  /**
    * The output format of your exported journal data. If this parameter is not specified, the exported data defaults to ION_TEXT format.
    */
  var OutputFormat: js.UndefOr[typings.awsSdk.clientsQldbMod.OutputFormat] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:   Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.   (Optional) Use your customer managed key in Key Management Service (KMS) for server-side encryption of your exported data.   To pass a role to QLDB when requesting a journal export, you must have permissions to perform the iam:PassRole action on the IAM role resource. This is required for all journal export requests.
    */
  var RoleArn: Arn
  
  /**
    * The configuration settings of the Amazon S3 bucket destination for your export request.
    */
  var S3ExportConfiguration: typings.awsSdk.clientsQldbMod.S3ExportConfiguration
}
object ExportJournalToS3Request {
  
  inline def apply(
    ExclusiveEndTime: js.Date,
    InclusiveStartTime: js.Date,
    Name: LedgerName,
    RoleArn: Arn,
    S3ExportConfiguration: S3ExportConfiguration
  ): ExportJournalToS3Request = {
    val __obj = js.Dynamic.literal(ExclusiveEndTime = ExclusiveEndTime.asInstanceOf[js.Any], InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3ExportConfiguration = S3ExportConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJournalToS3Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportJournalToS3Request] (val x: Self) extends AnyVal {
    
    inline def setExclusiveEndTime(value: js.Date): Self = StObject.set(x, "ExclusiveEndTime", value.asInstanceOf[js.Any])
    
    inline def setInclusiveStartTime(value: js.Date): Self = StObject.set(x, "InclusiveStartTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setS3ExportConfiguration(value: S3ExportConfiguration): Self = StObject.set(x, "S3ExportConfiguration", value.asInstanceOf[js.Any])
  }
}
