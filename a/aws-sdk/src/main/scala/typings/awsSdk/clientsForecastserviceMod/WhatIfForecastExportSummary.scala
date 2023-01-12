package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhatIfForecastExportSummary extends StObject {
  
  /**
    * When the what-if forecast export was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
    */
  var Destination: js.UndefOr[DataDestination] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The status of the what-if forecast export. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the what-if analysis must be ACTIVE before you can access the analysis. 
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
  
  /**
    * An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
    */
  var WhatIfForecastArns: js.UndefOr[WhatIfForecastArnListForExport] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast export.
    */
  var WhatIfForecastExportArn: js.UndefOr[LongArn] = js.undefined
  
  /**
    * The what-if forecast export name.
    */
  var WhatIfForecastExportName: js.UndefOr[Name] = js.undefined
}
object WhatIfForecastExportSummary {
  
  inline def apply(): WhatIfForecastExportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhatIfForecastExportSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhatIfForecastExportSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDestination(value: DataDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWhatIfForecastArns(value: WhatIfForecastArnListForExport): Self = StObject.set(x, "WhatIfForecastArns", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastArnsUndefined: Self = StObject.set(x, "WhatIfForecastArns", js.undefined)
    
    inline def setWhatIfForecastArnsVarargs(value: LongArn*): Self = StObject.set(x, "WhatIfForecastArns", js.Array(value*))
    
    inline def setWhatIfForecastExportArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastExportArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastExportArnUndefined: Self = StObject.set(x, "WhatIfForecastExportArn", js.undefined)
    
    inline def setWhatIfForecastExportName(value: Name): Self = StObject.set(x, "WhatIfForecastExportName", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastExportNameUndefined: Self = StObject.set(x, "WhatIfForecastExportName", js.undefined)
  }
}
