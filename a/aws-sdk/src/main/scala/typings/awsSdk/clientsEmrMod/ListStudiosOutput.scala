package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudiosOutput extends StObject {
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
  
  /**
    * The list of Studio summary objects.
    */
  var Studios: js.UndefOr[StudioSummaryList] = js.undefined
}
object ListStudiosOutput {
  
  inline def apply(): ListStudiosOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudiosOutput]
  }
  
  extension [Self <: ListStudiosOutput](x: Self) {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setStudios(value: StudioSummaryList): Self = StObject.set(x, "Studios", value.asInstanceOf[js.Any])
    
    inline def setStudiosUndefined: Self = StObject.set(x, "Studios", js.undefined)
    
    inline def setStudiosVarargs(value: StudioSummary*): Self = StObject.set(x, "Studios", js.Array(value*))
  }
}
