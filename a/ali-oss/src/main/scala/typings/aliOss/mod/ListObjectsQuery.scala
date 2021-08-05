package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectsQuery extends StObject {
  
  // search start from marker, including marker key
  var delimiter: js.UndefOr[String] = js.undefined
  
  // search object using prefix key
  var marker: js.UndefOr[String] = js.undefined
  
  // delimiter search scope e.g. / only search current dir, not including subdir
  var `max-keys`: String | Double
  
  var prefix: js.UndefOr[String] = js.undefined
}
object ListObjectsQuery {
  
  inline def apply(`max-keys`: String | Double): ListObjectsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max-keys")(`max-keys`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsQuery]
  }
  
  extension [Self <: ListObjectsQuery](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def `setMax-keys`(value: String | Double): Self = StObject.set(x, "max-keys", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
