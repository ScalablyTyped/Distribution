package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhatIfForecastSummary extends StObject {
  
  /**
    * When the what-if forecast was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The status of the what-if forecast. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the what-if analysis must be ACTIVE before you can access the analysis. 
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the what-if analysis that contains this what-if forecast.
    */
  var WhatIfAnalysisArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast.
    */
  var WhatIfForecastArn: js.UndefOr[LongArn] = js.undefined
  
  /**
    * The name of the what-if forecast.
    */
  var WhatIfForecastName: js.UndefOr[Name] = js.undefined
}
object WhatIfForecastSummary {
  
  inline def apply(): WhatIfForecastSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhatIfForecastSummary]
  }
  
  extension [Self <: WhatIfForecastSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWhatIfAnalysisArn(value: Arn): Self = StObject.set(x, "WhatIfAnalysisArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfAnalysisArnUndefined: Self = StObject.set(x, "WhatIfAnalysisArn", js.undefined)
    
    inline def setWhatIfForecastArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastArnUndefined: Self = StObject.set(x, "WhatIfForecastArn", js.undefined)
    
    inline def setWhatIfForecastName(value: Name): Self = StObject.set(x, "WhatIfForecastName", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastNameUndefined: Self = StObject.set(x, "WhatIfForecastName", js.undefined)
  }
}
