package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceRegionMessage extends StObject {
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of SourceRegion instances that contains each source Amazon Web Services Region that the current Amazon Web Services Region can get a read replica or a DB snapshot from.
    */
  var SourceRegions: js.UndefOr[SourceRegionList] = js.undefined
}
object SourceRegionMessage {
  
  inline def apply(): SourceRegionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceRegionMessage]
  }
  
  extension [Self <: SourceRegionMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setSourceRegions(value: SourceRegionList): Self = StObject.set(x, "SourceRegions", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionsUndefined: Self = StObject.set(x, "SourceRegions", js.undefined)
    
    inline def setSourceRegionsVarargs(value: SourceRegion*): Self = StObject.set(x, "SourceRegions", js.Array(value*))
  }
}
