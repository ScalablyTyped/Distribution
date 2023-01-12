package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTapeRecoveryPointsOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * An opaque string that indicates the position at which the virtual tape recovery points that were listed for description ended. Use this marker in your next request to list the next set of virtual tape recovery points in the list. If there are no more recovery points to describe, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
  
  /**
    * An array of TapeRecoveryPointInfos that are available for the specified gateway.
    */
  var TapeRecoveryPointInfos: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeRecoveryPointInfos] = js.undefined
}
object DescribeTapeRecoveryPointsOutput {
  
  inline def apply(): DescribeTapeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapeRecoveryPointsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTapeRecoveryPointsOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTapeRecoveryPointInfos(value: TapeRecoveryPointInfos): Self = StObject.set(x, "TapeRecoveryPointInfos", value.asInstanceOf[js.Any])
    
    inline def setTapeRecoveryPointInfosUndefined: Self = StObject.set(x, "TapeRecoveryPointInfos", js.undefined)
    
    inline def setTapeRecoveryPointInfosVarargs(value: TapeRecoveryPointInfo*): Self = StObject.set(x, "TapeRecoveryPointInfos", js.Array(value*))
  }
}
