package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPositionResponse extends StObject {
  
  /**
    * The accuracy of the estimated position in meters. An empty value indicates that no position data is available. A value of ‘0.0’ value indicates that position data is available. This data corresponds to the position information that you specified instead of the position computed by solver.
    */
  var Accuracy: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Accuracy] = js.undefined
  
  /**
    * The position information of the resource.
    */
  var Position: js.UndefOr[PositionCoordinate] = js.undefined
  
  /**
    * The vendor of the positioning solver.
    */
  var SolverProvider: js.UndefOr[PositionSolverProvider] = js.undefined
  
  /**
    * The type of solver used to identify the position of the resource.
    */
  var SolverType: js.UndefOr[PositionSolverType] = js.undefined
  
  /**
    * The version of the positioning solver.
    */
  var SolverVersion: js.UndefOr[PositionSolverVersion] = js.undefined
  
  /**
    * The timestamp at which the device's position was determined.
    */
  var Timestamp: js.UndefOr[ISODateTimeString] = js.undefined
}
object GetPositionResponse {
  
  inline def apply(): GetPositionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPositionResponse]
  }
  
  extension [Self <: GetPositionResponse](x: Self) {
    
    inline def setAccuracy(value: Accuracy): Self = StObject.set(x, "Accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "Accuracy", js.undefined)
    
    inline def setPosition(value: PositionCoordinate): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    inline def setPositionVarargs(value: PositionCoordinateValue*): Self = StObject.set(x, "Position", js.Array(value*))
    
    inline def setSolverProvider(value: PositionSolverProvider): Self = StObject.set(x, "SolverProvider", value.asInstanceOf[js.Any])
    
    inline def setSolverProviderUndefined: Self = StObject.set(x, "SolverProvider", js.undefined)
    
    inline def setSolverType(value: PositionSolverType): Self = StObject.set(x, "SolverType", value.asInstanceOf[js.Any])
    
    inline def setSolverTypeUndefined: Self = StObject.set(x, "SolverType", js.undefined)
    
    inline def setSolverVersion(value: PositionSolverVersion): Self = StObject.set(x, "SolverVersion", value.asInstanceOf[js.Any])
    
    inline def setSolverVersionUndefined: Self = StObject.set(x, "SolverVersion", js.undefined)
    
    inline def setTimestamp(value: ISODateTimeString): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
