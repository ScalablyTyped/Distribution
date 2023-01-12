package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompatibleElasticsearchVersionsResponse extends StObject {
  
  /**
    *  A map of compatible Elasticsearch versions returned as part of the  GetCompatibleElasticsearchVersions  operation. 
    */
  var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.undefined
}
object GetCompatibleElasticsearchVersionsResponse {
  
  inline def apply(): GetCompatibleElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCompatibleElasticsearchVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCompatibleElasticsearchVersions(value: CompatibleElasticsearchVersionsList): Self = StObject.set(x, "CompatibleElasticsearchVersions", value.asInstanceOf[js.Any])
    
    inline def setCompatibleElasticsearchVersionsUndefined: Self = StObject.set(x, "CompatibleElasticsearchVersions", js.undefined)
    
    inline def setCompatibleElasticsearchVersionsVarargs(value: CompatibleVersionsMap*): Self = StObject.set(x, "CompatibleElasticsearchVersions", js.Array(value*))
  }
}
