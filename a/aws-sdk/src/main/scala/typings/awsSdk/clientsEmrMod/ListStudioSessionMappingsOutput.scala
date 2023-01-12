package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudioSessionMappingsOutput extends StObject {
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
  
  /**
    * A list of session mapping summary objects. Each object includes session mapping details such as creation time, identity type (user or group), and Amazon EMR Studio ID.
    */
  var SessionMappings: js.UndefOr[SessionMappingSummaryList] = js.undefined
}
object ListStudioSessionMappingsOutput {
  
  inline def apply(): ListStudioSessionMappingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudioSessionMappingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStudioSessionMappingsOutput] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setSessionMappings(value: SessionMappingSummaryList): Self = StObject.set(x, "SessionMappings", value.asInstanceOf[js.Any])
    
    inline def setSessionMappingsUndefined: Self = StObject.set(x, "SessionMappings", js.undefined)
    
    inline def setSessionMappingsVarargs(value: SessionMappingSummary*): Self = StObject.set(x, "SessionMappings", js.Array(value*))
  }
}
