package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChangesetRequest extends StObject {
  
  /**
    * The unique identifier for the Changeset to update.
    */
  var changesetId: ChangesetId
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The unique identifier for the FinSpace Dataset in which the Changeset is created.
    */
  var datasetId: DatasetId
  
  /**
    * Options that define the structure of the source file(s) including the format type (formatType), header row (withHeader), data separation character (separator) and the type of compression (compression).   formatType is a required attribute and can have the following values:     PARQUET – Parquet source file format.    CSV – CSV source file format.    JSON – JSON source file format.    XML – XML source file format.   Here is an example of how you could specify the formatParams:   "formatParams": { "formatType": "CSV", "withHeader": "true", "separator": ",", "compression":"None" }   Note that if you only provide formatType as CSV, the rest of the attributes will automatically default to CSV values as following:   { "withHeader": "true", "separator": "," }    For more information about supported file formats, see Supported Data Types and File Formats in the FinSpace User Guide.
    */
  var formatParams: FormatParams
  
  /**
    * Options that define the location of the data being ingested (s3SourcePath) and the source of the changeset (sourceType). Both s3SourcePath and sourceType are required attributes. Here is an example of how you could specify the sourceParams:   "sourceParams": { "s3SourcePath": "s3://finspace-landing-us-east-2-bk7gcfvitndqa6ebnvys4d/scratch/wr5hh8pwkpqqkxa4sxrmcw/ingestion/equity.csv", "sourceType": "S3" }   The S3 path that you specify must allow the FinSpace role access. To do that, you first need to configure the IAM policy on S3 bucket. For more information, see Loading data from an Amazon S3 Bucket using the FinSpace APIsection.
    */
  var sourceParams: SourceParams
}
object UpdateChangesetRequest {
  
  inline def apply(
    changesetId: ChangesetId,
    datasetId: DatasetId,
    formatParams: FormatParams,
    sourceParams: SourceParams
  ): UpdateChangesetRequest = {
    val __obj = js.Dynamic.literal(changesetId = changesetId.asInstanceOf[js.Any], datasetId = datasetId.asInstanceOf[js.Any], formatParams = formatParams.asInstanceOf[js.Any], sourceParams = sourceParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChangesetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateChangesetRequest] (val x: Self) extends AnyVal {
    
    inline def setChangesetId(value: ChangesetId): Self = StObject.set(x, "changesetId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setFormatParams(value: FormatParams): Self = StObject.set(x, "formatParams", value.asInstanceOf[js.Any])
    
    inline def setSourceParams(value: SourceParams): Self = StObject.set(x, "sourceParams", value.asInstanceOf[js.Any])
  }
}
