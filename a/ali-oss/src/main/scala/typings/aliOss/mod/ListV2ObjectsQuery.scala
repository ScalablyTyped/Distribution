package typings.aliOss.mod

import typings.aliOss.aliOssStrings._empty
import typings.aliOss.aliOssStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListV2ObjectsQuery extends StObject {
  
  /** search start from token, including token key */
  var `continuation-token`: js.UndefOr[String] = js.undefined
  
  /** only search current dir, not including subdir */
  var delimiter: js.UndefOr[String | Double] = js.undefined
  
  /** Specifies that the object names in the response are URL-encoded. */
  var `encoding-type`: js.UndefOr[url | _empty] = js.undefined
  
  /** Specifies whether to include the information about object owners in the response. */
  var `fetch-owner`: js.UndefOr[Boolean] = js.undefined
  
  /** max objects, default is 100, limit to 1000  */
  var `max-keys`: js.UndefOr[String] = js.undefined
  
  /** search object using prefix key */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the object from which the list operation begins.
    * If this parameter is specified, objects whose names are alphabetically greater than the start-after parameter value are returned.
    */
  var `start-after`: js.UndefOr[String] = js.undefined
}
object ListV2ObjectsQuery {
  
  inline def apply(): ListV2ObjectsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListV2ObjectsQuery]
  }
  
  extension [Self <: ListV2ObjectsQuery](x: Self) {
    
    inline def `setContinuation-token`(value: String): Self = StObject.set(x, "continuation-token", value.asInstanceOf[js.Any])
    
    inline def `setContinuation-tokenUndefined`: Self = StObject.set(x, "continuation-token", js.undefined)
    
    inline def setDelimiter(value: String | Double): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def `setEncoding-type`(value: url | _empty): Self = StObject.set(x, "encoding-type", value.asInstanceOf[js.Any])
    
    inline def `setEncoding-typeUndefined`: Self = StObject.set(x, "encoding-type", js.undefined)
    
    inline def `setFetch-owner`(value: Boolean): Self = StObject.set(x, "fetch-owner", value.asInstanceOf[js.Any])
    
    inline def `setFetch-ownerUndefined`: Self = StObject.set(x, "fetch-owner", js.undefined)
    
    inline def `setMax-keys`(value: String): Self = StObject.set(x, "max-keys", value.asInstanceOf[js.Any])
    
    inline def `setMax-keysUndefined`: Self = StObject.set(x, "max-keys", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def `setStart-after`(value: String): Self = StObject.set(x, "start-after", value.asInstanceOf[js.Any])
    
    inline def `setStart-afterUndefined`: Self = StObject.set(x, "start-after", js.undefined)
  }
}
