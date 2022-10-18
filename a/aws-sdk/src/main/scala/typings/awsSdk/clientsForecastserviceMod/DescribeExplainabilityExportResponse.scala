package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExplainabilityExportResponse extends StObject {
  
  /**
    * When the Explainability export was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var Destination: js.UndefOr[DataDestination] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability export.
    */
  var ExplainabilityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability export.
    */
  var ExplainabilityExportArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the Explainability export.
    */
  var ExplainabilityExportName: js.UndefOr[Name] = js.undefined
  
  /**
    * The format of the exported data, CSV or PARQUET.
    */
  var Format: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Format] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about any errors that occurred during the export.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Message] = js.undefined
  
  /**
    * The status of the Explainability export. States include:     ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object DescribeExplainabilityExportResponse {
  
  inline def apply(): DescribeExplainabilityExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExplainabilityExportResponse]
  }
  
  extension [Self <: DescribeExplainabilityExportResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDestination(value: DataDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setExplainabilityArn(value: Arn): Self = StObject.set(x, "ExplainabilityArn", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityArnUndefined: Self = StObject.set(x, "ExplainabilityArn", js.undefined)
    
    inline def setExplainabilityExportArn(value: Arn): Self = StObject.set(x, "ExplainabilityExportArn", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityExportArnUndefined: Self = StObject.set(x, "ExplainabilityExportArn", js.undefined)
    
    inline def setExplainabilityExportName(value: Name): Self = StObject.set(x, "ExplainabilityExportName", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityExportNameUndefined: Self = StObject.set(x, "ExplainabilityExportName", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
