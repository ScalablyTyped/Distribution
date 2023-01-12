package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsQuery extends StObject {
  
  /** the channel id marker (returns channels after this id) */
  var marker: String
  
  /** max number of channels to return */
  var `max-keys `: Double
  
  /** the channel id prefix (returns channels with this prefix) */
  var prefix: String
}
object ListChannelsQuery {
  
  inline def apply(marker: String, `max-keys `: Double, prefix: String): ListChannelsQuery = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("max-keys ")((`max-keys `).asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListChannelsQuery] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def `setMax-keys `(value: Double): Self = StObject.set(x, "max-keys ", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
