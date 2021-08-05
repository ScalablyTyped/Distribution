package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// parameters type
trait ListBucketsQueryType extends StObject {
  
  // search buckets using prefix key
  var marker: js.UndefOr[String] = js.undefined
  
  // search start from marker, including marker key
  var `max-keys`: js.UndefOr[String | Double] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
}
object ListBucketsQueryType {
  
  inline def apply(): ListBucketsQueryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsQueryType]
  }
  
  extension [Self <: ListBucketsQueryType](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def `setMax-keys`(value: String | Double): Self = StObject.set(x, "max-keys", value.asInstanceOf[js.Any])
    
    inline def `setMax-keysUndefined`: Self = StObject.set(x, "max-keys", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
