package typings.aliOss.mod

import typings.aliOss.aliOssStrings._empty
import typings.aliOss.aliOssStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectsQuery extends StObject {
  
  /** only search current dir, not including subdir */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /** Specifies that the object names in the response are URL-encoded. */
  var `encoding-type`: js.UndefOr[url | _empty] = js.undefined
  
  /** search start from marker, including marker key */
  var marker: js.UndefOr[String] = js.undefined
  
  // delimiter search scope e.g.
  /** max objects, default is 100, limit to 1000 */
  var `max-keys`: String | Double
  
  /** search object using prefix key */
  var prefix: js.UndefOr[String] = js.undefined
}
object ListObjectsQuery {
  
  inline def apply(`max-keys`: String | Double): ListObjectsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max-keys")(`max-keys`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListObjectsQuery] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def `setEncoding-type`(value: url | _empty): Self = StObject.set(x, "encoding-type", value.asInstanceOf[js.Any])
    
    inline def `setEncoding-typeUndefined`: Self = StObject.set(x, "encoding-type", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def `setMax-keys`(value: String | Double): Self = StObject.set(x, "max-keys", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
