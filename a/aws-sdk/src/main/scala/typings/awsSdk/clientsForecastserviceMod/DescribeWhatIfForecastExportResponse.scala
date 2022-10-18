package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWhatIfForecastExportResponse extends StObject {
  
  /**
    * When the what-if forecast export was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var Destination: js.UndefOr[DataDestination] = js.undefined
  
  /**
    * The approximate time remaining to complete the what-if forecast export, in minutes.
    */
  var EstimatedTimeRemainingInMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * The format of the exported data, CSV or PARQUET.
    */
  var Format: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Format] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Message] = js.undefined
  
  /**
    * The status of the what-if forecast. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the what-if forecast export must be ACTIVE before you can access the forecast export. 
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
  
  /**
    * An array of Amazon Resource Names (ARNs) that represent all of the what-if forecasts exported in this resource.
    */
  var WhatIfForecastArns: js.UndefOr[LongArnList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast export.
    */
  var WhatIfForecastExportArn: js.UndefOr[LongArn] = js.undefined
  
  /**
    * The name of the what-if forecast export.
    */
  var WhatIfForecastExportName: js.UndefOr[Name] = js.undefined
}
object DescribeWhatIfForecastExportResponse {
  
  inline def apply(): DescribeWhatIfForecastExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWhatIfForecastExportResponse]
  }
  
  extension [Self <: DescribeWhatIfForecastExportResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDestination(value: DataDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setEstimatedTimeRemainingInMinutes(value: Long): Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeRemainingInMinutesUndefined: Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWhatIfForecastArns(value: LongArnList): Self = StObject.set(x, "WhatIfForecastArns", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastArnsUndefined: Self = StObject.set(x, "WhatIfForecastArns", js.undefined)
    
    inline def setWhatIfForecastArnsVarargs(value: LongArn*): Self = StObject.set(x, "WhatIfForecastArns", js.Array(value*))
    
    inline def setWhatIfForecastExportArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastExportArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastExportArnUndefined: Self = StObject.set(x, "WhatIfForecastExportArn", js.undefined)
    
    inline def setWhatIfForecastExportName(value: Name): Self = StObject.set(x, "WhatIfForecastExportName", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastExportNameUndefined: Self = StObject.set(x, "WhatIfForecastExportName", js.undefined)
  }
}
