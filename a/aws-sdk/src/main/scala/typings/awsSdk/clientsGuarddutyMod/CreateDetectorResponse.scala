package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDetectorResponse extends StObject {
  
  /**
    * The unique ID of the created detector.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.DetectorId] = js.undefined
  
  /**
    * Specifies the data sources that couldn't be enabled when GuardDuty was enabled for the first time.
    */
  var UnprocessedDataSources: js.UndefOr[UnprocessedDataSourcesResult] = js.undefined
}
object CreateDetectorResponse {
  
  inline def apply(): CreateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorResponse]
  }
  
  extension [Self <: CreateDetectorResponse](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "DetectorId", js.undefined)
    
    inline def setUnprocessedDataSources(value: UnprocessedDataSourcesResult): Self = StObject.set(x, "UnprocessedDataSources", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedDataSourcesUndefined: Self = StObject.set(x, "UnprocessedDataSources", js.undefined)
  }
}
