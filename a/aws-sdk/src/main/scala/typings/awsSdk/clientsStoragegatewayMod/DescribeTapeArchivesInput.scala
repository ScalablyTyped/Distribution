package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTapeArchivesInput extends StObject {
  
  /**
    * Specifies that the number of virtual tapes described be limited to the specified number.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin describing virtual tapes.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
  
  /**
    * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
    */
  var TapeARNs: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeARNs] = js.undefined
}
object DescribeTapeArchivesInput {
  
  inline def apply(): DescribeTapeArchivesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapeArchivesInput]
  }
  
  extension [Self <: DescribeTapeArchivesInput](x: Self) {
    
    inline def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTapeARNs(value: TapeARNs): Self = StObject.set(x, "TapeARNs", value.asInstanceOf[js.Any])
    
    inline def setTapeARNsUndefined: Self = StObject.set(x, "TapeARNs", js.undefined)
    
    inline def setTapeARNsVarargs(value: TapeARN*): Self = StObject.set(x, "TapeARNs", js.Array(value*))
  }
}
