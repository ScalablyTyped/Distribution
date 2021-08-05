package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsQuery extends StObject {
  
  // the channel id prefix (returns channels with this prefix)
  var marker: String
  
  // the channel id marker (returns channels after this id)
  var `max-keys `: Double
  
  var prefix: String
}
object ListChannelsQuery {
  
  inline def apply(marker: String, `max-keys `: Double, prefix: String): ListChannelsQuery = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("max-keys ")((`max-keys `).asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsQuery]
  }
  
  extension [Self <: ListChannelsQuery](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def `setMax-keys `(value: Double): Self = StObject.set(x, "max-keys ", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
